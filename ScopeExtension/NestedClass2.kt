package com.example.kotlincritical

class Outer1{
    val outerData1 ="I'm outer class"

    inner class Inner{
        fun show1(){
            println("I;m inner class. accessing outer data:$outerData1")
        }
    }
}
fun main(){
    val outerObj =Outer1()//instance/obj of outer class
    val innerObj =outerObj.Inner()//need outer object first
    innerObj.show1()
}