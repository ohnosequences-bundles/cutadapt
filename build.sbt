name := "cutadapt"
organization := "ohnosequences-bundles"
description := "A bundle for cutadapt tool"

bucketSuffix  := "era7.com"

libraryDependencies ++= Seq(
  "ohnosequences"         %% "statika" % "2.0.0",
  "ohnosequences-bundles" %% "cdevel"  % "0.5.0"
)

wartremoverErrors in (Compile, compile) := Seq()

releaseOnlyTestTag := "ohnosequencesBundles.test.ReleaseOnlyTest"
