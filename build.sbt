name := "Antimalware"

version := "1.0"

scalaVersion := "2.10.0"

maxErrors := 5

libraryDependencies ++= Seq(
    "org.rogach" %% "scallop" % "0.8.1",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "com.novocode" % "junit-interface" % "0.10-M2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-a", "-n")
