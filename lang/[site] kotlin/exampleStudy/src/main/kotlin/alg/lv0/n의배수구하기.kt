package alg.lv0

class n의배수구하기 {
    fun solution(n: Int, numlist: IntArray) = numlist.filter { it.mod(n) == 0 }.toIntArray()
}

fun main() {
    var r = n의배수구하기()
    println(r.solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)).contentEquals(
        intArrayOf(6,9,12)))

    println(r.solution(5, intArrayOf(1, 9, 3, 10, 13, 5)).contentEquals(
        intArrayOf(10,5)))

    println(r.solution(12, intArrayOf(2, 100, 120, 600, 12, 12)).contentEquals(
        intArrayOf(120, 600, 12, 12)))
}
