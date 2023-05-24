package alg.lv1

import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

class 문자열나누기 {
    fun solution(s: String): Int {
        var answer: Int = 0

        var ss = s
        while (ss.isNotEmpty()) {
            answer++
            var init = ss[0]
            var t1 = 1
            var t2 = 0
            var i = 1
            while (ss.length > i) {
                if (init == ss[i]) {
                    t1++
                } else {
                    t2++
                }
                if (t1 == t2) {
                    break
                }
                i++
            }
            ss = ss.substring(t1 + t2)

        }

        return answer
    }
}

@OptIn(ExperimentalTime::class)
fun main() {
    val measuredTime = measureTimedValue {
        // input code
        var s = 문자열나누기()
        println(s.solution("abaab") == 1)
        println(s.solution("banana") == 3)
        println(
            s.solution("aaa") == 1
        )
        println(
            s.solution("abaa")
                    == 2
        )
        println(
            s.solution("abracadabra")
                    == 6
        )
        println(
            s.solution("aaabbaccccabba")
                    == 3
        )
    }

    println("result : ${measuredTime.value}, measured time : ${measuredTime.duration}")

}