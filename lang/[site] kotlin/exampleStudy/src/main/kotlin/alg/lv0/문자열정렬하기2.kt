package alg.lv0

import site.c_functional.joinToString

class 문자열정렬하기2 {
    fun solution(my_string: String) = my_string.lowercase().toList().sorted().joinToString("")
}

fun main() {
    var s = 문자열정렬하기2()
    println(s.solution("Bcad").contentEquals("abcd"))
    println(s.solution("heLLo").contentEquals("ehllo"))
    println(s.solution("Python").contentEquals("hnopty"))
}
