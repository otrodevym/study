package alg.lv0

class 겹치는선분의길이 {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var s = lines.reduce{acc, ints -> acc.plus(ints) }.toList()
//        var s = lines.map { it.joinToString("") }.joinToString(",").map { it.digitToInt() }.toList()
        var start = s.min()
        var end = s.max()

        for (i in start..end) {
            var count = 0
            if (lines[0][0] <= i && lines[0][1] > i) {
                count++
            }
            if (lines[1][0] <= i && lines[1][1] > i) {
                count++
            }
            if (lines[2][0] <= i && lines[2][1] > i) {
                count++
            }
            if (count > 1) {
                answer++
            }
        }
        return answer
    }
}

fun main() {
    var s = 겹치는선분의길이()
    println(s.solution(
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(2, 5),
            intArrayOf(3, 9)
        )
    ) == 2)
    println(s.solution(
        arrayOf(
            intArrayOf(-1, 1),
            intArrayOf(1, 3),
            intArrayOf(3, 9)
        )
    ) == 0)
    println(s.solution(
        arrayOf(
            intArrayOf(0, 5),
            intArrayOf(3, 9),
            intArrayOf(1, 10)
        )
    ) == 8)
}