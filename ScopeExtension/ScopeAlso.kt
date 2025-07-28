package com.example.kotlincritical

fun main(){
    val name = "Akshaya"

    val result = name.also {
        println("Original name: $it")
    }.uppercase()

    println("Uppercase name: $result")

}