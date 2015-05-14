scalaVersion := "2.11.6"

name := "play2-mail-plugin"

organization := "com.wiredthing"

version := "0.6-SNAPSHOT"

publishTo := {
  Some("WiredThing Internal Forks Repository" at "https://wiredthing.artifactoryonline.com/wiredthing/libs-forked-local")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

resolvers ++= Seq(
"Typesafe repository snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
"Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/"
)

scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:implicitConversions",
    "-language:reflectiveCalls"
)

val playVersion = "2.4.0-RC2"

libraryDependencies ++= Seq(
  "org.codemonkey.simplejavamail" % "simple-java-mail" % "2.1",
  "com.typesafe.play" %% "play" % playVersion,
  "com.typesafe.play" %% "play-test" % playVersion % "test",
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "junit" % "junit" % "4.8" % "test"
)
