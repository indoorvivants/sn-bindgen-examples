import bindgen.interface.Platform
import bindgen.interface.LogLevel
import java.nio.file.Paths

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeRepo("snapshots")

lazy val Versions = new {
  val Scala = "3.1.1"
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
    Bindgen.bindings := {
      val extraFlags = {
        val clang = nativeConfig.value.clang

        val ci = Platform.detectClangInfo(clang)

        val clangInclude = ci.includePaths.map("-I" + _)
        val llvmInclude = ci.llvmInclude.map("-I" + _)

        clangInclude ++ llvmInclude
      }

      { builder =>
        builder.define(
          baseDirectory.value / "tree-sitter" / "lib" / "include" / "tree_sitter" / "api.h",
          "treesitter",
          linkName = Some("tree-sitter"),
          cImports = List("tree_sitter/api.h"),
          clangFlags = List("-std=gnu99") ++ extraFlags
        )

      }
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

// Example of cJSON binding usage
// https://github.com/DaveGamble/cJSON
lazy val cjson = project
  .in(file("example-cjson"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      // As we're not installing tree-sitter globally,
      // we're just point binaries to the location of compiled
      // dynamic libraries
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "cJSON" / "build").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "cJSON" / "build").toString
    ),
    // Generate bindings to Tree Sitter's main API
    Bindgen.bindings := { builder =>
      builder.define(
        baseDirectory.value / "cJSON" / "cJSON.h",
        "cjson",
        linkName = Some("cjson"),
        cImports = List("cJSON.h")
      )
    },
    nativeConfig := {
      val base = baseDirectory.value / "cJSON"
      val libFolder = base / "build"
      val headersFolder = base // cJSON puts headers in root
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-lcjson",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
        )
    }
  )

lazy val libgit2 = project
  .in(file("example-git"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      // As we're not installing libgit globally,
      // we're just point binaries to the location of compiled
      // dynamic libraries
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "libgit2" / "build").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "libgit2" / "build").toString
    ),
    // Generate bindings to Tree Sitter's main API
    Bindgen.bindings := { builder =>
      val gitinclude = baseDirectory.value / "libgit2" / "include"

      builder.define(
        gitinclude / "git2.h",
        "libgit",
        linkName = Some("git2"),
        cImports = List("git2.h"),
        clangFlags = List(s"-I$gitinclude")
      )
    },
    nativeConfig := {
      val base = baseDirectory.value / "libgit2"
      val libFolder = base / "build"
      val headersFolder = base / "include"
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-lgit2",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
        )
    }
  )

lazy val postgres =
  project
    .in(file("example-postgres"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      // Generate bindings to Postgres main API
      Bindgen.bindings := { builder =>
        builder.define(
          postgresHeader.toFile(),
          "libpq",
          linkName = Some("pq"),
          cImports = List("libpq-fe.h"),
          clangFlags = List("-std=gnu99") ++ List(s"-I$postgresInclude")
        )

      },
      nativeConfig ~= { conf =>
        conf.withLinkingOptions(
          conf.linkingOptions ++ postgresLib.toList.map("-L" + _)
        )
      }
    )

def postgresInclude = {
  import Platform.*
  (os, arch) match {
    case (OS.Linux, _) => Paths.get("/usr/include/postgresql/")
    case (OS.MacOS, Arch.aarch64) =>
      Paths.get("/opt/homebrew/opt/libpq/include/")
    case (OS.MacOS, Arch.x86_64) => Paths.get("/usr/local/opt/libpq/include/")
  }
}

def postgresLib = {
  import Platform.*
  (os, arch) match {
    case (OS.MacOS, Arch.aarch64) =>
      Some(Paths.get("/opt/homebrew/opt/libpq/lib/"))
    case (OS.MacOS, Arch.x86_64) =>
      Some(Paths.get("/usr/local/opt/libpq/lib/"))
    case _ => None
  }
}

def postgresHeader = {
  import Platform.*
  val filename = "libpq-fe.h"

  postgresInclude.resolve(filename)
}

lazy val sqlite =
  project
    .in(file("example-sqlite"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      Compile / run / envVars := Map(
        // As we're not installing sqlite globally,
        // we're just point binaries to the location of compiled
        // dynamic libraries
        "LD_LIBRARY_PATH" -> (baseDirectory.value / "sqlite").toString,
        "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "sqlite").toString
      ),
      // Generate bindings to Postgres main API
      Bindgen.bindings := {
        val extraFlags = {
          val clang = nativeConfig.value.clang

          val ci = Platform.detectClangInfo(clang)

          val clangInclude = ci.includePaths.map("-I" + _)
          val llvmInclude = ci.llvmInclude.map("-I" + _)

          clangInclude ++ llvmInclude
        }

        { builder =>
          val loc = baseDirectory.value / "sqlite"

          builder.define(
            loc / "sqlite3.h",
            "libsqlite",
            linkName = Some("sqlite3"),
            cImports = List("sqlite.h"),
            clangFlags = extraFlags ++ List("-fsigned-char")
          )
        }
      },
      nativeConfig := {
	val conf = nativeConfig.value
	val dir = baseDirectory.value / "sqlite"

	conf.withLinkingOptions(conf.linkingOptions ++ List(s"-L$dir"))
      }
    )

lazy val civetweb =
  project
    .in(file("example-civetweb"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      // Generate bindings to Postgres main API
      Bindgen.bindings := {
        val extraFlags = {
          val clang = nativeConfig.value.clang

          val ci = Platform.detectClangInfo(clang)

          val clangInclude = ci.includePaths.map("-I" + _)
          val llvmInclude = ci.llvmInclude.map("-I" + _)

          clangInclude ++ llvmInclude
        }

        { builder =>
          val loc = baseDirectory.value / "civetweb"

          builder.define(
            loc / "include" / "civetweb.h",
            "civetweb",
            cImports = List("civetweb.h"),
            clangFlags = extraFlags ++ List("-fsigned-char")
          )
        }
      },
      nativeConfig := {
        val fullPath = baseDirectory.value / "civetweb" / "libcivetweb.a"
        val conf = nativeConfig.value

        conf.withLinkingOptions(
          conf.linkingOptions :+ fullPath.toString
        )
      }
    )
