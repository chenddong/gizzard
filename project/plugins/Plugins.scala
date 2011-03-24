import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val twitterMaven = "twitter.com" at "http://maven.twttr.com/"

  val defaultProject = "com.twitter" % "standard-project" % "0.11.3"
  val sbtThrift      = "com.twitter" % "sbt-thrift"       % "1.0.3"
}
