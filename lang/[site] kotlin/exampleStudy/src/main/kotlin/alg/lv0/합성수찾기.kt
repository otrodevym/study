package alg.lv0

class 합성수찾기 {
//    fun solution(n: Int): Int {
//        var answer: Int = 0
//
//        for (i in 1..n) {
//            var c: Int = 0
//            for (j in 1..i) {
//                if (i.mod(j) == 0) {
//                    c++
//                }
//            }
//            if (c > 2) {
//                answer++
//            }
//        }
//        return answer
//    }

    fun solution(n: Int) = (1..n).filter { i -> (1..i).filter { i.mod(it) == 0 }.size > 2 }.size
}

fun main() {
    var s = 합성수찾기()
//    println(s.solution(10))
//    println(s.solution(15))
    println(s.solution(10) == 5)
    println(s.solution(15) == 8)
}