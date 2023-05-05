package alg.lv1

class 문자열내림차순정렬하기 {
    fun solution(s: String) = s.toCharArray().sortedArrayDescending().joinToString("")
}

fun main() {
    var s = 문자열내림차순정렬하기()
    println(s.solution("Zbcdefg").contentEquals("gfedcbZ"))
}