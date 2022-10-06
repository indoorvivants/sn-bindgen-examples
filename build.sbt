import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel
import java.nio.file.Paths

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeRepo("snapshots")

lazy val Versions = new {
  val Scala = "3.2.0"
}

lazy val root = project
  .in(file("."))
  .aggregate(
    `tree-sitter`,
    cjson,
    cmark,
    git,
    duckdb,
    git,
    libuv,
    lua,
    openssl,
    postgres,
    redis,
    rocksdb,
    sqlite,
    s2n
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
        "treesitter",
        cImports = List("tree_sitter/api.h"),
        clangFlags = List("-std=gnu99")
      )
    },
    // Copy generated Scala parser
    Compile / resourceGenerators += Def.task {
      val scalaParserLocation =
        baseDirectory.value / "tree-sitter-scala" / "src"
      val resourcesFolder = (Compile / resourceManaged).value / "scala-native"

      val fileNames = List("parser.c", "scanner.c")

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
          conf.compileOptions ++ List(s"-I${base / "lib" / "include"}")
        )
    }
  )

lazy val cjson = project
  .in(file("example-cjson"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("cjson"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("cjson") / "cjson" / "cJSON.h",
        "cjson",
        cImports = List("cJSON.h")
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val git = project
  .in(file("example-git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("libgit2"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("libgit2") / "git2.h",
        "libgit",
        linkName = Some("git2"),
        cImports = List("git2.h"),
        clangFlags = vcpkgConfigurator.value.pkgConfig
          .updateCompilationFlags(List("-fsigned-char"), "libgit2")
          .toList
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val postgres =
  project
    .in(file("example-postgres"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := Set("libpq"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("libpq") / "libpq-fe.h",
          "libpq",
          linkName = Some("pq"),
          cImports = List("libpq-fe.h"),
          clangFlags = vcpkgConfigurator.value.pkgConfig
            .updateCompilationFlags(List("-std=gnu99"), "libpq")
            .toList
        )
      }
    )
    .settings(vcpkgNativeConfig())

lazy val sqlite =
  project
    .in(file("example-sqlite"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := Set("sqlite3"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("sqlite3") / "sqlite3.h",
          "libsqlite",
          cImports = List("sqlite.h"),
          clangFlags = List("-fsigned-char")
        )
      }
    )
    .settings(vcpkgNativeConfig())

lazy val redis =
  project
    .in(file("example-redis"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := Set("hiredis"),
      bindgenBindings += {
        Binding(
          vcpkgConfigurator.value.includes("hiredis") / "hiredis" / "hiredis.h",
          "libredis",
          cImports = List("hiredis.h"),
          clangFlags = List("-fsigned-char")
        )
      }
    )
    .settings(vcpkgNativeConfig())

lazy val cmark = project
  .in(file("example-cmark"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("cmark"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("cmark") / "cmark.h",
        "cmark",
        cImports = List("cmark.h"),
        clangFlags = vcpkgConfigurator.value.pkgConfig
          .updateCompilationFlags(List("-DCMARK_STATIC_DEFINE="), "libcmark")
          .toList
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val rocksdb = project
  .in(file("example-rocksdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("rocksdb", "zlib"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("rocksdb") / "rocksdb" / "c.h",
        "rocksdb",
        cImports = List("rocksdb/c.h"),
        clangFlags = List("-I" + vcpkgConfigurator.value.includes("rocksdb"))
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val s2n = project
  .in(file("example-s2n"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("s2n", "openssl"),
    Compile / run / envVars := Map("S2N_DONT_MLOCK" -> "1"),
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("s2n") / "s2n.h",
        "s2n",
        cImports = List("s2n.h"),
        clangFlags = List("-I" + vcpkgConfigurator.value.includes("s2n"))
      )
    }
  )
  .settings(vcpkgNativeConfig())

def vcpkgNativeConfig(rename: String => String = identity) = Seq(
  nativeConfig := {
    val configurator = vcpkgConfigurator.value
    val conf = nativeConfig.value
    val deps = vcpkgDependencies.value.toSeq.map(rename)

    val files = deps.map(d => configurator.files(d))

    val compileArgsApprox = files.flatMap { f =>
      List("-I" + f.includeDir.toString)
    }
    val linkingArgsApprox = files.flatMap { f =>
      List("-L" + f.libDir) ++ f.staticLibraries.map(_.toString)
    }

    import scala.util.control.NonFatal

    def updateLinkingFlags(current: Seq[String], deps: String*) =
      try {
        configurator.pkgConfig.updateLinkingFlags(
          current,
          deps*
        )
      } catch {
        case NonFatal(exc) =>
          linkingArgsApprox
      }

    def updateCompilationFlags(current: Seq[String], deps: String*) =
      try {
        configurator.pkgConfig.updateCompilationFlags(
          current,
          deps*
        )
      } catch {
        case NonFatal(exc) =>
          compileArgsApprox
      }

    val arch64 =
      if (
        Platform.arch == Platform.Arch.Arm && Platform.bits == Platform.Bits.x64
      )
        List("-arch", "arm64")
      else Nil

    conf
      .withLinkingOptions(
        updateLinkingFlags(
          conf.linkingOptions ++ arch64,
          deps*
        )
      )
      .withCompileOptions(
        updateCompilationFlags(
          conf.compileOptions ++ arch64,
          deps*
        )
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
        "duckdb",
        linkName = Some("duckdb"),
        cImports = List("duckdb.h"),
        clangFlags = List(s"-I$bd", "-fsigned-char")
      )
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

lazy val libuv = project
  .in(file("example-libuv"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("libuv"),
    bindgenBindings := {
      Seq(
        Binding(
          vcpkgConfigurator.value.includes("libuv") / "uv.h",
          "libuv",
          cImports = List("uv.h"),
          clangFlags = List(
            "-I" + vcpkgConfigurator.value.includes("libuv").toString
          )
        )
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val lua = project
  .in(file("example-lua"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    vcpkgDependencies := Set("lua"),
    scalaVersion := Versions.Scala,
    bindgenBindings := {
      Seq(
        Binding(
          (Compile / baseDirectory).value / "lua-amalgam.h",
          "lua",
          cImports = List("lua.h", "lauxlib.h", "lualib.h"),
          clangFlags = List(
            "-I" + vcpkgConfigurator.value.includes("lua").toString
          )
        )
      )
    }
  )
  .settings(vcpkgNativeConfig())

lazy val openssl = project
  .in(file("example-openssl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    vcpkgDependencies := Set("openssl"),
    scalaVersion := Versions.Scala,
    bindgenBindings := {
      Seq(
        Binding(
          (Compile / baseDirectory).value / "openssl-amalgam.h",
          "openssl",
          cImports = List("openssl/sha.h", "openssl/evp.h"),
          clangFlags = List("-I" + vcpkgConfigurator.value.includes("openssl"))
        )
      )
    }
  )
  .settings(vcpkgNativeConfig())

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
        // postgres, redis - these require docker containers so we don't run them on CI
        case MacOS => Set("postgres", "redis")
        case _     => Set.empty
      }

      platformSpecific ++ Set("duckdb", "rocksdb")
    } else Set.empty

  getProjects(st).sorted.reverse
    .filterNot(exceptions.contains)
    .flatMap { projectName =>
      List(s"$projectName/run", s"show $projectName/nativeConfig")
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

  partition.foldLeft(st) { case (s, n) =>
    n :: s
  }

}

ThisBuild / commands += Command.command("runExamples") { st =>
  projectCommands(st).foldLeft(st) { case (s, n) =>
    n :: s
  }

}
