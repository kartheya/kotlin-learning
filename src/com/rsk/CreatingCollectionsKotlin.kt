package com.rsk

fun main(args: Array<String>) {

    val people = listOf<Persons?>()
    val mutableListPeopls = mutableListOf<Persons>()

    val items = IntArray(2)
    items[0]  = 1
    items[1]  = 2

    val numbers = intArrayOf(1,2,3,4,5)

    numbers.forEachIndexed { index, element
    -> println("$index = $element")}

}

class Persons(val age: Int){

}