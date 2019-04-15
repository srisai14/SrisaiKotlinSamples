package com.srisai.kotlin.nullsafty

fun main(args: Array<String>) {

    val name:String? = "srisai"

    // 1. Safe Call (?.)
    println("Length is ${name?.length}")

    // 2. Safe Call using let (?.let)
    // If name is null, code will not execute within {}
    name?.let {
        println("Length is ${name.length}")
    }

    // 3. Elvis Operator

    val len = if(name!=null)
        println(name.length)
    else
        -1
    println(len)

    // 4. Non-NULL assertion operator (!!)
    // Use it when you are sure the value is NOT NULL
    // Throws NullPointerException if the value is found to be NULL

    println("Length of the name ${name!!.length}")
}