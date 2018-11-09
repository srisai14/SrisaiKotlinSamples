package com.srisai.kotlin

fun main(args:Array<String>) {

    var a : Int =12;

    var res = when(a) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "That's out of range"
    }

    println("Given Number is $res")
}