name := "HivePractisePrograms"
version := "1.0"
organization := "com"

scalaVersion := "2.12.3"


  // https://mvnrepository.com/artifact/org.apache.hive/hive-exec
libraryDependencies += "org.apache.hive" % "hive-exec" % "3.1.2"

// https://mvnrepository.com/artifact/org.apache.spark/spark-hive
libraryDependencies += "org.apache.spark" %% "spark-hive" % "3.0.1" % "provided"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-core
libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "1.2.1"

libraryDependencies +=    "org.scalatest" %% "scalatest" % "3.0.8" % Test
