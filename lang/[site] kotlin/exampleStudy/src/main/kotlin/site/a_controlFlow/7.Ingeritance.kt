package site.a_controlFlow//
//// ### Inheritance ##
////open class Dog {
////    open fun sayHello() {
////        println("wow wow!")
////    }
////}
////
////class Yorkshire: Dog() {
////    override fun sayHello() {
////        println("wif wif")
////    }
////}
////
////fun controlFlow.main() {
////    val dog: Dog = Yorkshire()
////    dog.sayHello()
////}
//
//// ### Inheritance with Parameterized Constructor ###
//
//open class Tiger(val origin: String) {
//    fun sayHello() {
//        println("A tiger from $origin say: grrhhhh!")
//    }
//}
//
//class SiberianTiger: Tiger("Siberia")
//
//fun controlFlow.main() {
//
//    val tiger: Tiger = SiberianTiger()
//
//    tiger.sayHello()
//}

// ### Passing Constructor Arguments to SuperClass ###

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")

    }
}

class Asiatic(name: String): Lion(name= name, origin = "India")

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}

