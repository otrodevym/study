package alg.lv0

import kotlin.math.min

class 분수의덧셈 {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val answerMutable = mutableListOf<Int>()

        val maxDenom = kotlin.math.max(denom1, denom2)
        val minDenom = kotlin.math.min(denom1, denom2)

        var numer = 0
        var denom = 0

        println("maxDenom $maxDenom")
        var modResult = maxDenom.mod(minDenom)
        if (modResult == 0) {
            val divResult = maxDenom.div(minDenom)
            if (denom1 == minDenom) {
                numer += numer1.times(divResult)
                numer += numer2
            } else if (denom2 == minDenom) {
                numer += numer2.times(divResult)
                numer += numer1
            }
            denom = maxDenom
        } else if (modResult != 0) {
            val timesResult = maxDenom.times(minDenom)
            val denom1DivResult = timesResult.div(denom1)
            val denom2DivResult = timesResult.div(denom2)

            val numer1Result = denom1DivResult.times(numer1)
            val numer2Result = denom2DivResult.times(numer2)
            numer = numer1Result.plus(numer2Result)

            denom = timesResult
        }

        var c = 0
        for (i: Int in 1.. kotlin.math.min(numer, denom)) {
            if ((numer.mod(i) == 0) && (denom.mod(i) == 0)) {
                c = i
            }
        }

        answerMutable.add(numer.div(c))
        answerMutable.add(denom.div(c))
        answer = answerMutable.toIntArray()
        return answer
    }
}

fun main() {
    var solution = 분수의덧셈()
//    var results: IntArray = solution.solution(1, 2, 3, 4)
//    var results: IntArray = solution.solution(9,2,1,3)
    var results: IntArray = solution.solution(4,5,8,6)
    results.forEach { println(it) }
}