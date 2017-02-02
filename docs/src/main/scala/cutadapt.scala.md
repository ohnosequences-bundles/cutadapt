
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._

abstract class Cutadapt extends Bundle(cdevel) {

  def instructions: AnyInstructions =
    cmd("pip")("install", "--install-option=--install-scripts=/usr/bin", "cutadapt")
}

case object cutadapt extends Cutadapt

```




[main/scala/cutadapt.scala]: cutadapt.scala.md