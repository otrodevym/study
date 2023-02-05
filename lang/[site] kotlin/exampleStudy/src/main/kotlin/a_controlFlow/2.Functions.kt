package a_controlFlow////### Default Prameter Values and Named Arguments ###
////package org.kotlinlang.play         // 1
////
////fun printMessage(message: String): Unit {
////    println(message)
////}
////
////fun printMessageWithPrefix(message:String, prefix: String = "Info") {
////    println("[$prefix] $message")
////}
////
////fun sum(x: Int, y: Int): Int {
////    return x + y
////}
////
////fun multiply(x: Int, y:Int) = x * y
////
////fun controlFlow.main() {
////    printMessage("hello")
////    printMessageWithPrefix("Hello", "Log")
////    printMessageWithPrefix("Hello")
////    printMessageWithPrefix(prefix = "Log", message= "Hello")
////    println(sum(1, 2))
////    println(multiply(2,4))
////}
//
//
//// ### Infix Functinos ###
//
//fun controlFlow.main() {
//    infix fun Int.times(str: String) = str.repeat(this)
//    println(2 times "Bys ")
//
//    infix fun Int.call(str: Int) = str.plus(this)
//    println(2 call 4)
//
//    val pair = "Ferrari" to "Katrina"
//    println(pair)
//
//    infix fun String.onto(other: String) = Pair(this, other)
//    val myPair = "McLaren" onto "Lucas"
//    println(myPair)
//
//    val sophia = Person("Sophia")
//    val claudia = Person("Claudia")
//    sophia likes claudia
//    sophia.printCall()
//
//}
//
//class Person(val name: String) {
//    val likedPeople = mutableListOf<Person>()
//    infix fun likes(other: Person) { likedPeople.add(other)}
//
//    fun printCall() {
//        println(this.likedPeople.get(0).name)
//    }
//}

// ### Operator Functions ###

//fun controlFlow.main() {
//    operator fun Int.times(str: String) = str.repeat(this)
//    println( 2 * "Bye ")
//
//    operator fun  String.get(range: IntRange) = substring(range)
//    val str = "Always forgive your enemies; nothing annoys them so meuch."
//    println(str[0..14])
//}


// ### Functions with vararg Parameters ###

fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")

    fun printAllWithPrefix(vararg message: String, prefix: String) {
        for (m in message) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "안녕",
        prefix = "Greeting:"
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}
