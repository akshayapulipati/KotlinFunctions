package com.example.funtionspart1

val greetings1:String
    inline get() = "Hello,inline getter"//is inserted wherever we access greetings1
fun main(){
    println(greetings1)


    val sum = add(10, 5)
    println("Sum: $sum")

    println(123.typeName)
    println("Hello".typeName)
}
val adds: (Int, Int) -> Int
    inline get() = { a, b -> a + b }


inline val <reified T> T.typeName: String
    get() = T::class.simpleName ?: "Unknown"