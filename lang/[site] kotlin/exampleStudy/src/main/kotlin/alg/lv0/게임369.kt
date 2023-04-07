package alg.lv0

class 게임369 {
    fun solution(order: Int) =
        order.toString().toList().count { it.digitToInt().mod(3) == 0  && it.digitToInt().div(3) != 0}
}

fun main() {
    var s = 게임369()
    println(s.solution(3) == 1)
    println(s.solution(29423) == 2)
    println(s.solution(2) == 0)
    println(s.solution(333) == 3)
    println(s.solution(0))
    println(s.solution(0) == 0)
    println(s.solution(10) == 0)
}