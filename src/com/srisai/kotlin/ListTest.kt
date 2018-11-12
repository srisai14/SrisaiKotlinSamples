package com.srisai.kotlin

fun main(args:Array<String>) {

    var nums = listOf(1,2,3,4)
    for((i,e) in nums.withIndex()) {
        println("Index $i -- Element $e")
    }

    var names = listOf("srisai","jayakar","lakshmi","jayakar")
    for((i,e) in names.withIndex()) {
        println("Index $i -- Element $e")
    }
}