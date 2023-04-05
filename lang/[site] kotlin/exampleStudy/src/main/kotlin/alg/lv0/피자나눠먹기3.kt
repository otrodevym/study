package alg.lv0

import kotlin.math.ceil

class 피자나눠먹기3 {
    fun solution(slice: Int, n: Int) = ceil(n.div(slice.toDouble())).toInt()
}

fun main() {
    var r = 피자나눠먹기3()
    println(r.solution(7,10))
    println(r.solution(4,12))
}