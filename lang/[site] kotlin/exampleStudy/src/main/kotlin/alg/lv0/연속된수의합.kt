package alg.lv0

class 연속된수의합 {
    fun solution(num: Int, total: Int): IntArray {
        var answer = mutableListOf<Int>()

        var start = 0
        var end = num -1
        var result = 0
        while (true) {
            for (i in start..end) {
                result += i
            }
            if (result == total) {
                break
            } else if (result > total) {
                start -= 1
                end -= 1
            } else if (result < total) {
                start += 1
                end += 1
            }
            result = 0
        }

        for (i in start..end) {
            answer.add(i)
        }
        return answer.toList().toIntArray()
    }
}

fun main() {
    var s = 연속된수의합()
    println(s.solution(3, 12).contentEquals(intArrayOf(3, 4, 5)))
    println(s.solution(5, 15).contentEquals(intArrayOf(1, 2, 3, 4, 5)))
    println(s.solution(4, 14).contentEquals(intArrayOf(2, 3, 4, 5)))
    println(s.solution(5, 5).contentEquals(intArrayOf(-1, 0, 1, 2, 3)))
}
