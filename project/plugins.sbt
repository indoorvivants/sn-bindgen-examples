val BindgenVersion =
  sys.env.getOrElse("SN_BINDGEN_VERSION", "0.0.9+1-c4e91c4e-SNAPSHOT")

resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.4")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
