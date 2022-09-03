# Examples of using C binding generator for Scala Native 

This repository demonstrates the usage of [sn-bindgen](https://github.com/indoorvivants/sn-bindgen) - a Scala Native binding generator for C libraries.

Examples for various well known libraries, like libgit2, tree-sitter, libpq (postgres access), etc. are included.

Most examples are bootstrapped via [Vcpkg](https://vcpkg.io/en/index.html) using a [dedicated SBT plugin](https://github.com/indoorvivants/sbt-vcpkg) for it.

For those examples, you should be able to just run `cjson/run` in the SBT shell, and all the necessary dependencies will be installed automatically.

### Contributing

You can contribute both ideas of what libraries to integrate with, or even adding integrations yourself! There's plenty of examples in build.sbt,
and if you don't stumble onto any bugs in sn-bindgen (which is entirely probable), as long as the package is available in Vcpkg, you should have a relatively 
easy time of adding it (famous last words).

If you have any issues using or modifying this project, don't hesitate to create an issue.

### Publishing

Future plans for this repository include publishing of generated bindings as individual artefacts to Maven Central, 
but that depends on improving the coverage of the posixlib and clib: https://github.com/indoorvivants/sn-bindgen/issues/103

### Community build

Additionally, this repo serves as a very limited version of a "community build", where a build runs daily against the latest version of sn-bindgen: https://github.com/indoorvivants/sn-bindgen/actions/workflows/examples.yml

### Arm64 and Vcpkg

A lot of projects in Vcpkg are marked as unavailable for arm64 machines (this includes M1 Macs).
Sometimes those are legit, sometimes the maintainers are overly cautious perhaps for the lack of ability to test those projects.

One example is Raylib, which is set to be unavailable on `arm`: https://github.com/microsoft/vcpkg/blob/master/ports/raylib/vcpkg.json#L7
but actually for the limited usage I've had with it, works fine.

