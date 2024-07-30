package com.rsk

interface Time{
    fun setTime( hours: Int, mins: Int = 0, secs: Int = 0 )
    fun setTime( time:KevinTime ) = setTime(time.hours)
}

interface EndOfWorld{
    fun setTime(time: KevinTime){}
}

class KevinTime{
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

// : means implements/extends
class YetiTime : Time, EndOfWorld {

    overide fun setTime(hours: Int, mins: Int = 0, secs: Int = 0){

    }

    override fun setTime(time: KevinTime){
        super<Time>.setTime(time)
    }



}