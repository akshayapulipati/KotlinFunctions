package com.example.funtionspart1

//user defined
infix fun Int.addTo(other: Int): Int {
    return this + other
}
infix fun String.connectWith(other: String): String {
    return "$this & $other"
}

fun main() {
    val result = 10 addTo 5   //  infix notation
    println(result)
    val result1 = "Akshaya" connectWith "Pulipati"
    println(result1)
}
