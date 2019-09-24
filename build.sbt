lazy val log4JVersion = "2.11.1"

lazy val loggingDependencies = Seq(
  "com.lmax"                   % "disruptor"        % "3.3.11" % "runtime",
  "org.apache.logging.log4j"   % "log4j-api"        % log4JVersion,
  "org.apache.logging.log4j"   % "log4j-core"       % log4JVersion,
  "org.apache.logging.log4j"   % "log4j-jcl"        % log4JVersion % "runtime",
  "org.apache.logging.log4j"   % "log4j-jul"        % log4JVersion % "runtime",
  "org.apache.logging.log4j"   % "log4j-slf4j-impl" % log4JVersion % "runtime",
  "com.typesafe.scala-logging" %% "scala-logging"   % "3.9.2",
)

libraryDependencies ++= loggingDependencies

libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "10.1.10"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.25"
