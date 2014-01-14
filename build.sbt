name := "gvc"

organization := "pl.edu.agh"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers ++= Seq("Ansvia Releases Repo" at "http://scala.repo.ansvia.com/releases/")

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "2.1.1" % "test",
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "com.ansvia.graph" %% "blueprints-scala" % "0.1.0"
)
