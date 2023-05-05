package alg.lv1

class 없는숫자더하기 {
    fun solution(numbers: IntArray) = (0..9).filter { !numbers.contains(it) }.sum()
}

fun main() {
    var s = 없는숫자더하기()
    println(s.solution(intArrayOf(1,2,3,4,6,7,8,0)) == 14)
    println(s.solution(intArrayOf(5,8,4,0,6,7,9)) == 6)
}