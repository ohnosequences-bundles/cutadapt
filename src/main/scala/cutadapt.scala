package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object cutadapt extends Bundle(cdevel) {

  def install: Results = {
    Seq("pip", "install", "cutadapt") ->-
    success(s"${bundleName} is installed")
  }

}
