package com.srisai.kotlin.samples

fun main(args:Array<String>) {
    val vars = VarArgsTest()
    vars.varArgsTest("Srisai","Jayakar","Lakshmi","Srisiri","Nikhil Sai")
}
class VarArgsTest {

    fun varArgsTest(vararg messages:String) {
        for(message in messages) {
            println(message)
        }
    }
}