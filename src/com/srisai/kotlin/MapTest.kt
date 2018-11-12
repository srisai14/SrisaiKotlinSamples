package com.srisai.kotlin

import java.util.*

fun main(args:Array<String>) {

    var names = TreeMap<String,Int>()
    names["srisai"]=101
    names["jayakar"]=313
    names["lakshmi"]=106

    for((name,id) in names) {
        println("$name $id")
    }

}