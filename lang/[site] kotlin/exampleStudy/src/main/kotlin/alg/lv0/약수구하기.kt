package alg.lv0

class 약수구하기 {
    fun solution(n: Int) = (1..n).filter { n.mod(it) == 0 }.toList().sorted().toIntArray()
}

fun main() {
    var s = 약수구하기()
    println(s.solution(24).contentEquals(intArrayOf(1,2,3,4,6,8,12,24)))
    println(s.solution(29).contentEquals(intArrayOf(1,29)))
}