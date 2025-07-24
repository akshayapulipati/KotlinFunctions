package com.example.funtionspart1

fun operate(x:Int,y:Int,op:(Int,Int)->Int):Int{
    return op(x,y)
}
//means no type declaration on operate
fun main(){
    // Type declared inside lambda
    val sum1 = {a:Int,b:Int ->a+b}
    // Type declared on the variable
    val sum2:(Int,Int) ->Int ={a,b ->a+b}
    // No type declared, uses context from operate()
    val result = operate(10,20){a,b ->a+b}


    println(sum1(2, 3))
    println(sum2(4, 5))
    println(result)
}