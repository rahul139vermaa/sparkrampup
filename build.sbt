name := "playwithspark"

version := "1.0"

scalaVersion := "2.11.7"

// grading libraries
libraryDependencies ++= Seq(/*libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"*/
"com.typesafe.play" % "play-json_2.11" % "2.5.2"
  exclude("com.fasterxml.jackson.core", "jackson-databind"),
  "org.apache.spark" % "spark-core_2.11" % "1.6.2",
     "org.apache.spark" % "spark-sql_2.11" % "1.6.2"
)


