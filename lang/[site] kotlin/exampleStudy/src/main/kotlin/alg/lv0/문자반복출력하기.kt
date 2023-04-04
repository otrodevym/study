package alg.lv0

class 문자반복출력하기 {
//    fun solution(my_string: String, n: Int): String {
//        var answer: String = ""
//        for (c in my_string) {
//            for (v in 1..n) {
//                answer = answer.plus(c)
//            }
//        }
//        return answer
//    }
        fun solution(my_string: String, n: Int) = my_string.map { it.toString().repeat(n) }.joinToString("")
}

fun main() {
    var s = 문자반복출력하기()
    println(s.solution("hello", 3))
}