package alg.lv1

class 자연수뒤집어배열로만들기 {
    fun solution(n: Long) = n.toString().reversed().map { it.digitToInt() }.toList().toIntArray()
}

fun main() {
    var s = 자연수뒤집어배열로만들기()
    println(s.solution(12345).contentEquals(intArrayOf(5,4,3,2,1)))
}