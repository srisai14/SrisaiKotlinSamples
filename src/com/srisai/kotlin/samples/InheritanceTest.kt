package com.srisai.kotlin.samples

open class Dog {
    open fun shout(){
        println("Bow Bow")
    }
}

class Animal : Dog() {
    override fun shout() {
        println(" ha ha ha")
    }
}

fun main(args:Array<String>) {
    val doggy = Animal()
    val animals = Animal()

    doggy.shout()
    animals.shout()

    val dog:Dog = Animal()
    dog.shout()
}