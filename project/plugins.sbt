val BindgenVersion =
  sys.env.getOrElse("SN_BINDGEN_VERSION", "0.0.10+5-538d6ffc-SNAPSHOT")

val VcpkgVersion =
  sys.env.getOrElse("SBT_VCPKG_VERSION", "0.0.5+5-38331d08-SNAPSHOT")

resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += Resolver.sonatypeRepo("releases")

System.err.println(s"Versions used: Bindgen `$BindgenVersion`, Sbt-Vcpkg: `$VcpkgVersion`")

addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.5")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("com.indoorvivants.vcpkg" % "sbt-vcpkg" % VcpkgVersion)
