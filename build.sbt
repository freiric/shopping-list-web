organization := "Lift"

name := "Lift SBT Tempalte"

version := "0.1"

//scalaVersion:= "2.9.1"

seq(webSettings :_*)

fork in testOnly := true

scanDirectories in Compile := Nil

libraryDependencies ++= Seq(
  "net.liftweb" % "lift-mapper_2.9.1" % "2.4-M4",
  "ch.qos.logback" % "logback-classic" % "0.9.26",
  "com.h2database" % "h2" % "1.2.138" % "runtime",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
  //"junit" % "junit" % "4.7" % "test",
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test",
  "org.mortbay.jetty" % "jetty" % "6.1.25" % "container, compile",
  "org.scala-lang" % "scala-compiler" % "2.9.1" % "test",
  "javax.validation" % "validation-api" % "1.0.0.GA",
  "net.liftweb" % "lift-jpa_2.9.1" % "2.4-M4",
  "geronimo-spec" % "geronimo-spec-jta" % "1.0.1B-rc4" % "provided",
  "com.novocode" % "junit-interface" % "0.7" % "test->default",
  "com.shoppinglist" % "shopping-list-spa" % "1.0-SNAPSHOT" % "test, compile, container",
  "org.apache.derby" % "derby" % "10.4.2.0",
  "com.caucho" % "hessian" % "4.0.7",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" 
)
