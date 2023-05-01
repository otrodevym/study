package alg.lv0

class 종이자르기 {
    fun solution(M: Int, N: Int): Int {
        var answer: Int = 0
        return (M * N) - 1
    }
}

fun main() {
    var s = 종이자르기()
    println(s.solution(2, 2) == 3)
    println(s.solution(2, 5) == 9)
    println(s.solution(1, 1) == 0)
}