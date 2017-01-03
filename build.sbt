name := "squant"

version := "1.0"

scalaVersion := "2.11.8"

lazy val akkaVersion = "2.4.14"
lazy val akkaHttpVersion = "10.0.0"
lazy val circeVersion = "0.6.1"
val finchVersion = "0.11.0"

resolvers += Resolver.bintrayRepo("fcomb", "maven")

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion,
  "com.typesafe" % "config" % "1.3.1",
  "org.jsoup" % "jsoup" % "1.10.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.apache.commons" % "commons-math3" % "3.6.1",
  "com.tictactec" % "ta-lib" % "0.4.0",
  "com.quantifind" % "wisp_2.11" % "0.0.4",
  "io.circe" %% "circe-yaml" % "0.4.0"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

// Assembly settings
//mainClass in Global := Some("com.squant.cheetah.SQuantMain")
//assemblyJarName in assembly := s"$name-$version.jar"

fork in run := true