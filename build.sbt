import bindgen.interface.Platform.OS.*
import bindgen.interface.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel
import java.nio.file.Paths

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeRepo("snapshots")

lazy val Versions = new {
  val Scala = "3.1.3"
}

// Example of Tree Sitter binding usage:
// https://tree-sitter.github.io/tree-sitter/using-parsers#the-basic-objects
lazy val `tree-sitter` = project
  .in(file("example-tree-sitter"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      // As we're not installing tree-sitter globally,
      // we're just point binaries to the location of compiled
      // dynamic libraries
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "tree-sitter").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "tree-sitter").toString
    ),
    // Generate bindings to Tree Sitter's main API
    bindgenBindings += {
      Binding(
        baseDirectory.value / "tree-sitter" / "lib" / "include" / "tree_sitter" / "api.h",
        "treesitter",
        linkName = Some("tree-sitter"),
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

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-ltree-sitter",
            s"-L$base"
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
        vcpkgManager.value.includes("cjson") / "cjson" / "cJSON.h",
        "cjson",
        cImports = List("cJSON.h")
      )
    }
  )
  .settings(vcpkgNativeConfig { case "cjson" =>
    "libcjson"
  })

lazy val git = project
  .in(file("example-git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("libgit2"),
    bindgenBindings += {
      Binding(
        vcpkgManager.value.includes("libgit2") / "git2.h",
        "libgit",
        linkName = Some("git2"),
        cImports = List("git2.h"),
        clangFlags = vcpkgConfigurator.value
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
          vcpkgManager.value.includes("libpq") / "libpq-fe.h",
          "libpq",
          linkName = Some("pq"),
          cImports = List("libpq-fe.h"),
          clangFlags = vcpkgConfigurator.value
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
          vcpkgManager.value.includes("sqlite3") / "sqlite3.h",
          "libsqlite",
          cImports = List("sqlite.h"),
          clangFlags = List("-fsigned-char")
        )
      }
    )
    .settings(vcpkgNativeConfig())

lazy val civetweb =
  project
    .in(file("example-civetweb"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      bindgenBindings += {
        Binding(
          baseDirectory.value / "civetweb" / "include" / "civetweb.h",
          "civetweb",
          cImports = List("civetweb.h"),
          clangFlags = List("-fsigned-char")
        )
      },
      nativeConfig := {
        val fullPath = baseDirectory.value / "civetweb" / "libcivetweb.a"
        val conf = nativeConfig.value

        conf.withLinkingOptions(
          conf.linkingOptions :+ fullPath.toString
        )
      }
    )

lazy val redis =
  project
    .in(file("example-redis"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      vcpkgDependencies := Set("hiredis"),
      bindgenBindings += {
        Binding(
          vcpkgManager.value.includes("hiredis") / "hiredis" / "hiredis.h",
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
        vcpkgManager.value.includes("cmark") / "cmark.h",
        "cmark",
        cImports = List("cmark.h"),
        clangFlags = vcpkgConfigurator.value
          .updateCompilationFlags(List("-DCMARK_STATIC_DEFINE="), "libcmark")
          .toList
      )
    }
  )
  .settings(vcpkgNativeConfig { case "cmark" =>
    "libcmark"
  })

lazy val rocksdb = project
  .in(file("example-rocksdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := Set("rocksdb", "zlib"),
    bindgenBindings += {
      Binding(
        vcpkgManager.value.includes("rocksdb") / "rocksdb" / "c.h",
        "rocksdb",
        cImports = List("rocksdb/c.h"),
        clangFlags = List("-I" + vcpkgManager.value.includes("rocksdb"))
      )
    }
  )
  .settings(vcpkgNativeConfig())

def vcpkgNativeConfig(rename: String => String = identity) = Seq(
  nativeConfig := {
    val configurator = vcpkgConfigurator.value
    val manager = vcpkgManager.value
    val conf = nativeConfig.value
    val deps = vcpkgDependencies.value.toSeq.map(rename)

    val files = deps.map(d => manager.files(d))

    val compileArgsApprox = files.flatMap { f =>
      List("-I" + f.includeDir.toString)
    }
    val linkingArgsApprox = files.flatMap { f =>
      List("-L" + f.libDir) ++ f.staticLibraries.map(_.toString)
    }

    import scala.util.control.NonFatal

    def updateLinkingFlags(current: Seq[String], deps: String*) =
      try {
        configurator.updateLinkingFlags(
          current,
          deps*
        )
      } catch {
        case NonFatal(exc) =>
          linkingArgsApprox
      }

    def updateCompilationFlags(current: Seq[String], deps: String*) =
      try {
        configurator.updateCompilationFlags(
          current,
          deps*
        )
      } catch {
        case NonFatal(exc) =>
          compileArgsApprox
      }

    val arch64 =
      if (Platform.arch == Platform.Arch.aarch64)
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
          vcpkgManager.value.includes("libuv") / "uv.h",
          "libuv",
          cImports = List("uv.h"),
          clangFlags = List(
            "-I" + vcpkgManager.value.includes("libuv").toString
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
            "-I" + vcpkgManager.value.includes("lua").toString
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
          clangFlags = List("-I" + vcpkgManager.value.includes("openssl"))
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

ThisBuild / commands += Command.command("runExamples") { st =>
  val exceptions: Set[String] =
    if (sys.env.contains("CI"))
      Platform.os match {
        // this require docker containers so we don't run them on CI
        case MacOS => Set("postgres", "redis")
        case _     => Set.empty
      }
    else Set.empty

  getProjects(st)
    .filterNot(exceptions.contains)
    .map(_ + "/run")
    .foldLeft(st) { case (s, n) =>
      n :: s
    }

}

