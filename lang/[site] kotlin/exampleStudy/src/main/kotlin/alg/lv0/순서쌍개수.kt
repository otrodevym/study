package alg.lv0

class 순서쌍개수 {
//    fun solution(n: Int): Int {
//        var answer: Int = 0
//        var i = 1
//        while (n >= i) {
//            if (n.mod(i) == 0) {
//                answer++
//            }
//            i++
//        }
//        return answer
//    }

    fun solution(n: Int) = (1..n).count { n.mod(it) == 0 }
}

fun main() {
    var r = 순서쌍개수()
    println(r.solution(20) == 6)
    println(r.solution(100) == 9)

}