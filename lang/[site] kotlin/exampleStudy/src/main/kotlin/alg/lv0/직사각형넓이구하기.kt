package alg.lv0

import kotlin.math.abs

class 직사각형넓이구하기 {
    fun solution(dots: Array<IntArray>): Int {

        var xList = dots.map { it[0] }.toList()
        var yList = dots.map { it[1] }.toList()

        var x = xList.maxOf { it }.minus(xList.minOf { it })
        var y = yList.maxOf { it }.minus(yList.minOf { it })
        return x.times(y)
    }
}

fun main() {
    var s = 직사각형넓이구하기()
    println(
        s.solution(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 1),
                intArrayOf(2, 2),
                intArrayOf(1, 2)
            )
        ) == 1
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(-1, -1),
                intArrayOf(1, 1),
                intArrayOf(1, -1),
                intArrayOf(-1, 1)
            )
        ) == 4
    )
}