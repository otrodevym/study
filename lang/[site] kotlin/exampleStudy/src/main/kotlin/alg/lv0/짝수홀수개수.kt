package alg.lv0

class 짝수홀수개수 {
    fun solution(num_list: IntArray): IntArray {
        var num0: Int = 0
        var num1: Int = 0

        for (num in num_list) {
            if (num.mod(2) == 0) {
                num0++
            } else {
                num1++
            }
        }

        return intArrayOf(num0, num1)
    }
}

fun main() {
    var s = 짝수홀수개수()
    println(
        s.solution(intArrayOf(1, 2, 3, 4, 5))
            .contentEquals(intArrayOf(2, 3))
    )
    println(s.solution(intArrayOf(1, 3, 5, 7)).contentEquals(intArrayOf(0, 4)))
}