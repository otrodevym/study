package alg.lv0

class 숫자찾기 {
//    fun solution(num: Int, k: Int): Int {
//        var answer: Int = -1
////        println(num.toString().indexOf(k.digitToChar() + 1))
////        println(num.toString().toList().find { it == k.digitToChar() })
////        num.toString().
//        for ((index, value) in num.toString().toList().withIndex()) {
//            if (value.digitToInt() == k) {
//                answer = index + 1
//                break;
//            }
//        }
//
//        return answer
//    }

    fun solution(num: Int, k: Int) = "_$num".indexOf(k.toString())
}

fun main() {
    var s = 숫자찾기()
//    println(s.solution(29183,	1) == 3)
//    println(s.solution(232443,	4) == 4)
//    println(s.solution(123456,	7) == -1)
    println(s.solution(29183,	1))
    println(s.solution(232443,	4))
    println(s.solution(123456,	7))

}

//29183	    1	3
//232443	4	4
//123456	7	-1