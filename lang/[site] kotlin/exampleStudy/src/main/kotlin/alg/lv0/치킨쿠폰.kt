package alg.lv0

import kotlin.math.floor

class 치킨쿠폰 {

        private tailrec fun factorial(acc: Int): Int {
        var r = acc.div(10)
        var re = acc.rem(10)

        if(acc < 10){
            return 0
        }

        return r + factorial(r.plus(re))
    }
    fun solution(chicken: Int): Int {
////        1081 / 10 = 108..1
////        108 / 10 = 10..8
////        10 / 10 = 1..0
//        var c: Int = 0
//        var chickenTemp = chicken
//        while (true) {
//            var r = floor(chickenTemp.div(10).toDouble())
//            var re = chickenTemp.rem(10)
//            c = c.plus(r).toInt()
//            chickenTemp = r.plus(re).toInt()
//            if (chickenTemp == 1) {
//                return c
//            }
//        }
//        return 0
        return factorial(chicken)
    }
}

fun main() {
    var s = 치킨쿠폰()
    println(s.solution(100) == 11)
    println(s.solution(1081) == 120)
    println(s.solution(1000000))
    println(s.solution(100000))

}