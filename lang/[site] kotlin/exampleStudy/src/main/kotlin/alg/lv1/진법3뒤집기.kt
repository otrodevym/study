package alg.lv1

class 진법3뒤집기 {
    fun solution(n: Int) = n.toString(3).reversed().toInt(3)
}

fun main() {
    var s = 진법3뒤집기()
    println(s.solution(45) ==7)
    println(s.solution(125) ==229)
}