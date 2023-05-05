package alg.lv1

class 최소직사각형 {
    fun solution(sizes: Array<IntArray>): Int {

        var a = sizes.map { it.maxOf { ss -> ss  } }.toList().max()
        var b = sizes.map { it.minOf { ss -> ss } }.toList().max()

        return a.times(b)
    }
}

fun main() {
    var s = 최소직사각형()
    println(
        s.solution(
            arrayOf(
                intArrayOf(60, 50),
                intArrayOf(30, 70),
                intArrayOf(60, 30),
                intArrayOf(80, 40)
            )
        ) == 4000
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(10, 7),
                intArrayOf(12, 3),
                intArrayOf(8, 15),
                intArrayOf(14, 7),
                intArrayOf(5, 15)
            )
        ) == 120
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(14, 4),
                intArrayOf(19, 6),
                intArrayOf(6, 16),
                intArrayOf(14, 7),
                intArrayOf(7, 11)
            )
        ) == 133
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(20, 10),
                intArrayOf(12, 18),
            )
        ) == 240
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(91, 50),
                intArrayOf(77, 51),
                intArrayOf(50, 1),
                intArrayOf(50, 50),
            )
        ) == 4641
    )
//    [ [91, 50], [77, 51], [50, 1], [50, 50], ]
//    [[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
}