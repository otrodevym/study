package alg.lv0

class k의개수 {
    fun solution(i: Int, j: Int, k: Int) =
        (i..j).sumOf { it.toString().toList().count{ it2 -> it2 == k.digitToChar()} }

}

fun main() {
    var s = k의개수()
    println(s.solution(1, 13, 1) == 6)
    println(s.solution(10, 50, 5) == 5)
    println(s.solution(3, 10, 2) == 0)
}