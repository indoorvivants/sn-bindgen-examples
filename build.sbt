import bindgen.plugin.BindgenMode
import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel
import java.nio.file.Paths

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeRepo("snapshots")

lazy val Versions = new {
  val Scala = "3.3.1"
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
        cImports = List("tree_sitter/api.h")
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
        "cjson",
        cImports = List("cJSON.h")
      )
    }
  )
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
        "curl",
        cImports = List("curl/curl.h")
      )
    }
  )
  .settings(configurePlatform())

lazy val git = project
  .in(file("example-git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("libgit2"),
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
  .settings(configurePlatform())

lazy val kafka = project
  .in(file("example-kafka"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("librdkafka", "lz4", "openssl"),
    vcpkgNativeConfig ~= {
      _.addRenamedLibrary("librdkafka", "rdkafka-static")
    },
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("librdkafka") / "librdkafka" / "rdkafka.h",
        "librdkafka",
        linkName = Some("rdkafka"),
        cImports = List("rdkafka.h")
      )
    }
  )
  .settings(configurePlatform(), checkInBindings)

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
          "libpq",
          linkName = Some("pq"),
          cImports = List("libpq-fe.h"),
          clangFlags = vcpkgConfigurator.value.pkgConfig
            .updateCompilationFlags(List("-std=gnu99"), "libpq")
            .toList
        )
      }
    )
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

        Binding(
          actualIncludeFolder / "mysql.h",
          "libmysql",
          linkName = Some("mysqlclient"),
          cImports = List("mysql/mysql.h"),
          clangFlags = vcpkgConfigurator.value.pkgConfig
            .updateCompilationFlags(List("-std=gnu99"), "mysqlclient")
            .toList
        )
      },
      bindgenMode := BindgenMode.Manual(
        scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
        cDir = (Compile / resourceDirectory).value / "scala-native"
      )
    )
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
          "libsqlite",
          cImports = List("sqlite.h"),
          clangFlags = List("-fsigned-char")
        )
      }
    )
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
          "libredis",
          cImports = List("hiredis.h"),
          clangFlags = List("-fsigned-char")
        )
      }
    )
    .settings(configurePlatform())

lazy val cmark = project
  .in(file("example-cmark"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("cmark"),
    vcpkgNativeConfig ~= { _.addRenamedLibrary("cmark", "libcmark") },
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
        "rocksdb",
        cImports = List("rocksdb/c.h"),
        clangFlags = List("-I" + vcpkgConfigurator.value.includes("rocksdb"))
      )
    }
  )
  .settings(configurePlatform())

lazy val s2n = project
  .in(file("example-s2n"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("s2n", "openssl"),
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
  .settings(configurePlatform())

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
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("libuv"),
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
  .settings(configurePlatform())

lazy val lua = project
  .in(file("example-lua"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    vcpkgDependencies := VcpkgDependencies("lua"),
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
  .settings(configurePlatform())

lazy val openssl = project
  .in(file("example-openssl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    vcpkgDependencies := VcpkgDependencies("openssl"),
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

val checkInBindings = Seq(
  bindgenMode := BindgenMode.Manual(
    scalaDir =
      (Compile / sourceDirectory).value / "scala" / "generated",
    cDir = (Compile / resourceDirectory).value / "scala-native"
  )
)

ThisBuild / commands += Command.command("runExamples") { st =>
  projectCommands(st).foldLeft(st) { case (s, n) =>
    n :: s
  }

}
