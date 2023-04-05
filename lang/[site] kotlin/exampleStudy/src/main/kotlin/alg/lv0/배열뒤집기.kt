package alg.lv0

class 배열뒤집기 {
    fun solution(num_list: IntArray) = num_list.reversedArray()
}

fun main() {
    var r = 배열뒤집기()
    var s = r.solution(intArrayOf(1, 2, 3, 4, 5))
    s.forEach { println(it) }


}