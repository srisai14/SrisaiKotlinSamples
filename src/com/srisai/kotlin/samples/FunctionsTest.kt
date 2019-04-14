package com.srisai.kotlin.samples

fun main(args:Array<String>) {
    test("Srisai")

    val sum = testWithArgs(12,13)
    println(sum)

    val defaultArgs = testWithDefaultArgs(12)
    println(defaultArgs)

    println(singleExpression1(3,4))

}

fun test(message:String):Unit{
    println(message)
}

fun testWithArgs(x:Int, y:Int) : Int {
    return x+y
}

fun testWithDefaultArgs(x:Int, y:Int=10 ): Int {
    return x+y
}

fun singleExpression1(x:Int,y:Int) = x * y