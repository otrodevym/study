package alg.lv1

import kotlin.math.sqrt

class 기사단원의무기 {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var l = mutableListOf<Int>()

        for (v in 1..number) {
            var c = 0
            for (i in 1..sqrt(v.toFloat()).toInt()) {
                if (v.rem(i) == 0) {
                    if (v.div(i) == i) {
                        c += 1
                    } else {
                        c += 2
                    }
                }
            }
            if (c > limit) {
                c = power
            }
            answer+= c
        }

        return answer
    }
}

fun main() {
    var s = 기사단원의무기()
    println(
        s.solution(5, 3, 2) == 10
    )
    println(
        s.solution(10, 3, 2) == 21
    )
}