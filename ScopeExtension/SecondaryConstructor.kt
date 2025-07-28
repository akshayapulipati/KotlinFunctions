package com.example.kotlincritical

class Student {
    var name: String
    var age: Int

    // Secondary constructor
    constructor(name: String, age: Int) {
        this.name = name//sets the properties using this
        this.age = age
    }

    fun showDetails() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val student1 = Student("Asha", 22)
    student1.showDetails()
}
