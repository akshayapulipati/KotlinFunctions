package com.example.funtionspart1

// Higher-order function
fun greetUser(name: String, greetingFunction: (String) -> String): String {
    return greetingFunction(name)
}

fun main() {
    // Lambda that returns a welcome message
    val simpleGreeting = { username: String -> "Hello, $username!" }

    // Lambda that returns a formal greeting
    val formalGreeting = { username: String -> "Good evening, Mr./Ms. $username." }

    val message1 = greetUser("Akshaya", simpleGreeting)
    val message2 = greetUser("Asha", formalGreeting)

    println(message1)
    println(message2)
}
