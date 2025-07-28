package com.example.kotlincritical

class User{
    var name: String =""
    var age: Int = 0

    fun displayInfo(){//prints tge user data
        println("User info Name:$name,Age:$age")
    }

    override fun toString(): String {
        return "User(name=$name,age=$age)"
    }
}
fun main(){
    val message =User().apply { //apply:initialize object
        name="Akshaya"
        age=24
    }.also {                       //log the current state(logging &debugging
        println("After applying$it")
    }.let {                       //let:modify or use object
        it.name =it.name.uppercase()
        it
    }.run{                        // run: do final work, return something
        displayInfo()
        "User processing complete"
    }
    val textMessage =with("Kotlin scope functions") {   // with: do multiple actions on string
        println("original text:$this")
        println("Length ${length}")
        println("Lowercase: ${lowercase()}")
        "Finished string operations"


    }

    println("Text Message: $textMessage")
}