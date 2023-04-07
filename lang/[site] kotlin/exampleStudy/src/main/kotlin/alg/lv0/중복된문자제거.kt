package alg.lv0

import site.c_functional.joinToString

class 중복된문자제거 {
    fun solution(my_string: String) =my_string.toList().distinct().joinToString("")
}

fun main() {
    var s = 중복된문자제거()

    println(s.solution("people").contentEquals("peol"))
    println(s.solution("We are the world").contentEquals("We arthwold"))
}