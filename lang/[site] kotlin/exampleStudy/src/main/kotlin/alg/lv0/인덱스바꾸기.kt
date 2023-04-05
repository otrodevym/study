package alg.lv0

import java.util.*

class 인덱스바꾸기 {
//    fun solution(my_string: String, num1: Int, num2: Int): String {
//        var answer: String = ""
//        for ((index, c) in my_string.withIndex()) {
//            if (index == num1) {
//                answer += my_string[num2]
//
//            } else if(index == num2) {
//                answer += my_string[num1]
//            } else{
//
//                answer += c
//            }
//        }
//        return answer
//    }
        fun solution(my_string: String, num1: Int, num2: Int): String {
            return my_string.toList().let {
                Collections.swap(it, num1, num2)
                it.joinToString("")
            }
        }
}

fun main() {
    var r = 인덱스바꾸기()
    println(r.solution("hello", 1, 2).contentEquals("hlelo"))
    println(r.solution("I love you",3, 6).contentEquals("I l veoyou"))
}