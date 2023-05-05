package alg.lv1

class 콜라츠추측 {
    fun solution(num: Int): Int {
        var answer = num.toLong()
        if (answer == 1L) {
            return 0
        }
        for (i in 1..500) {
            if (answer.rem(2) == 0L) {
                answer = answer.div(2)
            } else if (answer.rem(2) != 0L) {
                answer = answer.times(3).plus(1)
            }
            if (answer == 1L) {
                return i
            }
        }
            return -1
        }
}

fun main() {
    var s = 콜라츠추측()
//    println(s.solution(6) == 8)
//    println(s.solution(16) == 4)
    println(s.solution(626331) == -1)
}