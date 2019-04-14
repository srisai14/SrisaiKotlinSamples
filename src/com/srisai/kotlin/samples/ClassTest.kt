package com.srisai.kotlin.samples

class ClassTest

class Contact(val id: Int, var email: String) {

}

fun main(args: Array<String>) {
    val contacter = Contact(1, "abc@gmail.com")

    println(contacter.id)
    println(contacter.email)

    contacter.email="srisai@abc.com"
    println("After Modified email -- ${contacter.email}")
}