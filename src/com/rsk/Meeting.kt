package com.rsk

import java.util.*

class Meeting{

    var Title: String = ""
    var When: Date    = Date()
    var Who           = mutableListOf<String>()
    fun create(){}

}

fun main(args: Array<String>) {
    val meetingObject   = Meeting()
    meetingObject.Title = "Board Meeting"
    meetingObject.When  = Date(2024,7,31)
    meetingObject.Who.add("Karthik")

    //The Above initialization of Object properties can also be initialized by using * with * keyword
    with(meetingObject){
        Title = "Board Meeting"
        When  = Date(2024,7,31)
        Who.add("Karthik")
    }

}