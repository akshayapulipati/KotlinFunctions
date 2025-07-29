package com.example.kotlincritical

data class Student1(val name:String,val age:Int,val grade:String)
fun main() {
    val students = listOf(//studnet obje created
        Student1("Akshaya", 20, "A"),
        Student1("Asha", 21, "B"),
        Student1("Anu", 19, "A+")
    )
    for ((name, age, grade) in students) {
        println("Student name:$name,Age: $age, Grade: $grade")
    }
}