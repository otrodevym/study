package alg.lv0

class 배열두배만들기 {
    fun solution(numbers: IntArray): IntArray {

        return numbers.map { it * 2 }.toIntArray()
    }
}

fun main() {
    var s = 배열두배만들기()
//    var result:IntArray = s.solution(intArrayOf(1,2,3,4,5))
    var result:IntArray = s.solution(intArrayOf(1, 2, 100, -99, 1, 2, 3))
    result.forEach { println(it) }
}