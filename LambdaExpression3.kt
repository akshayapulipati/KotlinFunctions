package com.example.funtionspart1

//Lambda expression with return type int,string,unit

//retyrn type int
val addition:(Int,Int) -> Int ={ a,b -> a+b}

//return type string
val greetings:(String) ->String ={name -> "Hello $name"}

//no return type(lambda returning Unit
val printMessage: (String) ->Unit= { message -> println("Message $message") }
fun main(){
    println("Sum $addition(10,5)")
    println(greetings("Akshaya"))
    printMessage("Kotlin is fun")
}