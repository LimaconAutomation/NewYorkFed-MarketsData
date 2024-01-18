ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "scala-nyfed-markets-data",
    idePackagePrefix := Some("me.limacon"),
    libraryDependencies ++= Seq("com.softwaremill.sttp.client4" %% "core" % "4.0.0-M8",
      "org.scalameta" %% "munit" % "0.7.29" % Test)
  )
