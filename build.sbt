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
    jni,
    ffmpeg
  )
  .settings(
    run := {}
  )

// Example of Tree Sitter binding usage:
// https://tree-sitter.github.io/tree-sitter/using-parsers#the-basic-objects
lazy val `tree-sitter` = project
  .in(file("example-tree-sitter"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    // Generate bindings to Tree Sitter's main API
    bindgenBindings += {
      Binding(
        baseDirectory.value / "tree-sitter" / "lib" / "include" / "tree_sitter" / "api.h",
        "treesitter"
      )
        .withCImports(
          List("tree_sitter/api.h")
        )
    },
    // Copy generated Scala parser
    Compile / resourceGenerators += Def.task {
      val scalaParserLocation =
        baseDirectory.value / "tree-sitter-scala" / "src"
      val resourcesFolder = (Compile / resourceManaged).value / "scala-native"

      val fileNames = List("parser.c", "scanner.c", "stack.h")

      fileNames.foreach { fileName =>
        IO.copyFile(scalaParserLocation / fileName, resourcesFolder / fileName)
      }

      fileNames.map(fileName => resourcesFolder / fileName)
    },
    nativeConfig := {
      val base = baseDirectory.value / "tree-sitter"
      val conf = nativeConfig.value
      val staticLib = base / "libtree-sitter.a"

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            staticLib.toString
          )
        )
        .withCompileOptions(
          List(s"-I${base / "lib" / "include"}") ++ conf.compileOptions
        )
    }
  )
  .settings(bindgenSettings)

lazy val cjson = project
  .in(file("example-cjson"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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

lazy val curl = project
  .in(file("example-curl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
  .in(file("example-jni"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
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
  .in(file("example-git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
    .in(file("example-postgres"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
    .in(file("example-mysql"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("libmysql", "openssl", "zlib"),
      // Mysql package in vcpkg is absolutely messed up
      vcpkgNativeConfig ~= { _.addRenamedLibrary("libmysql", "mysqlclient") },
      nativeConfig := {

        val config = nativeConfig.value
        config.withLinkingOptions(config.linkingOptions.flatMap {
          case "-lresolv-lresolv" => Some("-lresolv")
          case "-lm-lresolv"      => None
          case other              => Some(other)
        })

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
    .in(file("example-sqlite"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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

lazy val redis =
  project
    .in(file("example-redis"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
  .in(file("example-cmark"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
  .in(file("example-rocksdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("rocksdb", "zlib"),
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
  .in(file("example-s2n"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
  }
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
  .in(file("example-duckdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "duckdb" / "build" / "debug" / "src").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "duckdb" / "build" / "debug" / "src").toString
    ),
    // Generate bindings to Tree Sitter's main API
    bindgenBindings += {
      val bd = (baseDirectory.value / "duckdb" / "src" / "include")
      Binding(
        baseDirectory.value / "duckdb" / "src" / "include" / "duckdb.h",
        "duckdb"
      )
        .withLinkName("duckdb")
        .withCImports(List("duckdb.h"))
        .withClangFlags(List(s"-I$bd", "-fsigned-char"))

    },
    nativeConfig := {
      val base = baseDirectory.value / "duckdb"
      val libFolder = base / "build" / "debug" / "src"
      val headersFolder = base / "src" / "include"
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-lduckdb",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
        )
    }
  )
  .settings(bindgenSettings)

lazy val libuv = project
  .in(file("example-libuv"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
    nativeConfig ~= { _.withCOptions(Seq("-std=gnu11")) }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val lua = project
  .in(file("example-lua"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
    .in(file("example-ffmpeg"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := VcpkgDependencies("ffmpeg"),
      vcpkgNativeConfig ~= { _.withApproximate(false) },
      bindgenBindings += {
        Binding(
          headerFile = (Compile / baseDirectory).value / "ffmpeg-amalgam.h",
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
          .withLinkName("ffmpeg_wrapper")
          .withClangFlags(
            List("-I" + vcpkgConfigurator.value.includes("ffmpeg"))
          )
        // .withLogLevel(bindgen.interface.LogLevel.Trace)
      }
    )
    .settings(bindgenSettings)
    .settings(configurePlatform())

lazy val openssl = project
  .in(file("example-openssl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
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
    if (sys.env.contains("CI")) {
      val platformSpecific = Platform.os match {
        // these require docker containers so we don't run them on CI
        case MacOS => Set("mysql", "postgres", "redis")
        case _     => Set.empty
      }

      platformSpecific ++ Set("duckdb", "rocksdb")
    } else Set.empty

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
