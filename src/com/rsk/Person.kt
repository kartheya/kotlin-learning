package com.rsk

//By default classes and methods in kotlin are final
//and if you want these classes and methods to be overridden you can use "open" keyword
fun main(args: Array<String>) {
    val kevin = Student("Karthik","Singh",1,"tutor for Learning Math")
    println(kevin.firstName + " " + kevin.lastName + " " + kevin._id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = firstName+ " " + lastName
    abstract fun getAddress(): String

}

class Student(firstName: String, lastName: String, val _id:Int,var tutor:String= "") : Person(firstName, lastName){


    override fun getAddress():String{
        return "Student Address"
    }


    override fun getName(): String = ""
}