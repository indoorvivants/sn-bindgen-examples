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
      val cfg =
        bindgen.interface.Platform.detectClangInfo(nativeClang.value.toPath)

      val includes = cfg.includePaths.map("-I" + _)

      { builder =>
        builder.define(
          baseDirectory.value / "tree-sitter" / "lib" / "include" / "tree_sitter" / "api.h",
          "treesitter",
          linkName = Some("tree-sitter"),
          cImports = List("tree_sitter/api.h"),
          clangFlags = List("-std=gnu99") ++ includes
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
    Bindgen.bindings := {
      { builder =>
        builder.define(
          baseDirectory.value / "cJSON" / "cJSON.h",
          "cjson",
          linkName = Some("cjson"),
          cImports = List("cJSON.h")
        )

      }
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
