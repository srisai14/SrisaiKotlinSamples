package com.srisai.kotlin.collections

fun main(args: Array<String>) {

    val persons = listOf<Persons>(
     Persons("Srisai","Shirdi","9876543210"),
     Persons("Jayakar","Nellore","9876543211"),
     Persons("Lakshmi","Naidupet","9876543212"),
     Persons("Srisiri","MVPalem","9876543213"),
     Persons("Nikhil Sai","Nellore","9876543214")
    )

    persons.forEach { println(it)  }

    val names = listOf(persons.filter { it.name.contains("i") }.associateBy(Persons::name, Persons::city))
    println(names)

    //names.flatMap {  }

    // Using GroupBy

    val namesList = persons.groupBy(Persons::city, Persons::name).map { it.key}
    println(namesList)
}


data class Persons(val name: String, val city: String, val phone:String )