ThisBuild / scalaVersion     := "3.3.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / description      := "$description$"

// for more ZIO libraries, see https://zio.dev/ecosystem/

val zioVersion        = "2.0.19"
val zioConfigVersion  = "4.0.1"
val zioHttpVersion    = "3.0.0-RC4"
val zioJsonVersion    = "0.6.2"
val zioLoggingVersion = "2.2.0"
val zioSchemaVersion  = "0.4.17"

val dependencies = Seq(
  "dev.zio" %% "zio" % zioVersion
  // "dev.zio" %% "zio-streams" % zioVersion,
  // "dev.zio" %% "zio-config"  % zioConfigVersion,
  // "dev.zio" %% "zio-http"    % zioHttpVersion,
  // "dev.zio" %% "zio-json"    % zioJsonVersion,
  // "dev.zio" %% "zio-logging" % zioLoggingVersion,
  // "dev.zio" %% "zio-schema"  % zioSchemaVersion
)

val testDependencies = Seq(
  "dev.zio" %% "zio-test"     % zioVersion % Test,
  "dev.zio" %% "zio-test-sbt" % zioVersion % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "zio-template",
    libraryDependencies ++=
      dependencies ++
        testDependencies,
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
