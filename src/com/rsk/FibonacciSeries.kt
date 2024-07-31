package com.rsk

fun main(args: Array<String>) {
    var fibonacciSeriesObject = FibonacciSeries()
    fibonacciSeriesObject.fibonacci(8, object: Process{
        override fun execute(value: Int) {
           print("$value ")
        }
    })
}

interface Process{
    fun execute(value: Int)
}

class FibonacciSeries {

    fun fibonacci(limit: Int, action: Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i:Int in 1..limit){
            action.execute(current)

            var temp = current
            prevprev = prev
            prev     = temp
            current  = prev + prevprev
        }

    }
    

}