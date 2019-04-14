package com.srisai.kotlin.samples

data class User(val id:Int, var name:String)

fun main(args:Array<String>) {
    val user = User(101,"Srisai")
    val secondUser = User(313,"Jayakar")

    println(user.id)
    println(user.name)

    println(user.copy(3,"Lakshmi"))
    println(user.id)
    println(user.name)

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}

/*
Auto-generated copy function makes it easy to create a new instance.
When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
Use copy with named arguments to change the value despite of the properties order.
 */

