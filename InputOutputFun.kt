package com.example.funtionspart1

fun main(){
    print("Enter your name: ")
    val name = readLine()//waits for user input
    println("Hello $name")
    print("Enter you age: ")
    val age = readLine()?.toInt()//safe call and conversion
    println("you are $age years old.")
}