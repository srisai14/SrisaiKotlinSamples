package com.srisai.kotlin.advanced

fun main(args: Array<String>) {
    val tripleVar:Triple<String,Int,Double> = Triple("Srisai", 101, 4.3)

    with(tripleVar) {
        first
        second
        third
    }

    val toList1 = tripleVar.apply {
        first
        second
        third
    }.toList()

    println(toList1)

}