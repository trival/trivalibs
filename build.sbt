scalaVersion := "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "xyz.trival.libs",
    version := "0.1.0",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test,
    testFrameworks += new TestFramework("munit.Framework")
  )
