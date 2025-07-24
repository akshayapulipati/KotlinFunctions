package com.example.funtionspart1
//checkinh if a number statisfies condition

// Higher-order function that takes a number and a lambda condition
fun checkNumber(number:Int,
                condition:(Int) ->Boolean):Boolean{//a fun that takes int returns boolean
    return condition(number)
}
fun main(){
    val isEven ={n:Int -> n%2 ==0}
    val result1 = checkNumber(10,isEven)
    val result2 = checkNumber(7,isEven)

    println("Is 10 even:$result1")
    println("Is 7 even:$result2")
}