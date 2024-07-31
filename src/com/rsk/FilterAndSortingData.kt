package com.rsk

fun main(args: Array<String>) {

    var ints = listOf(1,2,3,4,5,6,7,8,9,10)
    var smallInts = ints.filter { it -> it < 4   }
    println(smallInts)
    var squaredInts = ints.map { it-> it * it }
    println(squaredInts)

    val greaterThan3 = { v:Int -> v > 3 }
   val largeInts = ints.any (greaterThan3)
    println(largeInts)

    val numberOfLargeInts = ints.count (greaterThan3)
    println(numberOfLargeInts)
}