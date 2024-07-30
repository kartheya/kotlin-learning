package com.rsk

fun main(args: Array<String>){
    var h1 = Header("H1");
    val h2 = Header("H2");

    val combinedHeader = h1.plus(h2)
    println(combinedHeader.Name)

    val  h3 = Header("H3")
    var combinedHeader2 = combinedHeader plus h3
    println(combinedHeader2.Name)
}

class Header(var Name: String){
}

infix fun Header.plus(other: Header) : Header{
    return Header(this.Name +" + "+ other.Name)
}


