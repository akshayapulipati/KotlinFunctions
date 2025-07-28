package com.example.kotlincritical

class Outer {
    val outerData = "I'm outer data"

    class Nested {
        fun show() {
            println("I'm inner class")
            //println(outerData)//can't access the outer properties
        }
    }

}
fun main() {
    val nestedObj = Outer.Nested() // No need to create Outer object
    nestedObj.show()
}