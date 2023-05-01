package alg.lv0

class 문자열계산하기 {
//    fun solution(my_string: String): Int {
//        var answer: Int = 0
//        var s = my_string.split(" ")
//        var temp = "0"
//        var calc = ""
//        s.forEach {
//            if (it == "+") {
//                calc = "+"
//            } else if (it == "-") {
//                calc = "-"
//            } else {
//                if (calc == "") {
//                    answer = it.toInt()
//                } else {
//                    if (calc == "+") {
//                        answer = answer.plus(it.toInt())
//                    } else if (calc == "-") {
//                        answer = answer.minus(it.toInt())
//                    }
//                    calc = ""
//                }
//            }
//
//        }
//        return answer
//    }
    fun solution(my_string: String) = my_string.replace("- ".toRegex(), "-")
    .replace("[+] ".toRegex(), "")
    .split(" ")
    .sumOf { it.toInt() }
}

fun main() {
    var s = 문자열계산하기()
    println(s.solution("3 + 4") == 7)
    println(s.solution("3 - 4") == -1)
    println(s.solution("1 - 1 + 1") == 1)
}