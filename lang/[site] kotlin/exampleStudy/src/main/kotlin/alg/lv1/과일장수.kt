package alg.lv1

class 과일장수 {
    fun solution(k: Int, m: Int, score: IntArray) = score.sortedDescending().chunked(m).filter { it.size == m }.sumOf { it.last().times(m) }
}

fun main() {
    var s = 과일장수()
//    println(s.solution(3,4, intArrayOf(1, 2, 3, 1, 2, 3, 1))
//            == 8
//    )
//    println(s.solution(4,3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2))
//            == 33
//    )
//    println(s.solution(4,3, intArrayOf(4, 2))
//            == 0
//    )
//        println(s.solution(4,4, intArrayOf(4, 4, 3, 3, 3, 2, 2, 2, 1))
//            == 20
//    )
    println(s.solution(9,2, intArrayOf(7, 7, 6, 5, 2))
//            == 24
    )
    println(s.solution(7,2, intArrayOf(7, 7, 5, 3, 3, 3, 1))
//            == 26
    )
//    9 2 [] 답 24
//    7 2 [] 답 26
}