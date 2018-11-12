package com.srisai.kotlin

fun main(args:Array<String>) {

    var result = InterestCalcAmt(50,0.02)
    println(result)
}

@JvmOverloads
fun InterestCalcAmt(amt:Int, interest:Double=0.04) :Int {
    return (amt +amt*interest).toInt()
}

// If the InntestCalcAmt is called from Kotlin, if you pass 1 parameter or 2 parameters , it's automatically identifies. where as in Java, it doesn't . so, we should
// add annotation like @JvmOverloads
