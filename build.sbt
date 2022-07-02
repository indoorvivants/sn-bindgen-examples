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
    bindgenBindings += {
      Binding(
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

lazy val git = project
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
    bindgenBindings += {
      val gitinclude = baseDirectory.value / "libgit2" / "include"

      Binding(
        gitinclude / "git2.h",
        "libgit",
        linkName = Some("git2"),
        cImports = List("git2.h"),
        clangFlags = List(s"-I$gitinclude", "-fsigned-char")
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
      bindgenBindings += {
        Binding(
          postgresHeader.toFile(),
          "libpq",
          linkName = Some("pq"),
          cImports = List("libpq-fe.h"),
          clangFlags = List("-std=gnu99", s"-I$postgresInclude")
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
      bindgenBindings += {
        Binding(
          baseDirectory.value / "sqlite" / "sqlite3.h",
          "libsqlite",
          linkName = Some("sqlite3"),
          cImports = List("sqlite.h"),
          clangFlags = List("-fsigned-char")
        )
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
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
      scalaVersion := Versions.Scala,
      // Generate bindings to Hiredis main API
      bindgenBindings += {
        Binding(
          baseDirectory.value / "hiredis" / "hiredis.h",
          "libredis",
          cImports = List("hiredis.h"),
          clangFlags = List("-fsigned-char")
        )
      },
      nativeConfig := {
        val conf = nativeConfig.value
        val dir = baseDirectory.value / "hiredis"

        conf
          .withLinkingOptions(
            conf.linkingOptions ++ List(
              s"-L$dir",
              (dir / "libhiredis.a").toString
            )
          )
          .withCompileOptions(conf.compileOptions ++ List(s"-I$dir"))
      }
    )

lazy val cmark = project
  .in(file("example-cmark"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "cmark" / "build" / "src").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "cmark" / "build" / "src").toString
    ),
    bindgenBindings += {
      val bd = (baseDirectory.value / "cmark" / "build" / "src")
      Binding(
        baseDirectory.value / "cmark" / "src" / "cmark.h",
        "cmark",
        linkName = Some("cmark"),
        cImports = List("cmark.h"),
        clangFlags = List(s"-I$bd", "-DCMARK_STATIC_DEFINE=")
      )
    },
    nativeConfig := {
      val base = baseDirectory.value / "cmark"
      val libFolder = base / "build" / "src"
      val headersFolder = base // cmark puts headers in root
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-lcmark",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
        )
    }
  )

lazy val rocksdb = project
  .in(file("example-rocksdb"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "rocksdb").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "rocksdb").toString
    ),
    bindgenBindings += {
      val bd = (baseDirectory.value / "rocksdb" / "include")
      Binding(
        baseDirectory.value / "rocksdb" / "include" / "rocksdb" / "c.h",
        "rocksdb",
        linkName = Some("rocksdb"),
        cImports = List("rocksdb/c.h"),
        clangFlags = List(s"-I$bd")
      )
    },
    nativeConfig := {
      val base = baseDirectory.value / "rocksdb"
      val libFolder = base
      val headersFolder = base / "include"
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-lrocksdb",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
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
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := Versions.Scala,
    Compile / run / envVars := Map(
      // As we're not installing tree-sitter globally,
      // we're just point binaries to the location of compiled
      // dynamic libraries
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "libuv" / "build").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "libuv" / "build").toString
    ),
    // Generate bindings to Tree Sitter's main API
    bindgenBindings += {
      val base = baseDirectory.value / "libuv" / "include"
      Binding(
        base / "uv.h",
        "libuv",
        linkName = Some("uv"),
        cImports = List("uv.h"),
        clangFlags = List(s"-I${base}")
      )
    },
    nativeConfig := {
      val base = baseDirectory.value / "libuv"
      val libFolder = base / "build"
      val headersFolder = base / "include" // cJSON puts headers in root
      val conf = nativeConfig.value

      conf
        .withLinkingOptions(
          conf.linkingOptions ++ List(
            "-luv",
            s"-L$libFolder"
          )
        )
        .withCompileOptions(
          conf.compileOptions ++ List(s"-I$headersFolder")
        )
    }
  )

lazy val vcpkg = project
  .in(file("example-vcpkg"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    vcpkgDependencies := Set("libuv", "czmq", "cjson"),
    scalaVersion := Versions.Scala,
    nativeConfig := {
      val conf = nativeConfig.value

      conf
        .withCompileOptions(
          conf.compileOptions ++ vcpkgCompilationArguments.value
        )
        .withLinkingOptions(
          conf.linkingOptions ++ vcpkgLinkingArguments.value ++ Seq(
            "-fuse-ld=lld"
          )
        )
    },
    bindgenBindings := Seq(
      Binding(
        vcpkgManager.value.includes("cjson") / "cjson" / "cJSON.h",
        "cjson",
        cImports = List("cJSON.h"),
        clangFlags = List("-fsigned-char")
      ),
      Binding(
        vcpkgManager.value.includes("libuv") / "uv.h",
        "libuv",
        cImports = List("uv.h"),
        clangFlags = List(
          "-I" + vcpkgManager.value.includes("libuv").toString,
          "-fsigned-char"
        )
      ),
      Binding(
        vcpkgManager.value.includes("czmq") / "czmq.h",
        "czmq",
        cImports = List("czmq.h"),
        clangFlags = List(
          "-I" + vcpkgManager.value.includes("czmq").toString,
          "-I" + vcpkgManager.value.includes("zeromq").toString,
          "-fsigned-char"
        )
      )
    )
  )

lazy val lua = project
  .in(file("example-lua"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgPlugin)
  .settings(
    vcpkgDependencies := Set("lua"),
    scalaVersion := Versions.Scala,
    nativeConfig := {
      val conf = nativeConfig.value

      conf
        .withCompileOptions(
          conf.compileOptions ++ vcpkgCompilationArguments.value
        )
        .withLinkingOptions(conf.linkingOptions ++ vcpkgLinkingArguments.value)
    },
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
