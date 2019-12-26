name := "giantwhale"

version := "1.0"

organization := "giantwhale"

// https://mvnrepository.com/artifact/log4j/log4j
libraryDependencies += "log4j" % "log4j" % "1.2.17"

lazy val root = Project(id = "root", base = file("."))
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .aggregate(
    sparkstreaming
  )

lazy val sparkstreaming = Project(id = "sparkstreaming", base = file("sparkstreaming"))
  .enablePlugins(JavaAppPackaging)
