package com.example.funtionspart1

inline fun runTask(crossinline task:()->Unit){
    // lambda passed to another object (Runnable)
    val runnable = Runnable {
        task() //lambda still runs,but cant use return
    }
    runnable.run()
}
fun main(){
    runTask{
        println("hello from crossline lambda")
      //  return not allows here,prevents from unsafe behaviour
    }
}