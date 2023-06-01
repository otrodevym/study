package alg.lv1

import kotlin.math.abs

//1~12

//1, 4, 7, 10
//2, 5, 6, 11
//3, 6, 9, 12


class 키패드누르기 {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""

        var l = intArrayOf(1, 4, 7, 10)
        var r = intArrayOf(3, 6, 9, 12)
        var m = intArrayOf(2, 5, 8, 11)

        var lc = 10
        var rc = 12
        for (i in numbers) {
            var ii = i
            if (ii == 0) {
                ii = 11
            }
            if (l.contains(ii)) {
                lc = ii
                answer += "L"
            } else if (r.contains(ii)) {
                rc = ii
                answer += "R"
            } else {
                var lCount = 0
                var rCount = 0

                var tempLc = lc
                var tempRc = rc

                if (!m.contains(lc)) {
                    lCount++
                    lc += 1
                }

                if (!m.contains(rc)) {
                    rCount++
                    rc -= 1
                }

                var iIndex = 0
                var lcIndex = 0
                var rcIndex = 0
                for ((index, j) in m.withIndex()) {
                    if (j == ii) {
                        iIndex = index
                    }
                    if (j == lc) {
                        lcIndex = index
                    }
                    if (j == rc) {
                        rcIndex = index
                    }
                }
                var lcc = abs(iIndex - lcIndex) + lCount
                var rcc = abs(iIndex - rcIndex) + rCount
                if (lcc > rcc) {
                    answer += "R"
                    rc = ii
                    lc = tempLc
                } else if (lcc < rcc) {
                    answer += "L"
                    lc = ii
                    rc = tempRc
                } else {
                    if (hand.contentEquals("right")) {
                        answer += "R"
                        rc = ii
                        lc = tempLc
                    } else if (hand.contentEquals("left")) {
                        answer += "L"
                        lc = ii
                        rc = tempRc
                    }
                }
            }
        }


        return answer
    }

}

fun main() {
    var s = 키패드누르기()
    println(
        s.solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right")
            .contentEquals(
                "LRLLLRLLRRL"
            )
    )
    println(
        s.solution(intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2), "left")
            .contentEquals(
                "LRLLRRLLLRR"
            )
    )
    println(
        s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), "right")
            .contentEquals(
                "LLRLLRLLRL"
            )
    )
    println(
        s.solution(intArrayOf(4,3,2,8), "right")
    )
}