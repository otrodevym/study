package alg.lv0

class 중앙값구하기 {
    fun solution(array: IntArray): Int {

        return array.sortedArray()[array.size.div(2)]
    }
}

fun main() {
    var s = 중앙값구하기()
//    var result: Int = s.solution(intArrayOf(1, 2, 7, 10, 11))
    var result: Int = s.solution(intArrayOf(9, -1, 0))
    println(result)
}