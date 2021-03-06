resolvers ++= Seq(
  Resolver.url("vox-public-ivy", url("http://dl.bintray.com/content/voxsupplychain/ivy-public"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.0.2")

addSbtPlugin("com.voxsupplychain" %% "json-schema-codegen-sbt" % "0.3.0")