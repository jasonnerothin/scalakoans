package org.functionalkoans.forscala

import support.KoanSuite

// DONE
class AboutConstructors extends KoanSuite {

  class AboutConstructorWithAuxiliaryConstructor(val name: String) {
    // invoke auxiliary constructor
    def this() {
      // what happens if you comment out the following line?
      this ("defaultname")
    }
  }

  class AboutClassWithNoClassParameter

  koan("Primary constructor specified with a parameter requires that parameter to be passed in") {
    val aboutMe = new AboutConstructorWithAuxiliaryConstructor()
    aboutMe.name should be ("defaultname")
  }

  koan("Class with no class parameters is called with no arguments") {
    // add parameter to make this fail
    new AboutClassWithNoClassParameter
  }

}