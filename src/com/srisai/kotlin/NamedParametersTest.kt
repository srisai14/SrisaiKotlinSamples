package com.srisai.kotlin

fun main(args:Array<String>) {

    var empDets = employee(id = 101,name="Srisai",salary="120000",city="shirdi")
    println(empDets)
}

fun employee(id:Int, name:String, salary:String, city:String) :String{

    return "$id - $name - $city";
}