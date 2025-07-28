package com.example.kotlincritical

class User1{
    var name:String = ""
    var age: Int = 0

    fun displayInfo(){
        println("User Info name:$name,age:$age")
    }

    override fun toString(): String {
        return "User(name=$name,age=$age)"
    }
}
//extension function to capitalize user's name
fun User1.capitalizeName(){
    name=name.uppercase()
}
//extension function to print summary
fun User1.printSummary(){
    println("summary ->name:$name |age=$age")
}
fun main(){
    val message =User1().apply {
        name="Akshaya"
        age =24
    }.also {
        println("After apply: $it")
    }.also {
        it.capitalizeName()//extension fun used here
    }.also{
        it.printSummary()//another extension used here
    }.run {
        displayInfo()
        "user processing complete"
    }
    println("final message:$message")
    val textMessage = with("Kotlin scope functions") {
        println("Original text: $this")
        println("Length: ${length}")
        println("Lowercase: ${lowercase()}")
        "Finished string operations"
    }
    println("Text Message: $textMessage")

}