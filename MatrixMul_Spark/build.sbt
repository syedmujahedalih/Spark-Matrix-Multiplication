scalaVersion := "2.11.6"

name := "MatrixMul"
organization := "ch.epfl.scala"
version := "1.0"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.2.0" % "provided",
    "org.apache.spark" %% "spark-mllib" % "2.1.0" % "provided"
)



