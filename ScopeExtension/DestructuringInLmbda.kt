package com.example.kotlincritical

fun main() {
    val map = mapOf("Akshaya" to 24, "Anu" to 22)

    // Destructuring key and value from the map in a lambda
    map.forEach { (key, value) ->
        println("Name: $key, Age: $value")
    }
}
