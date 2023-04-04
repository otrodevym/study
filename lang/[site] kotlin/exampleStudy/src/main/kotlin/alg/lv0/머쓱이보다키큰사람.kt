package alg.lv0

class 머쓱이보다키큰사람 {
    fun solution(array: IntArray, height: Int) = array.count { it > height }
}


fun main() {
    var s = 머쓱이보다키큰사람()
    println(s.solution(intArrayOf(149, 180, 192, 170), 167) == 3)
    println(s.solution(intArrayOf(180, 120, 140), 190) == 0)
}