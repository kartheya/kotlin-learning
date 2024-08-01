package com.rsk

fun main(args: Array<String>) {

    var m:Meetingss? = null
    println(closeMeeting(m))

    var newMeeting   = Meetingss()
    println(closeMeeting(newMeeting))

}


fun closeMeeting(m: Meetingss?): Boolean?{
    if(m?.canClose == true)
        return m.close()
    else return false

    /*
       if and only if you think m remains constant no matter what
           return if(m!!.canClose)
                m.close()
            else
                return false
     */

}

class Meetingss{
    val canClose: Boolean = true;
    fun close() : Boolean{
        return true
    }

    fun save(o: Any){
        val saveable = o as? ISaveable
        saveable?.save()
    }

}

interface ISaveable{
    fun save()
}