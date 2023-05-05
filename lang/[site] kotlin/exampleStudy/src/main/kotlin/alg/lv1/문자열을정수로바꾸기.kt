package alg.lv1

class 문자열을정수로바꾸기 {
    fun solution(s: String) = s.toInt()
}

fun main() {
    var s = 문자열을정수로바꾸기()
    println(s.solution("1234") == 1234)
    println(s.solution("-1234") == -1234)
}