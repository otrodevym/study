package alg.lv1

import kotlin.math.abs

class x만큼간격이있는n개의숫자 {
    fun solution(x: Int, n: Int) =
        (1..n).map { x.toLong().times(it).toLong() }.toList().toLongArray()
}

fun main() {
    var s = x만큼간격이있는n개의숫자()
    println(s.solution(2, 5).contentEquals(longArrayOf(2, 4, 6, 8, 10)))
    println(s.solution(4, 3).contentEquals(longArrayOf(4, 8, 12)))
    println(s.solution(-4, 2).contentEquals(longArrayOf(-4, -8)))
}