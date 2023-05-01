package alg.lv0

class 컨트롤제트 {
//    fun solution(s: String): Int {
//        var answer: Int = 0
//        var temp: Int = 0
//        for (i in s.split(" ")) {
//            if (i == "Z") {
//                answer -= temp
//            } else {
//                answer += i.toInt()
//                temp = i.toInt()
//            }
//
//        }
//        return answer
//    }

    fun solution(s: String) = s.split(" ")
        .mapIndexed { index, str -> if (str == "Z") -(s.split(" ")[index - 1].toInt()) else str.toInt() }
        .sum()
}

fun main() {
    var s = 컨트롤제트()
    println(s.solution("1 2 Z 3") == 4)
    println(s.solution("10 20 30 40") == 100)
    println(s.solution("10 Z 20 Z 1") == 1)
    println(s.solution("1 2 Z 3") == 4)
    println(s.solution("1 2 Z 3") == 4)
}
//"1 2 Z 3"	4
//"10 20 30 40"	100
//""	1
//"10 Z 20 Z"	0
//"-1 -2 -3 Z"	-3