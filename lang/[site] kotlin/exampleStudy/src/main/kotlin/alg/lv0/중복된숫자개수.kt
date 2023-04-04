package alg.lv0

class 중복된숫자개수 {
    fun solution(array: IntArray, n: Int) = array.count{ it == n }
}

fun main() {
    var s = 중복된숫자개수()
    println(s.solution(intArrayOf(1,1,2,3,4,5), 1) == 2)
    println(s.solution(intArrayOf(0,2,3,4), 1) == 0)
}