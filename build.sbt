import _root_.io.gatling.build.MavenPublishKeys._
import _root_.io.gatling.build.license._

enablePlugins(AutomateHeaderPlugin,WaylayPlugin)

projectDevelopers := Seq(
  GatlingDeveloper("slandelle@gatling.io", "Stéphane Landelle", isGatlingCorp = true),
  GatlingDeveloper("nremond@gmail.com", "Nicolas Rémond", isGatlingCorp = false),
  GatlingDeveloper("ramazanyich@gmail.com", "Ramil Israfilov", isGatlingCorp = false)
)

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))
headerLicense := ApacheV2License

useSonatypeRepositories := true

githubPath := "waylay/jsonpath"

crossPaths := true
scalaVersion := "2.13.3"


resolvers += "Waylay repository" at "https://nexus.waylay.io/repository/maven-releases"
publishTo := {
  val nexus = "https://nexus.waylay.io"
  if (isSnapshot.value)
    Some("Waylay snapshot repo" at nexus + "/repository/maven-snapshots")
  else
    Some("Waylay releases repo" at nexus + "/repository/maven-releases")
}

