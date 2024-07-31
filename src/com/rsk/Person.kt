package com.rsk

//By default classes and methods in kotlin are final
//and if you want these classes and methods to be overridden you can use "open" keyword

//You can make use of companion objects to make use of addition of static objects to class

fun main(args: Array<String>) {
    val kevin = Student("Karthik","Singh",1,"tutor for Learning Math")
    println(kevin.firstName + " " + kevin.lastName + " " + kevin._id)
    Student.createPostgrad("Karthik")
    Student.createUndergrad("Kevin")
}

class Program{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin = Student("Karthik","Singh",1,"tutor for Learning Math")
            println(kevin.firstName + " " + kevin.lastName + " " + kevin._id)
        }

    }
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = firstName+ " " + lastName
    abstract fun getAddress(): String

}

open class Student(firstName: String, lastName: String, val _id:Int, var tutor:String= "") : Person(firstName, lastName){


    override fun getAddress():String{
        return "Student Address"
    }

    override fun getName(): String = ""

    companion object : XmlSerializer<Student>{

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }

        fun createUndergrad(name: String): Undergraduate{
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): PostGraduate{
            return PostGraduate(name)
        }

    }

}

class Undergraduate(firstName:String) : Student(firstName,"",1){
}

class PostGraduate(firstName:String) : Student(firstName,"",1){
}

interface XmlSerializer<T>{
    fun toXml(item:T)
}