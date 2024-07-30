package com.rsk

//By default classes and methods in kotlin are final
//and if you want these classes and methods to be overridden you can use "open" keyword
abstract class Person{

    var firstName:String = ""
    var lastName:String = ""

    open fun getName(): String = firstName+ " " + lastName
    abstract fun getAddress(): String
}

class Student : Person(){

    override fun getAddress():String{
        return "Student Address"
    }

    override fun getName(): String = ""


}