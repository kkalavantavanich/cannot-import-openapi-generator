import Dependencies._

ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.example"

lazy val root = (project in file("."))
  .settings(
    name := "hello-sbt",
    libraryDependencies ++= helloDependencies
  )

