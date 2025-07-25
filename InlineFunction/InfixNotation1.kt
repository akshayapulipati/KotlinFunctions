package com.example.funtionspart1

infix fun Int.repeatWord(word: String):String{
    return word.repeat(this)
}
fun main(){
    val message = 3 repeatWord "Hi" //3.repeatWord("Hi ")
    println(message)
}