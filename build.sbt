name := "AkkaClusterDockerVagrant"

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  // Logging
  "org.slf4j" % "slf4j-api" % "1.7.2",
  "ch.qos.logback" % "logback-classic" % "1.1.3",

  // Joda time
  "joda-time" % "joda-time" % "2.9.1",
  "org.joda" % "joda-convert" % "1.8.1",

  // Shapeless
  "com.chuusai" %% "shapeless" % "2.2.5",

  // Scalaz
  "org.scalaz" %% "scalaz-core" % "7.2.0",

  // Akka toolkit
  "com.typesafe.akka" %% "akka-actor" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-persistence" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-typed-experimental" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-remote" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-cluster-metrics" % "2.4.2-RC1",

  // Akka streams and Http
  "com.typesafe.akka" %% "akka-stream-experimental" % "2.0.3",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "2.0.3",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.0.3",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.0.3",

  // Slick
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "com.typesafe.slick" %% "slick-codegen" % "3.1.1",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.1",
  // Slick Joda Mapper
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.1.0",

  // Postgresql
  "org.postgresql" % "postgresql" % "9.4.1207.jre7",
  "com.github.tminglei" %% "slick-pg" % "0.11.0",

  // Quartz scheduler
  "org.quartz-scheduler" % "quartz" % "2.2.2",

  // Async Http Client Java
  "com.ning" % "async-http-client" % "1.9.31",
  // Netty latest 3.X version
  "io.netty" % "netty" % "3.10.5.Final",
  // Commons validator
  "commons-validator" % "commons-validator" % "1.5.0",

  // JSoup
  "org.jsoup" % "jsoup" % "1.8.3",

  // Apache POI
  "org.apache.poi" % "poi" % "3.13",
  "org.apache.poi" % "poi-ooxml" % "3.13",

  // Testing libraries
  "junit" % "junit" % "4.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
