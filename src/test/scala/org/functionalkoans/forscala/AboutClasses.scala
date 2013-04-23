package org.functionalkoans.forscala

import support.KoanSuite
import org.scalatest.matchers.ShouldMatchers

// DONE
class AboutClasses extends KoanSuite with ShouldMatchers{

  // you can define class with var or val parameters
  class ClassWithVarParameter(var description: String)

  class ClassWithValParameter(val name: String)

  // you can define class with private fields
  class ClassWithPrivateFields(name: String)

  koan("val parameters in class definition define getter") {
    val str = "name goes here"
    val aClass = new ClassWithValParameter(str)
    aClass.name should be(str)
  }

  koan("var parameters in class definition define getter and setter") {
    val str = "description goes here"
    val aClass = new ClassWithVarParameter(str)
    aClass.description should be(str)

    val str2 = "new description"
    aClass.description = str2
    aClass.description should be(str2)
  }

  koan("fields defined internally are private to class") {
    val aClass = new ClassWithPrivateFields("name")

    // NOTE: aClass.name is not accessible
  }

}
