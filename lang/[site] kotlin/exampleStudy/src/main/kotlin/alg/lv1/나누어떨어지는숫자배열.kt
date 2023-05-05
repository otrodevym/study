package alg.lv1

class 나누어떨어지는숫자배열 {
    fun solution(arr: IntArray, divisor: Int) =
        run {
            var s = arr.filter { it.rem(divisor) == 0 }.toList().sorted().toIntArray()
            var ss = intArrayOf(-1)
            if (!s.isEmpty()) {
                ss = s
            }
            ss
        }

}

fun main() {
    var s = 나누어떨어지는숫자배열()
    println(
        s.solution(intArrayOf(5, 9, 7, 10), 5).contentEquals(intArrayOf(5, 10))
    )
    println(
        s.solution(intArrayOf(2, 36, 1, 3), 1)
            .contentEquals(intArrayOf(1, 2, 3, 36))
    )
    println(s.solution(intArrayOf(3, 2, 6), 10).contentEquals(intArrayOf(-1)))
}