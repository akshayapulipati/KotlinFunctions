package com.example.kotlincritical
//multiple operations
fun main(){
    val name = "Akshaya"

    val result = with(name) {
        println("Uppercase: ${this.uppercase()}")
        println("Length: ${this.length}")
        this.reversed()  // Returned
    }

    println("Reversed: $result")

}