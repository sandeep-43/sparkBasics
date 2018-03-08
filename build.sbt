name := "wordCountApp"

version := "0.1"
scalaVersion := "2.11.11"
val sparkVersion = "2.2.0"
val sparkTestingVersion = "2.2.0_0.7.4"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion /* % "provided"*/,
  "org.apache.spark" %% "spark-sql" % sparkVersion /* % "provided"% */
)
