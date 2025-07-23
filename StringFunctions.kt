package com.example.funtionspart1

fun main(){
    val message =" Akshaya Pulipati "
    println("Original:$message")
    println("Length : ${message.length}")
    println("Trimmes: ${message.trim()}")
    println("uppercase: ${message.uppercase()}")
    println("lowercase: ${message.lowercase()}")
    println("contains 'pulipati ${message.contains("Pulipati")}")
    println("starts with 'A' ${message.startsWith("A")}")
    println("ends with 'ati ${message.endsWith("ati")}")
    println("substring:${message.substring(2,9)}")
    println("replace:${message.replace("Akshaya","Ranjith")}")
    val words =message.trim().split(" ")
    println("Split: $words")
    println("reversed:${message.reversed()}")
    val a = "apple"
    val b = "banana"
    val c = "apple"

    println("a.compareTo(b): " + a.compareTo(b))
    println("a.compareTo(c): " + a.compareTo(c))
    println("b.compareTo(a): " + b.compareTo(a))
}