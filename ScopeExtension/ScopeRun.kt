package com.example.kotlincritical
fun main() {


    val name = "Akshaya"

    val length = name.run {
        println("Uppercase: ${this.uppercase()}")
        this.length  // Returned
    }

    println("Length: $length")
}

