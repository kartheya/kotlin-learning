package com.rsk

//object keyword will create an instance of that class. To create Singleton Objects we can make use of Object Keyword

fun main(args: Array<String>) {
    Courses.initialize()
    println(Courses.allCourses.get(0).Title)
}

class Course(val Id: Int, val Title:String)

object Courses{
    var allCourses = ArrayList<Course>()

    fun initialize(){
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }

}