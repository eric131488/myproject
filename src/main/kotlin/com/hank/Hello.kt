package com.hank

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val human = Human()
    human.hello()
    var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Hank"
}

class Human {
    fun hello() {
        print("Hello kotlin")
    }
}