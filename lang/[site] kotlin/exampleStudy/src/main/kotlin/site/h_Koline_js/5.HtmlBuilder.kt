package site.h_Koline_js

open class Person(val name: String, val age: Int){
    init {
        println("name : $name")
        println("age : $age")
    }
}

fun main() {
    Person(name = "yong", age = 10)
}

