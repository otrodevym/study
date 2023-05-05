package alg.lv1

class 제일작은수제거하기 {
    fun solution(arr: IntArray) = run {
        var s = arr.filter { it != arr.minBy { dd -> dd } }.toList().toIntArray()
        if (s.isEmpty()) {
            intArrayOf(-1)
        } else {
            s
        }
    }
}

fun main() {
    var s = 제일작은수제거하기()
    println(
        s.solution(intArrayOf(4, 3, 2, 1)).contentEquals(intArrayOf(4, 3, 2))
    )
    println(s.solution(intArrayOf(10)).contentEquals(intArrayOf(-1)))
}