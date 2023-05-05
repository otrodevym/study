package alg.lv1

class 이상한문자만들기 {
    fun solution(s: String) = s.split(" ")
        .map { it.mapIndexed { index, c -> if (index.rem(2) == 0) c.uppercase() else c.lowercase() }.joinToString("") }
        .joinToString(" ")
}

fun main() {
    var s = 이상한문자만들기()
    println(
        s.solution("try hello world")
        //.contentEquals("TrY HeLlO WoRlD")
    )
}