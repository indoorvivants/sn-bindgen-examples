import bindgen.interface.LogLevel
import java.nio.file.Paths
Global / onChangedBuildSource := ReloadOnSourceChanges

// Example of Tree Sitter binding usage:
// https://tree-sitter.github.io/tree-sitter/using-parsers#the-basic-objects
lazy val `tree-sitter` = project
  .in(file("example-tree-sitter"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    scalaVersion := "3.1.0",
    Compile / run / envVars := Map(
      // As we're not installing tree-sitter globally,
      // we're just point binaries to the location of compiled
      // dynamic libraries
      "LD_LIBRARY_PATH" -> (baseDirectory.value / "tree-sitter").toString,
      "DYLD_LIBRARY_PATH" -> (baseDirectory.value / "tree-sitter").toString
    ),
    // Generate bindings to Tree Sitter's main API
    Bindgen.bindings := { builder =>
      builder.define(
        baseDirectory.value / "tree-sitter" / "lib" / "include" / "tree_sitter" / "api.h",
        "treesitter",
        linkName = Some("tree-sitter"),
        cImports = List("tree_sitter/api.h"),
        clangFlags = List("-std=gnu99") ++ llvmInclude ++ clangInclude
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
    scalaVersion := "3.1.0",
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
        cImports = List("cJSON.h"),
        clangFlags = List("-std=gnu99") ++ llvmInclude ++ clangInclude
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

import bindgen.interface.Platform
def includes(
    ifLinux: List[String] = Nil,
    ifMac: List[String] = Nil,
    ifWindows: List[String] = Nil
): List[String] = {
  Platform.target.os match {
    case Platform.OS.Linux   => ifLinux
    case Platform.OS.MacOS   => ifMac
    case Platform.OS.Windows => ifWindows
    case _                   => Nil
  }
}.filter(s => Paths.get(s).toFile.exists).map(s => s"-I$s")
def llvmInclude: List[String] = {
  includes(
    ifLinux =
      (10 to 13).toList.flatMap(v => List(s"/usr/lib/llvm-$v/include/")),
    ifMac =
      List("/opt/homebrew/opt/llvm/include", "/usr/local/opt/llvm/include")
  )
}

def clangInclude: List[String] = {
  val majorVersion = sys.env.getOrElse("CLANG_VERSION", "13")
  includes(
    ifMac =
      if (Platform.target.arch == Platform.Arch.x86_64)
        List(
          // on X86 macs
          s"/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/lib/clang/$majorVersion.0.0/include",
          "/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include",
          "/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/include"
        )
      else
        List(
          // on M1 macs
          s"/Library/Developer/CommandLineTools/usr/lib/clang/$majorVersion.0.0/include",
          "/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include",
          "/Library/Developer/CommandLineTools/usr/include"
        )
  )
}
