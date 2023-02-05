package a_controlFlow

// ### when statement ###
//fun controlFlow.main() {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(controlFlow.Myclass())
//    cases("hello")
//}
//
//fun cases(obj: Any) {
//    when (obj) {
//        1 -> println ("One")
//        "Hello" -> println("Greeting")
//        is Long -> println("Long")
//        !is String -> println("Not a String")
//        else -> println("Unknown")
//    }
//}
//
class Myclass

// ### when Expression ###

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign("3.4"))
    println(whenAssign(1))
    println(whenAssign(Myclass()))
}

fun whenAssign(obj: Any) : Any {
    val result = when( obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}