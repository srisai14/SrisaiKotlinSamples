package com.srisai.kotlin.advanced

fun main(args: Array<String>) {

    val pairs: Pair<String,Int> = Pair("Srisai", 101)

    with(pairs) {
        println(first)
        println(second)
    }

    val listA = mutableListOf<String>()
    val listB = mutableListOf<Int>()

    pairs.apply {
        listA.add(first)
        listB.add(second)
    }

    println(listA to listB)

    val pairsList = pairs.apply {
        first
        second
    }.toList()

    println("PairsList    "+pairsList)

    val copyPairs = pairs.apply {
        //        listA.add(first)
//        listB.add(second)
        first to second
    }.copy("Sreesai", 122)

    println(copyPairs)
}