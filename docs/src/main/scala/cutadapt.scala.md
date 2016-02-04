
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._

abstract class Cutadapt extends Bundle(cdevel) { cutadapt =>

  lazy val install = cmd("pip")("install", "--install-option=--install-scripts=/usr/bin", "cutadapt")

  def instructions: AnyInstructions = install
}

```




[main/scala/cutadapt.scala]: cutadapt.scala.md