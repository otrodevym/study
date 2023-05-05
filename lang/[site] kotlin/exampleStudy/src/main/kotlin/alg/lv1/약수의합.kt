package alg.lv1

class 약수의합 {
    fun solution(n: Int) = (1..n).filter { n.rem(it) == 0 }.sum()
}

fun main() {
    var s = 약수의합()
    println(s.solution(12) == 28)
    println(s.solution(5) == 6)

}