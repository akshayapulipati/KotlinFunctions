package com.example.kotlincritical
//class with two properties
//values passed via primary constructoe
class User3(val name:String,val age:Int){
    init {//runs immediately after constructor
        println("creating user object")//prints this after obj is created
        println("Name:$name")
        println("Age:$age")

        //validate logic
        require(age>=0){"age must not be negative"}
    }
    fun greet(){
        println("Hello, my name is $name and I am $age years old.")
    }
}
fun main(){
    val user3=User3("Akshaya",24)//init block runs automatically at this point
    user3.greet()
}