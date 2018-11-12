@file:JvmName("CallingFromJava")
package com.srisai.kotlin

fun main(args:Array<String>) {

    var result = addition(112,13)
    println(result)

}

fun addition(a:Int, b:Int) : Int = a+b
