package alg.lv1

class 문자열다루기 {
    fun solution(s: String) =
        ((s.length == 4).or(s.length ==6)).and("[0-9]".toRegex().findAll(s).map { it.value }.toList().size == s.length)
//        "[0-9]{4}".toRegex().findAll(s).map { it.value }.toList().isNotEmpty()
}

fun main() {
    var s = 문자열다루기()
    println(s.solution("a234") == false)
    println(s.solution("1234") == true)
    println(s.solution("aa23456") == false)
    println(s.solution("aa345678") == false)
    println(s.solution("0123456789") == false)
}