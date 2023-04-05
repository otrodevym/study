package alg.lv0

import site.c_functional.joinToString

class 가위바위보 {
    fun solution(rsp: String)= rsp.map {
        when (it) {
            '2' -> "0"
            '0' -> "5"
            '5' -> "2"
            else -> "-1"
        }
    }.joinToString("")
}

fun main() {
    var r = 가위바위보()
    println(r.solution("2") == "0")
    println(r.solution("205") == "052")
}