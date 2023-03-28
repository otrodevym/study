package site.g_ProductivityBoosters
////
////fun findMinMax(list: List<Int>): Pair<Int, Int> {
////    return Pair(50, 100)
////}
////
////fun main() {
////    val (x, y, z) = arrayOf(5, 10, 15)
////    val map = mapOf("Alice" to 21, "Bob" to 25)
////    for ((name, age) in map){
////        println("$name is $age years old")
////    }
////
////    val (min, max) = findMinMax(listOf(100, 90, 50 ,98, 76, 83))
////    println("$min, $max")
////}
//
//
//data class User(val username:String, val email:String)
//
//fun getUser() = User("Mary", "mary@somewhere.com")
//
//fun main() {
//    val user = getUser()
//    val (username, email) = user
//    println(username == user.username)
//    println(username === user.username)
//    val(_,_) = getUser()
//
//}


class Pair<K, V>(private val first: K, private val second: V){
    operator fun component1(): K {
        return first
    }
    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (num, name) = Pair(1, "One")
    println("num $num, name $name")
}