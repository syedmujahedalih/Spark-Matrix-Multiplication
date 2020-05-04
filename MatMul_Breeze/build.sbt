scalaVersion := "2.11.6"

name := "breeze-code"
organization := "ch.epfi.scala"
version := "1.0"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
libraryDependencies ++= Seq(
    "org.scalanlp" %% "breeze" % "0.13.2",
    "org.scalanlp" %% "breeze-natives" % "0.12"
)
