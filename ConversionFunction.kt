package com.example.funtionspart1

fun main() {
    val strNumber = "42"
    val intNumber = strNumber.toInt()
    val doubleNumber = strNumber.toDouble()
    val booleanValue = "true".toBoolean()
    val charValue = 65.toChar()

    println("String to Int: $intNumber")
    println("String to Double: $doubleNumber")
    println("String to Boolean: $booleanValue")
    println("Int to Char (65): $charValue")
    println("Double to String: ${doubleNumber.toString()}")
}
