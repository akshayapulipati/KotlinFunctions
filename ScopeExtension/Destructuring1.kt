package com.example.kotlincritical

data class User2(val name:String,val age:Int)
fun main(){
    val user = User2("Akshaya",12)
    //destructuring the user object
    val(name,age) = user //created user obj
    println("Name:$name,Age:$age")
}