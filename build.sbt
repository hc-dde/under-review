
// require 2.11 or higher because XML parsing
// in Scala changed from 2.10 to 2.11
scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++=   Seq(
  "edu.holycross.shot.cite" %% "xcite" % "2.1.0",
  "edu.holycross.shot" %% "ohco2" % "6.11.0",
  "edu.holycross.shot" %% "orca" % "3.0.0"
)
