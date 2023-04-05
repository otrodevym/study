package alg.lv0

class 짝수는싫어요 {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var r = ArrayList<Int>()
        for (i: Int in 1..n step 2) {
            r.add(i)
        }

        return r.toIntArray()
    }
}

fun main() {
    var s = 짝수는싫어요()
    var r:IntArray = s.solution(10)
    r.forEach { println(it) }
}