package alg.lv1

class 자릿수더하기 {
    fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()
}

fun main() {
    var s = 자릿수더하기()
    println(s.solution(123) == 6)
    println(s.solution(987) == 24)
}