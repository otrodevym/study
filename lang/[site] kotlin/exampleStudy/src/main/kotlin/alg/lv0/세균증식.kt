package alg.lv0

import kotlin.math.sqrt

class 세균증식 {
//    fun solution(n: Int, t: Int): Int {
//        var answer: Int = n
//        for (i in 1..t) {
//            answer = answer.times(2)
//        }
//
//        return answer
//    }
//    fun solution(n: Int, t: Int): Int = (1..t).fold(n) {acc: Int, _: Int -> acc * 2 }
    fun solution(n: Int, t: Int) = n shl t
}

fun main() {
    var r = 세균증식()
    println(r.solution(2,	10) )
    println(r.solution(2,	10) ==	2048)
    println(r.solution(7,	15) ==	229376)
}