val BindgenVersion =
  sys.env.getOrElse("SN_BINDGEN_VERSION", "0.1.3+1-40ac972f-SNAPSHOT")

val VcpkgVersion =
  sys.env.getOrElse("SBT_VCPKG_VERSION", "0.0.18")

val ScalaNativeVersion = 
  sys.env.getOrElse("SCALA_NATIVE_VERSION", "0.5.3")


resolvers ++= Resolver.sonatypeOssRepos("snapshots")
resolvers ++= Resolver.sonatypeOssRepos("releases")

addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % ScalaNativeVersion)
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("com.indoorvivants.vcpkg" % "sbt-vcpkg-native" % VcpkgVersion)
