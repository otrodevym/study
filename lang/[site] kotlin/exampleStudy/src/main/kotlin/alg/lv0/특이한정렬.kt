package alg.lv0

import kotlin.math.abs


class P(var origin: Int, var index: Int, var nMinus: Int)
class 특이한정렬 {
    fun solution(numlist: IntArray, n: Int) =
        numlist.map { P(it, 0, abs(n - it)) }.sortedWith(
            compareBy({ it.nMinus }, { -it.origin })
        ).map { it.origin }.toList().toIntArray()
//    fun solution(numlist: IntArray, n: Int): IntArray {
//
//        var pList = mutableListOf<P>()
//        for (i in numlist) {
//            var p = P(i, 0, abs(n - i))
//            pList.add(p)
//        }
//
//        return pList
//            .sortedWith(compareBy({it.nMinus}, { -it.origin})).map { it.origin }.toList().toIntArray()
//    }
}

fun main() {
    var s = 특이한정렬()
    println(
        s.solution(intArrayOf(1, 2, 3, 4, 5, 6), 4)
            .contentEquals(intArrayOf(4, 5, 3, 6, 2, 1))
    )
    println(
        s.solution(intArrayOf(10000, 20, 36, 47, 40, 6, 10, 7000), 30)
            .contentEquals(intArrayOf(36, 40, 20, 47, 10, 6, 7000, 10000))
    )
}