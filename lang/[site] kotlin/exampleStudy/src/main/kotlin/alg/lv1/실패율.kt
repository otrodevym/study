package alg.lv1

class 실패율 {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        return answer.toIntArray()
    }
}

fun main() {
    var s = 실패율()
    println(s.solution(5, intArrayOf(2,1,2,6,2,4,3,3)).contentEquals(intArrayOf(3,4,2,1,5)))
//    println(s.solution(4, intArrayOf(4,4,4,4,4)).contentEquals(intArrayOf(4,1,2,3)))
//    5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//    4	[4,4,4,4,4]	[4,1,2,3]
}