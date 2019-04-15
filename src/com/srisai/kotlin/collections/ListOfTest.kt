package com.srisai.kotlin.collections

fun main(args: Array<String>) {
    val list = mutableListOf<String>("Srisai","Jayakar","Lakshmi","Srisiri","Nikhil Sai")
    list.add(2,"Balaji")
    list.remove("Jayakar")

    for(l in list) {
        println(l)
    }
}