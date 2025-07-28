package com.example.kotlincritical

class Employee(val id: Int) {//primary constructor val id
    var name: String = "Unknown"

    // Secondary constructor calls primary using `: this(.)`
    constructor(id: Int, name: String) : this(id) {
        this.name = name//thsi updates unknown to given value
    }

    fun showDetails() {
        println("ID: $id, Name: $name")
    }
}

fun main() {
    val emp1 = Employee(101)
    emp1.showDetails()

    val emp2 = Employee(102, "Akshaya")
    emp2.showDetails()
}
