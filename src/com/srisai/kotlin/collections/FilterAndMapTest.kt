package com.srisai.kotlin.collections

fun main(args: Array<String>) {

    val names = listOf<String>("Srisai","Jayakar","Lakshmi","Srisiri","Nikhil Sai")

    val namesFilterList = names.filter { it.startsWith("S") }.map { it.toUpperCase()}
    println(namesFilterList)

    val namesList = listOf<Person>(Person("Srisai",101),Person("Balaji",102),Person("Jayakar",313))

    var namess = namesList.filter { it.name.startsWith("S") }.map { it.name }
    println(namess)
}

data class Person(var name:String, var id:Int)