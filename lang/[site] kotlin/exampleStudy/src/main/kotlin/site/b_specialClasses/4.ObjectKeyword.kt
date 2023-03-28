package site.b_specialClasses
//////
//////import java.util.Random
//////
//////class LuckDispatcher {
//////    fun getNumber() {
//////        var objRandom = Random()
//////        println(objRandom.nextInt(90))
//////    }
//////}
//////
//////fun main() {
//////    val d1 = LuckDispatcher()
//////    val d2 = LuckDispatcher()
//////    d1.getNumber()
//////    d2.getNumber()
//////}
////
////fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
////    val dayRates = object {
////        var standard: Int = 30 * standardDays
////        var festivity: Int = 50 * festivityDays
////        var special: Int = 100 * specialDays
////    }
////    val total = dayRates.standard + dayRates.festivity + dayRates.special
////    print("Total price: $$total")
////
////}
////
////fun main() {
////    rentPrice(10, 2, 1)
////}
//
//object DoAuth {
//    fun takeParams(username: String, password: String) {
//        println("input Auth parameters = $username:$password")
//    }
//
//}
//
//fun main() {
//    DoAuth.takeParams("foo", "qwerty")
//}

class BigBen {
    companion object BB {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("Bong ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)
}