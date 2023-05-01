package alg.lv0

class 유한소수판별하기 {
    fun solution(a: Int, b: Int): Int {
        var aList = mutableListOf<Int>()
        var bList = mutableListOf<Int>()
        for (i in 1..a) {
            if (a.rem(i) == 0) {
                aList.add(i)
            }
        }

        for (i in 1..b) {
            if (b.rem(i) == 0) {
                bList.add(i)
            }
        }

        var valMax = 0
        for (i in aList) {
            for (j in bList) {
                if (i == j) {
                    if (valMax < j) {
                        valMax = j
                    }
                }
            }
        }
        var bb = b.div(valMax)
        var c = 2
        var l = mutableListOf<Int>()
        while (true) {
            var d = bb.div(c)
            var r = bb.rem(c)
            if (bb < c) {
               break
            }
            if (r != 0) {
                c++
            } else {
                bb = d
                l.add(c)
            }
        }
        for (i in l) {
            if (i == 2 || i == 5) {
                continue
            } else {
                return 2
            }
        }
        return 1
    }
}

fun main() {
    var s = 유한소수판별하기()
    println(s.solution(1,30) == 2) // 2, 3, 5
    println(s.solution(7,20) == 1)
    println(s.solution(11,22) == 1)
    println(s.solution(12,21) == 2)

}