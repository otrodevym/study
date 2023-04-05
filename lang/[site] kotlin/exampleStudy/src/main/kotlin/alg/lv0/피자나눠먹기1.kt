package alg.lv0

import kotlin.math.ceil

class 피자나눠먹기1 {
    companion object{
        private const val PIZZA_SIZE = 7.0
        private const val PIZZA_PLUS = 1.0
    }
//    fun solution(n: Int): Int {
//        var r1 = n.div(PIZZA_SIZE)
//        if(n.mod(PIZZA_SIZE) != 0) {
//            r1 = r1.plus(PIZZA_PLUS)
//        }
//        return r1;
//    }
    fun solution(n: Int) = ceil(n.div(PIZZA_SIZE)).toInt()
}

fun main() {
    var r = 피자나눠먹기1()
    println(r.solution(7))
    println(r.solution(1))
    println(r.solution(15))
}