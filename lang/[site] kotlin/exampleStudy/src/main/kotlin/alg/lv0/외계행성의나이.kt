package alg.lv0

import site.c_functional.joinToString

class 외계행성의나이 {
    fun solution(age: Int) = age.toString().toList().map { ( 97 + it.digitToInt()).toChar() }.joinToString("")
//    fun solution(age: Int): String {
//        var answer: String = ""
//        var c: Int = age
//        while (true) {
//            var n = c.mod(10)
//            answer += n.toChar() + 97
//            if (c.div(10) == 0 && c == c.mod(10)) {
//                break
//            }
//            c = c.div(10)
//        }
//        return answer.reversed()
//    }
}

fun main() {
    var r = 외계행성의나이()
    println(r.solution(23) == "cd")
    println(r.solution(51) == "fb")
    println(r.solution(100) == "baa")
    println(r.solution(1) == "b")
    println(r.solution(1))
}