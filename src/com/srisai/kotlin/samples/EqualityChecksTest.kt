package com.srisai.kotlin.samples

fun main(args:Array<String>) {
    val movies = setOf<String>("abc","xyz","bbb")
    val actors = setOf<String>("xyz","bbb","abc")
    println(movies==actors)
    println(movies===actors)

}


/*
    Kotlin uses == for structural comparison and === for referential comparison.

 */