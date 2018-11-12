package com.srisai.kotlin

fun main(args:Array<String>) {

    var result = add(112,13)
    println(result)

    var res = max(112,13)
    println(res)
}

/*fun add(a:Int, b:Int) : Int {
    return a+b
}*/

fun add(a:Int, b:Int) : Int = a+b

/*
fun max(x:Int,y:Int) : Int {
    if (x>y)
        return x
    else
        return y
}*/

fun max(x:Int,y:Int) : Int = if(x>y) x else y

