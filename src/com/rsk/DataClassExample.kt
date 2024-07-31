package com.rsk
//If you map a class with Data it provides a default override implementation of  equals, hashcode and toString.
fun main(args: Array<String>) {

    var student1 = StudentExample(1,"Kevin")
    var student2 = StudentExample(1, "Kevin")

    if(student1 == student2)
        println("Both Objects are Equal")
    else
        println("Both Objects are NotEqual")
}

data class StudentExample(val _id: Int, val name: String){

}