package com.srisai.kotlin

fun main(args:Array<String>)  {

    var s : String="Nikhil"

    var result = when(s) {

        "srisai" -> "Sai lives in Shirdi"
        "Jayakar" -> "In Chicago Downtown"
        "Nikhil"  -> "Naperville"
        else -> "Nellore"
    }

    println(result)
}