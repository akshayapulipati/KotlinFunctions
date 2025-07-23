package com.example.funtionspart1

fun showDetails(name: String = "Guest", age: Int = 18, city: String = "Hyderabad") {
    println("Name: $name, Age: $age, City: $city")
}
fun main(){
   // showDetails()//no arguments passed
    showDetails(name="Akshaya")//partial arguments passes one name and other are default
    //showDetails("Asha", 22, "Bangalore")//all arguments passes
}