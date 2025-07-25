package com.example.funtionspart1

inline fun calculate(x: Int,y: Int,operation:(Int,Int) ->Int):Int{
    return operation(x,y)
}
fun main(){
    val sum = calculate(10,5){a,b ->a+b}
    println(sum)
    val product = calculate(10,5){a,b ->a*b}
    println(product)
}