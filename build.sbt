import java.nio.file.Files
import scala.scalanative.build.SourceLevelDebuggingConfig
import scala.scalanative.build.OptimizerConfig
import bindgen.plugin.BindgenMode
import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel
import java.nio.file.Paths

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeCentralSnapshots

lazy val Versions = new {
  val Scala = "3.3.7"
}

lazy val root = project
  .in(file("."))
  .aggregate(
    `tree-sitter`,
    cjson,
    cmark,
    curl,
    git,
    duckdb,
    git,
    libuv,
    lua,
    openssl,
    postgres,
    mysql,
    redis,
    rocksdb,
    sqlite,
    s2n,
    sdl3,
    sdl2,
    jni,
    ffmpeg
  )
  .settings(
    run := {}
  )

// Example of Tree Sitter binding usage:
// https://tree-sitter.github.io/tree-sitter/using-parsers#the-basic-objects
lazy val `tree-sitter` = project
  .in(file("bindings/tree-sitter"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("tree-sitter"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("tree-sitter"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes(
          "tree-sitter"
        ) / "tree_sitter" / "api.h",
        "treesitter"
      )
        .withCImports(
          List("tree_sitter/api.h")
        )
    },
    nativeConfig := {
      nativeConfig.value
        .withLinkingOptions(_ :+ buildScalaGrammar.value.toString)
    }
  )
  .settings(bindgenSettings)

lazy val cjson = project
  .in(file("bindings/cjson"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("cjson"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("cjson"),
    vcpkgNativeConfig ~= { _.addRenamedLibrary("cjson", "libcjson") },
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("cjson") / "cjson" / "cJSON.h",
        "cjson"
      )
        .withCImports(
          List("cJSON.h")
        )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

def runWithOverrides[T](
    state: State,
    projectRef: ProjectRef,
    task: TaskKey[T],
    overrides: Seq[Def.Setting[?]]
): T = {
  val extracted = Project.extract(state)
  val updatedState = extracted.appendWithSession(overrides, state)

  val (newState, result) =
    Project
      .extract(updatedState)
      .runTask(projectRef / task, updatedState)

  result
}

lazy val publishBindingsLocal = taskKey[Unit]("")
lazy val publishBindings = taskKey[Unit]("")

def publishingImpl(
    key: String,
    delegate: TaskKey[Unit],
    where: Option[Resolver] = None
) = Def.task {
  val initialState = state.value
  val tpr = thisProjectRef.value
  val log = sLog.value

  (Global / vcpkgVersions).value.get(key.toLowerCase()) match {
    case None =>
      log.error(s"Missing vcpkg version information for $key")
    case Some(pb) =>

      val snapshotVersion = pb.version + "-SNAPSHOT"
      val desc =
        s"$key bindings for Scala 3 Native ${if (pb.description == "") ""
          else ": " + pb.description}"
      val snapshotSettings = Seq(
        tpr / moduleName := key,
        tpr / organization := "com.indoorvivants.sn-bindings",
        tpr / version := snapshotVersion,
        tpr / delegate / skip := false,
        tpr / description := desc,
        tpr / publishTo := where
      )

      runWithOverrides(initialState, tpr, delegate, snapshotSettings)

    // val stableSettings = Seq(
    //   tpr / moduleName := key,
    //   tpr / organization := "com.indoorvivants.sn-bindings",
    //   tpr / version := pb.version + "-bindgen" + (tpr / bindgenVersion).value,
    //   tpr / publishLocal / skip := false,
    //   tpr / description := desc
    // )
    // runWithOverrides(initialState, tpr, publishLocal, stableSettings)
  }
}
def withPublishing(key: String) = Seq(
  publish / skip := true,
  publishLocal / skip := true,
  // publishingKey := key,
  publishLocal := {
    val log = sLog.value
    val org = organization.value
    val name = moduleName.value
    val ver = version.value
    log.info(s"Publishing $org::$name::$ver")
    publishLocal.value
  },
  publishBindingsLocal := publishingImpl(
    key,
    publishLocal
  ).value,
  publishBindings := publishingImpl(
    key,
    publish,
    Some(
      "central-snapshots" at "https://central.sonatype.com/repository/maven-snapshots/"
    )
  ).value
)

lazy val publishingKey = settingKey[String]("")

// this task parses the output of vcpkg json listing versions, and creates a Map of all installed
// packages and their versions
lazy val vcpkgVersions = taskKey[Map[String, PublishingInfo]]("")
Global / vcpkgVersions := {

  import upickle.default.*

  val vcpkg = (cjson / vcpkgManager).value

  val raw = vcpkg.pass(Seq("list", "--x-json")).mkString("\n")

  val json = read[Map[String, ujson.Obj]](raw)

  val mp = Map.newBuilder[String, PublishingInfo]

  json.foreach { case (_, obj) =>
    for {
      packageName <- obj.value.get("package_name").flatMap(_.strOpt)
      version <- obj.value.get("version").flatMap(_.strOpt)
      desc = obj.value
        .get("desc")
        .flatMap(_.arrOpt)
        .toVector
        .flatMap(_.flatMap(_.strOpt))
        .mkString("\n")
    } yield mp += packageName.toLowerCase -> PublishingInfo(
      version,
      desc.toString
    )
  }

  mp.result()
}

lazy val buildScalaGrammar =
  taskKey[File]("")

Global / buildScalaGrammar := {
  val tg =
    crossTarget.value / "tree-sitter-scala-build"
  val src =
    (baseDirectory.value) / "bindings" / "tree-sitter" / "tree-sitter-scala" / "src"
  val cSources =
    src.toGlob / "*.c"
  val hSources =
    src.toGlob / "*.h"
  val s =
    streams.value

  val files =
    (fileTreeView.value.list(cSources) ++
      fileTreeView.value.list(hSources)).map(_._1.toFile)

  Files.createDirectories(tg.toPath)
  IO.copyDirectory(src, tg)

  val cachedFun =
    FileFunction.cached(
      s.cacheDirectory / "tree-sitter-scala-build"
    ) { (in: Set[File]) =>
      Set(buildScalaGrammarImpl(files, tg, src, s.log))
    }
  cachedFun(files.toSet).headOption
    .getOrElse(sys.error("No static library produced"))
}

def buildScalaGrammarImpl(
    files: Seq[File],
    outDir: File,
    src: File,
    log: sbt.Logger
) = {
  import sbt.nio.file.FileTreeView
  val out =
    outDir / "libtree-sitter-scala.a"
  import scala.sys.process.*
  try {
    val cmd =
      List.newBuilder[String]

    val filePaths =
      files
        .flatMap(_.relativeTo(src))
        .map(s => outDir.toPath.resolve(s.toPath))
        .toSeq
        .map(_.toString)

    log.info(
      s"Building tree-sitter-scala from ${filePaths}, in $outDir"
    )

    cmd += "clang"
    cmd ++= filePaths
    cmd += "-fPIC"
    cmd += "-c"
    cmd += s"-I${src}"

    Process(
      command = cmd.result(),
      cwd = outDir
    ).!(log)

    val objectFiles =
      outDir.toGlob / ** / "*.o"

    val arCmd =
      List.newBuilder[String]
    arCmd += "ar"
    arCmd += "r"
    arCmd += out.name

    val objects = FileTreeView.nio
      .list(objectFiles)
      .map(_._1.toAbsolutePath.toString())

    assert(objects.nonEmpty, "No object files found in stage directory")
    arCmd ++= objects

    Process(
      arCmd.result(),
      cwd = outDir
    ).!(log)

    out
  } finally {
    // IO.delete(stage)
  }
}

lazy val curl = project
  .in(file("bindings/curl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("curl"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("curl"),
    vcpkgNativeConfig ~= { _.addRenamedLibrary("curl", "libcurl") },
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("curl") / "curl" / "curl.h",
        "curl"
      )
        .withCImports(
          List("curl/curl.h")
        )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val jni = project
  .in(file("bindings/jni"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(withPublishing("jni"))
  .settings(
    scalaVersion := Versions.Scala,
    bindgenBindings += {
      import Platform.OS.*
      val jni_md = Platform.target.os match {
        case Linux   => "linux"
        case MacOS   => "darwin"
        case Windows => "windows"
      }
      Binding(
        detectedJavaHome.value / "include/jni.h",
        "jni"
      ).withNoConstructor(Set("JNINativeInterface_"))
        .addClangFlag(
          "-I" + (detectedJavaHome.value / s"include/$jni_md").toString
        )
    },
    nativeConfig := {
      val conf = nativeConfig.value
      conf.withLinkingOptions(
        _ ++ Seq(
          "-L" + (detectedJavaHome.value / "lib").toString,
          "-ljli",
          "-L" + (detectedJavaHome.value / "lib/server").toString,
          "-ljvm",
          // Note that adding rpath like this makes the binary non portable,
          // but I don't know how else to fix the @rpath problem this creates
          "-Wl,-rpath",
          (detectedJavaHome.value / "lib").toString,
          "-Wl,-rpath",
          (detectedJavaHome.value / "lib/server").toString
        )
      )
    }
  )
  .settings(bindgenSettings)

val detectedJavaHome = settingKey[File]("")
ThisBuild / detectedJavaHome := {
  val fromEnv = sys.env.get("JAVA_HOME").map(new File(_))
  val log = sLog.value
  lazy val fromDiscovery = {
    val disc = (ThisBuild / discoveredJavaHomes).value
    disc
      .flatMap { case (v, loc) =>
        scala.util.Try(v.toInt).toOption.map(_ -> loc)
      }
      .toSeq
      .sortBy(_._1)
      .reverse
      .headOption
      .map(_._2)
      .map { loc =>
        log.warn(
          s"Selecting $loc by choosing the highest available version from discoveredJavaHomes (no othe options worked)"
        )
        loc
      }
  }

  (ThisBuild / javaHome).value
    .orElse(fromEnv)
    .orElse(fromDiscovery)
    .getOrElse(
      sys.error("No Java home detected!")
    )
}

lazy val git = project
  .in(file("bindings/git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("libgit2"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("libgit2"),
    bindgenBindings += {
      Binding(vcpkgConfigurator.value.includes("libgit2") / "git2.h", "libgit")
        .withLinkName("git2")
        .withCImports(List("git2.h"))
        .withLogLevel(bindgen.interface.LogLevel.Info)
        .withClangFlags(
          vcpkgConfigurator.value.pkgConfig
            .updateCompilationFlags(List("-fsigned-char"), "libgit2")
            .toList
        )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val postgres =
  project
    .in(file("bindings/postgres"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("libpq"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("libpq"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("libpq") / "libpq-fe.h",
          "libpq"
        )
          .withLinkName("pq")
          .withCImports(List("libpq-fe.h"))
          .withClangFlags(
            vcpkgConfigurator.value.pkgConfig
              .updateCompilationFlags(List("-std=gnu99"), "libpq")
              .toList
          )
      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val mysql =
  project
    .in(file("bindings/mysql"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("libmysql"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("libmysql", "openssl", "zlib"),
      // Mysql package in vcpkg is absolutely messed up
      vcpkgNativeConfig ~= { _.addRenamedLibrary("libmysql", "mysqlclient") },
      nativeConfig := {
        val config = nativeConfig.value
        config
          .withLinkingOptions(config.linkingOptions.flatMap {
            case "-lresolv-lresolv" => Some("-lresolv")
            case "-lm-lresolv"      => None
            case other              => Some(other)
          })
          .withCppOptions(_ :+ "-fcxx-exceptions")

      },
      bindgenBindings += {
        val actualIncludeFolder = new File(
          vcpkgConfigurator.value.pkgConfig
            .compilationFlags("mysqlclient")
            .toList
            .filter(_.contains("include/mysql"))
            .head
            .stripPrefix("-I")
        )

        Binding(actualIncludeFolder / "mysql.h", "libmysql")
          .withLinkName("mysqlclient")
          .withCImports(List("mysql/mysql.h"))
          .withClangFlags(
            vcpkgConfigurator.value.pkgConfig
              .updateCompilationFlags(List("-std=gnu99"), "mysqlclient")
              .toList
          )
      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val sqlite =
  project
    .in(file("bindings/sqlite"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("sqlite3"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("sqlite3"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("sqlite3") / "sqlite3.h",
          "libsqlite"
        )
          .withCImports(List("sqlite.h"))
          .withClangFlags(List("-fsigned-char"))

      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val sdl2 =
  project
    .in(file("bindings/sdl2"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("SDL2"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("sdl2"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("sdl2") / "SDL2" / "SDL.h",
          "sdl2"
        )
          .withCImports(List("SDL2/SDL.h"))
          .withClangFlags(List("-fsigned-char", "-DSDL_DISABLE_ARM_NEON_H=1"))
          .withMacros(Set("SDL_*", "AUDIO_*"))
      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val sdl3 =
  project
    .in(file("bindings/sdl3"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("SDL3"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("sdl3"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("sdl3") / "SDL3" / "SDL.h",
          "sdl3"
        )
          .withCImports(List("SDL3/SDL.h"))
          .withClangFlags(
            List(
              "-fsigned-char",
              "-DSDL_DISABLE_ARM_NEON_H=1",
              "-I" + vcpkgConfigurator.value.includes("sdl3").toString
            )
          )
          .withMacros(Set("SDL_*", "AUDIO_*"))

      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val redis =
  project
    .in(file("bindings/redis"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("hiredis"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("hiredis"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("hiredis") / "hiredis" / "hiredis.h",
          "libredis"
        )
          .withCImports(List("hiredis.h"))
          .withClangFlags(List("-fsigned-char"))

      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val cmark = project
  .in(file("bindings/cmark"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("cmark"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("cmark"),
    vcpkgNativeConfig ~= { _.addRenamedLibrary("cmark", "libcmark") },
    bindgenBindings += {
      Binding(vcpkgConfigurator.value.includes("cmark") / "cmark.h", "cmark")
        .withCImports(List("cmark.h"))
        .withClangFlags(
          vcpkgConfigurator.value.pkgConfig
            .updateCompilationFlags(List("-DCMARK_STATIC_DEFINE="), "libcmark")
            .toList
        )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val rocksdb = project
  .in(file("bindings/rocksdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("rocksdb"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("rocksdb", "zlib"),
    nativeConfig ~= { (_).withCppOptions(_ :+ "-fcxx-exceptions") },
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("rocksdb") / "rocksdb" / "c.h",
        "rocksdb"
      )
        .withCImports(List("rocksdb/c.h"))
        .withClangFlags(
          List("-I" + vcpkgConfigurator.value.includes("rocksdb"))
        )

    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val s2n = project
  .in(file("bindings/s2n"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("s2n"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("s2n", "openssl"),
    Compile / run / envVars := Map("S2N_DONT_MLOCK" -> "1"),
    bindgenBindings += {
      Binding(vcpkgConfigurator.value.includes("s2n") / "s2n.h", "s2n")
        .withCImports(List("s2n.h"))
        .withClangFlags(List("-I" + vcpkgConfigurator.value.includes("s2n")))

    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

val bindgenSettings = Seq(
  bindgenMode := BindgenMode.Manual(
    scalaDir = (Compile / sourceDirectory).value / "scala" / "generated",
    cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
  ),
  bindgenBindings := {
    bindgenBindings.value.map(_.withNoLocation(true))
  },
  bindgenBinary := sys.env
    .get("BINDGEN_BINARY")
    .map(new File(_))
    .getOrElse((bindgenBinary).value)
)

def configurePlatform(rename: String => String = identity) = Seq(
  nativeConfig := {
    val conf = nativeConfig.value
    val arch64 =
      if (
        Platform.arch == Platform.Arch.Arm && Platform.bits == Platform.Bits.x64
      )
        List("-arch", "arm64")
      else Nil

    conf
      .withLinkingOptions(
        conf.linkingOptions ++ arch64
      )
      .withCompileOptions(
        conf.compileOptions ++ arch64
      )
  }
)

lazy val duckdb = project
  .in(file("bindings/duckdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("duckdb"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("duckdb"),
    nativeConfig ~= { (_).withCppOptions(_ :+ "-fcxx-exceptions") },
    bindgenBindings := {
      Seq(
        Binding(
          vcpkgConfigurator.value.includes("duckdb") / "duckdb.h",
          "duckdb"
        )
          .withCImports(List("duckdb.h"))
          .withClangFlags(
            List(
              "-I" + vcpkgConfigurator.value.includes("duckdb").toString,
              "-fsigned-char"
            )
          )
      )
    }
  )
  .settings(bindgenSettings)

lazy val libuv = project
  .in(file("bindings/libuv"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("libuv"))
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("libuv"),
    bindgenBindings := {
      Seq(
        Binding(vcpkgConfigurator.value.includes("libuv") / "uv.h", "libuv")
          .withCImports(List("uv.h"))
          .withClangFlags(
            List(
              "-I" + vcpkgConfigurator.value.includes("libuv").toString
            )
          )
      )
    },
// https://github.com/libuv/libuv/issues/1160#issuecomment-727234957
    nativeConfig ~= { _.withCOptions(Seq("-std=gnu11")) }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val lua = project
  .in(file("bindings/lua"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("lua"))
  .settings(
    vcpkgDependencies := VcpkgDependencies("lua"),
    scalaVersion := Versions.Scala,
    bindgenBindings := {
      Seq(
        Binding((Compile / baseDirectory).value / "lua-amalgam.h", "lua")
          .withCImports(List("lua.h", "lauxlib.h", "lualib.h"))
          .withClangFlags(
            List(
              "-I" + vcpkgConfigurator.value.includes("lua").toString
            )
          )
      )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val ffmpeg =
  project
    .in(file("bindings/ffmpeg"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(withPublishing("ffmpeg"))
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("ffmpeg"),
      vcpkgNativeConfig ~= { _.withApproximate(false) },
      bindgenBindings += {
        Binding(
          header = (Compile / baseDirectory).value / "ffmpeg-amalgam.h",
          packageName = "ffmpeg"
        )
          .withCImports(
            List(
              "libavformat/avformat.h",
              "libavcodec/avcodec.h",
              "libavutil/avutil.h",
              "libavutil/log.h"
            )
          )
          .withClangFlags({
            val pkgs = Seq("libavformat", "libavcodec", "libavutil")
            val pkgConfig = vcpkgConfigurator.value.pkgConfig
            pkgs.flatMap(pkg => pkgConfig.compilationFlags(pkg))
          })
      },
      nativeConfig := {
        val pkgs = Seq("libavformat")
        val pkgConfig = vcpkgConfigurator.value.pkgConfig
        val compflags = pkgs.flatMap(pkg => pkgConfig.compilationFlags(pkg))
        val linkflags = pkgs.flatMap(pkg => pkgConfig.linkingFlags(pkg))
        nativeConfig.value
          .withCompileOptions(_ ++ compflags)
          .withLinkingOptions(_ ++ linkflags)
      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val openssl = project
  .in(file("bindings/openssl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(withPublishing("openssl"))
  .settings(
    vcpkgDependencies := VcpkgDependencies("openssl"),
    scalaVersion := Versions.Scala,
    nativeConfig ~= {
      (_).withSourceLevelDebuggingConfig(SourceLevelDebuggingConfig.enabled)
    },
    bindgenBindings := {
      Seq(
        Binding(
          (Compile / baseDirectory).value / "openssl-amalgam.h",
          "openssl"
        )
          .withCImports(
            List("openssl/sha.h", "openssl/evp.h")
          )
          .withClangFlags(
            List("-I" + vcpkgConfigurator.value.includes("openssl"))
          )
      )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

def getProjects(s: State): Seq[String] = {
  val extracted = Project.extract(s)
  val currentBuildUri = extracted.currentRef.build
  val buildStructure = extracted.structure
  val buildUnitsMap = buildStructure.units
  val currentBuildUnit = buildUnitsMap(currentBuildUri)
  val projectsMap = currentBuildUnit.defined
  projectsMap.values.map(_.id).toVector
}

def balancedPartitioner[A](strings: Vector[A], jobs: Int): Int => Vector[A] = {
  import scala.collection.mutable.ListBuffer
  val parts = Vector.fill(jobs)(ListBuffer.empty[A])
  var curIdx = 0
  val maxSize = strings.size / jobs

  strings.zipWithIndex.foreach { case (el, idx) =>
    if (parts(curIdx).size >= maxSize) {
      curIdx += 1
    }

    if (curIdx >= jobs) curIdx = 0

    parts(curIdx).+=(el)
  }

  jobId => parts.map(_.toVector).apply(jobId - 1)
}

import complete.DefaultParsers.*

def projectCommands(st: State) = {
  val exceptions: Set[String] =
    Set("root") ++ {
      if (sys.env.contains("CI")) {
        val platformSpecific = Platform.os match {
          // these require docker containers so we don't run them on CI
          case MacOS => Set("mysql", "postgres", "redis")
          case _     => Set.empty
        }

        platformSpecific
      } else Set.empty
    }

  getProjects(st).sorted.reverse
    .filterNot(exceptions.contains)
    .flatMap { projectName =>
      List(s"$projectName/run")
    }
}

ThisBuild / commands += Command.arb { s =>
  token(
    literal("runBatchedExamples") <~ Space
  ) ~ (IntBasic <~ Space) ~ (IntBasic)
} { case (st, t) =>
  val ((_, jobId), totalJobs) = t
  val commands = projectCommands(st)
  val partition = balancedPartitioner(commands.toVector, totalJobs)(jobId)

  println(s"COMMANDS ${partition}")

  partition.foldLeft(st) { case (s, n) =>
    n :: s
  }

}

ThisBuild / commands += Command.command("runExamples") { st =>
  projectCommands(st).foldLeft(st) { case (s, n) =>
    n :: s
  }

}
