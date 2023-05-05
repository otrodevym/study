package alg.lv1

class 나머지가1이되는수찾기 {
    fun solution(n: Int) = (1..n).filter { n.rem(it) == 1 }.first()
}

fun main() {
    var s = 나머지가1이되는수찾기()
    println(s.solution(10) == 3)
    println(s.solution(12) == 11)

}