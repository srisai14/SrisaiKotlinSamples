package com.srisai.kotlin.collections

fun main(args: Array<String>) {

    val names = listOf<String>("Srisai","Jayakar","Lakshmi","Srisiri","Nikhil Sai")

    val namesFilterList = names.filter { it.startsWith("S") }.map { it.toUpperCase()}
    println(namesFilterList)

    val namesList = listOf<Person>(Person("Srisai",101),Person("Balaji",102),Person("Jayakar",313))

    var namess = namesList.filter { it.name.startsWith("S") }.map(Person::name)
    println(namess)

    // all, any , none, find, findLat

    val anyTest = names.any { it.startsWith("N")}
    println(anyTest)

    val allTest = names.all { it.startsWith("N")}
    println(allTest)

    val noneTest = namesList.none { it.name.contains("z") }
    println(noneTest)

    val findTest = names.find { it.length > 5 }
    println(findTest)

    val findLastTest = names.findLast { it.startsWith("S") }
    println(findLastTest)


}

data class Person(var name:String, var id:Int)