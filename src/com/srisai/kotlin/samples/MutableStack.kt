package com.srisai.kotlin.samples

class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main(args:Array<String>) {
    val stack1 = MutableStack(0.62, 3.14, 2.7)
    println(stack1)

    println(stack1.push(12.2))

    println("after $stack1")

    println("IS empty--->> ${stack1.isEmpty()}")

}