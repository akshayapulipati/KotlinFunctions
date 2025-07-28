package com.example.kotlincritical

class Person2(val name:String,val age:Int){
    fun showDetails(){
        println("Nmae:$name,Age:$age")
    }
}
fun main() {
    val person1 = Person2("Akshaya", 25)
    person1.showDetails()
}
