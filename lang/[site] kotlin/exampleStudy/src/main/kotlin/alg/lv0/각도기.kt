package alg.lv0

class 각도기 {
    //    fun solution(angle: Int): Int {
//        var answer: Int = 0
//        if (angle in 1..90) {
//            answer = 1
//        } else if (angle == 90) {
//            answer = 2
//        }else if (angle in 91..179) {
//            answer = 3
//        } else if (angle == 180) {
//            answer = 4
//        }
//        return answer
//        }
    fun solution(angle: Int) = when {
        (angle in 1..89) -> 1
        (angle == 90) -> 2
        (angle in 91 .. 179) -> 3
        else -> 4
    }
}

fun main() {
    var s = 각도기()
//    var r = s.solution(70)
//    var r = s.solution(91)
    var r = s.solution(180)
    println(r)
}