import Dependencies._

ThisBuild / scalaVersion     := "2.12.21"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / name             := "scala-vscode"

lazy val root = (project in file("."))
  .settings(
    name := "scala-vscode",
    libraryDependencies += munit % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.


