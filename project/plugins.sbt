resolvers += Resolver.bintrayIvyRepo("gatling", "sbt-plugins")

addSbtPlugin("io.gatling" % "gatling-build-plugin" % "2.3.0")
addSbtPlugin("io.waylay" % "waylay-sbt-plugin" % "1.4.0")
resolvers += "Waylay repository" at "https://nexus.waylay.io/repository/maven-releases"
publishTo := {
  val nexus = "https://nexus.waylay.io"
  if (isSnapshot.value)
    Some("Waylay snapshot repo" at nexus + "/repository/maven-snapshots")
  else
    Some("Waylay releases repo" at nexus + "/repository/maven-releases")
}

