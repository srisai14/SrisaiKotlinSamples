package com.srisai.kotlin

fun main(args: Array<String>) {
    println(whenAssign(2.3))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One Number"
        "Srisai" -> "String"
        2.3 -> "Double"
        true -> "It's a boolean"
        else -> "Not applicable"

    }

    return result
}