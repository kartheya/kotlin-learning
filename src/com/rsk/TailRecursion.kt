package com.rsk

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fib(10, BigInteger("1"), BigInteger("0")))
}

//To Avoid stackoverflow errors for heavily recursive functions we use the keyword tailrec
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if( n == 0 ) b else fib(n - 1, a + b, a)
}