package alg.lv0

class 제곱수판별하기 {
//    fun solution(n: Int): Int {
//        var answer: Int = 0
//        return if((1..n).map { (it * it) == n }.count{ it } > 0) 1 else 2
//        if ((1..n).map { (it * it) == n }.count{ it == true}) {
//            return 1
//        } else {
//            return 2
//        }
//        return answer
//    }
    fun solution(n: Int) = if((1..n).map { (it * it) == n }.count{ it } > 0) 1 else 2
}

fun main() {
    var s = 제곱수판별하기()
    println(s.solution(144) == 1)
    println(s.solution(976) == 2)
}