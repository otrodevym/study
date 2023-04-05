package alg.lv0

import site.c_functional.joinToString

class 대문자와소문자 {
//    fun solution(my_string: String): String {
//        var answer: String = ""
//        for (c in my_string) {
//            if (c.isLowerCase()) {
//                answer += c.uppercase()
//            } else {
//                answer+= c.lowercase()
//            }
//        }
//        return answer
//    }
    fun solution(my_string: String) = my_string.map { if(it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString("")
}

fun main() {
    var r = 대문자와소문자()
    println(r.solution("cccCCC").contentEquals("CCCccc"))
    println(r.solution("abCdEfghIJ").contentEquals("ABcDeFGHij"))
}