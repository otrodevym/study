package alg.lv1

class 짝수와홀수 {
    fun solution(num: Int) = if(num.rem(2) != 0) "Odd" else "Even"
}

fun main() {
    var s = 짝수와홀수()
    println(s.solution(3).contentEquals("Odd"))
    println(s.solution(4).contentEquals("Even"))
}
