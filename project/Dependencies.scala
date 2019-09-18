import sbt.{ModuleID, _}

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  val swagger = "org.openapitools" % "openapi-generator" % "4,1,2"

  val helloDependencies: Seq[ModuleID] = Seq(scalaTest, swagger)
}
