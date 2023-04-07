package alg.lv0

import kotlin.math.abs
import kotlin.math.absoluteValue

class 가까운수 {
//        fun solution(array: IntArray, n: Int) = array.sorted().minBy { (n - it).absoluteValue }
//    fun solution(array: IntArray, n: Int): Int {
//        var answer: Int = 0
//        var minValue: Int = array.minOf { (n - it).absoluteValue }
//
//        for (i in array.sorted()) {
//            if ((n - i).absoluteValue == minValue) {
//                answer = i
//                break
//            }
//        }
//        return answer
//    }

    fun solution(array:IntArray, n: Int) = array.sorted().minWithOrNull(
        compareBy{ abs(n - it) })!!
}

fun main() {
    var s = 가까운수()
    println(s.solution(intArrayOf(3, 10, 28), 20) == 28)
    println(s.solution(intArrayOf(10, 11, 12), 13) == 12)
    println(s.solution(intArrayOf(9, 11, 12), 10) == 9)
    println(s.solution(intArrayOf(15, 11, 13), 14) == 13)
//    println(s.solution(intArrayOf(3, 10, 28), 20))
//    println(s.solution(intArrayOf(10, 11, 12), 13))
}
