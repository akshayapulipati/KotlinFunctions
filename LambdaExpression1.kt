package com.example.funtionspart1
//type declaration inside a lambda
val add = {a:Int, b:Int -> a+b}
fun main(){
    val result= add(5,3)
    println("Sum: $result")
}
