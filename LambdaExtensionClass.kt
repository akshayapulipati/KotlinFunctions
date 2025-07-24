package com.example.funtionspart1

val shout: String.() -> String = {//lambda that extends string class
    this.uppercase() + "!!!"
}

fun main() {
    val result = "hello".shout()//called as extensiom(treated like new method om str
    println(result)  // Output: HELLO!!!
}
