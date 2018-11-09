package com.srisai.kotlin

fun main(args:Array<String>) {

    var a:Int = 14;
    var b:Int = 7;

    var result:Int =0;

    result = if(a>b) {
        a
    }
    else {
        b
    }

    println(result)
}