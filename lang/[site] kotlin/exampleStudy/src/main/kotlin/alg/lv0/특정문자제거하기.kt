package alg.lv0

class 특정문자제거하기 {
//    fun solution(my_string: String, letter: String) = my_string.toCharArray().filter { it != letter[0] }.joinToString("")
    fun solution(my_string: String, letter: String) = my_string.filter { it != letter[0] }
}

fun main() {
    var s = 특정문자제거하기()
    println(s.solution("abcdef","f") == "abcde")
    println(s.solution("BCBdbe","B") =="Cdbe")
}