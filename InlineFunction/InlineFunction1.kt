package com.example.funtionspart1

//without inline no paremeters and return type
fun log1(action1:() ->Unit){
    println("starting1")
    action1()
    println("endin1")
}
//with inline
inline fun log(action:() -> Unit){
    println("start")
    action()
    println("end")
}
fun main(){
    log1 { println("log1 lambda") }
    log { println("inside lambda") }

}