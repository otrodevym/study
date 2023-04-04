package alg.lv0

class 점의위치구하기 {
    fun solution(dot: IntArray): Int {
//        var answer: Int = 0
//        if (dot[0] > 0 && dot[1] > 0) {
//            answer = 1
//        } else if (dot[0] < 0 && dot[1] < 0) {
//            answer = 3
//        } else if (dot[0] > 0 && dot[1] < 0) {
//            answer = 4
//        } else if (dot[0] < 0 && dot[1] > 0) {
//            answer = 2
//        } else {
//
//        }


//        return answer

        return when{
            (dot[0] > 0 && dot[1] > 0) -> 1
            (dot[0] < 0 && dot[1] < 0) -> 3
            (dot[0] > 0 && dot[1] < 0) -> 4
            (dot[0] < 0 && dot[1] > 0) -> 2
            else -> -1
        }
    }
}

fun main() {
    var r = 점의위치구하기()
    println(r.solution(intArrayOf(2,4)) == 1)
    println(r.solution(intArrayOf(-7,9)) == 2)
    println(r.solution(intArrayOf(-7,-9)) == 3)
    println(r.solution(intArrayOf(2,-9)) == 4)
    println(r.solution(intArrayOf(-7,9)) == 2)
}