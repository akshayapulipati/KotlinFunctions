package com.example.funtionspart1

// Lambda
val squareLambda = { x: Int -> x * x }

// Anonymous Function
val squareAnon = fun(x: Int): Int {
    return x * x
}
fun main() {
    println(squareLambda(4))
    println(squareAnon(4))
}
