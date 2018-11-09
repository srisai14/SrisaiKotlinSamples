package com.srisai.kotlin

fun main(args:Array<String>) {

    var nums = 1..16

    for(i in nums ) {
        println(i)
    }

    println("------Increment by 2--------")

    for (a in nums step 2) {
        println(a)

    }

    println("----------DOWNTO---------")

    var nums1 = 10 downTo 2 step 2

    for(b in nums1) {
        println(b)
    }

    println("----------UNTIL---------")

    var nums2 = 6 until 15

    for(c in nums2) {
        println(c)
    }
}