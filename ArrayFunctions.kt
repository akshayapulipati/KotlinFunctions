package com.example.funtionspart1

fun main(){
    val numbers =  arrayOf(10,20,30,40,50)
    println("size:${numbers.size}")
    println("First:${numbers.first()}")
    println("Last:${numbers.last()}")
    numbers.set(1,99)
    println("after modifying:${numbers.contentToString()}")
    println("Index:${numbers.indexOf(30)}")
    println("contains${numbers.contains(40)}")
    println("sum${numbers.average()}")
    println("sorted${numbers.sorted()}")
    println("${numbers.reversed()}")
    println("all elements")
    numbers.forEach { println(it) }
}