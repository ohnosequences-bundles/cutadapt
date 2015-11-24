package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


abstract class Cutadapt extends Bundle(cdevel) { cutadapt =>

  lazy val install = cmd("pip")("install", "cutadapt")

  def instructions: AnyInstructions = install



}
