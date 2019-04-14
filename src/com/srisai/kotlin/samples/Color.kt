package com.srisai.kotlin.samples

enum class Color(val rgb:Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

fun main(args:Array<String>) {
    val red = Color.YELLOW

    println(red)
}
