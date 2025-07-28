package com.example.kotlincritical

class Person {
    var name: String = ""
    var age:Int = 0

    fun displayInfo(){
        println("Name: $name")
        println("Age: $age")
    }
}
fun main(){
    val person1 = Person()//creating an object
    person1.name ="Akshaya"
    person1.age= 24
    person1.displayInfo()

    val person2 = Person()
    person2.name ="Asha"
    person2.age =22
    person2.displayInfo()
}