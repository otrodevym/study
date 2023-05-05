package alg.lv1

class 하샤드수 {
    fun solution(x: Int) = x.rem(x.toString().map { it.digitToInt() }.sum()) == 0
}

fun main() {
    var s = 하샤드수()
    println(s.solution(10 ) == true)
    println(s.solution(12 ) == true)
    println(s.solution(11 ) == false)
    println(s.solution(13 ) == false)
}