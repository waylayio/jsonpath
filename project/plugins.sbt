resolvers += Resolver.bintrayIvyRepo("gatling", "sbt-plugins")

addSbtPlugin("io.gatling" % "gatling-build-plugin" % "2.3.0")
resolvers += "Waylay repository" at "https://nexus.waylay.io/repository/maven-releases"
addSbtPlugin("io.waylay" % "waylay-sbt-plugin" % "1.4.0")
