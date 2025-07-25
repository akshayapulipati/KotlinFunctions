package com.example.funtionspart1

inline fun performAction(
    action1:() ->Unit,
    noinline action2:()->Unit
){
    action1()
    val runLater = action2//  Only allowed because it's noinline
    runLater()// can be stored or called later
}
fun main(){
    performAction(
        { println("Action1 : is inlinr")},
        {println("Action2 i s:noinline")}
    )
}