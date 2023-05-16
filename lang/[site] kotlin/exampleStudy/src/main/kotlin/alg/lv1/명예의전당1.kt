package alg.lv1

import site.a_controlFlow.mutableStackOf

class 명예의전당1 {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer= mutableListOf<Int>()

        var s = mutableListOf<Int>()
        for (i in score) {
            s.add(i)
            s = s.sortedDescending().toMutableList()

            if (s.size <= k) {
                answer.add(s[s.size-1])
            } else {
                answer.add(s[k-1])
            }
        }

        answer.forEach { println(it) }

        return answer.toIntArray()
    }
}

fun main() {
    var s = 명예의전당1()
    println(s.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentEquals(
        intArrayOf(10, 10, 10, 20, 20, 100, 100)
    ))
    println(s.solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)).contentEquals(
        intArrayOf(0, 0, 0, 0, 20, 40, 70, 70, 150, 300)
    ))
}