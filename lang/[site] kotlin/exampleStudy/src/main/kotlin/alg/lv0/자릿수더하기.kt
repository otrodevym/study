package alg.lv0

class 자릿수더하기 {
    fun solution(n: Int) = n.toString().sumOf { it.digitToInt() }
}

fun main() {
    var r = 자릿수더하기()
    println(r.solution(1234) == 10)
    println(r.solution(930211) == 16)
}