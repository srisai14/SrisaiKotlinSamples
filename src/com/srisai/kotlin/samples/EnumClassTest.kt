package com.srisai.kotlin.samples

enum class State {
    IDLE, RUNNING, FINISHED
}

fun main(args:Array<String>) {

    val state = State.FINISHED

    val result = when(state) {
        State.RUNNING -> "It's Running"
        State.IDLE -> "Idle"
        State.FINISHED -> "It's Finished"
    }

    println(result)
}