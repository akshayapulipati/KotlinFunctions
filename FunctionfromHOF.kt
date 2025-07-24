package com.example.funtionspart1

// Higher-order function that returns a function
fun getGreetingFunction(): (String) -> String {
    return { name: String -> "Hello, $name!" }
}

fun main() {
    val greet = getGreetingFunction()  // greet is now a function
    val message = greet("Akshaya")     // Call the returned function
    println(message)
}
