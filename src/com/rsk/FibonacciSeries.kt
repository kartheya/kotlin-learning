package com.rsk

fun main(args: Array<String>) {
    var fibonacciSeriesObject = FibonacciSeries()
    var total = 0
    fibonacciSeriesObject.fibonacci(8, { total += it} )
    println("Total is: $total")
}

class FibonacciSeries {

    fun fibonacci(limit: Int, action: (Int)-> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i:Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev     = temp
            current  = prev + prevprev
        }

    }


}