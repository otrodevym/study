package alg.lv1

class 두정수사이의합 {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var l = listOf<Int>(a, b)
        var ll = l.sorted()
        for (i in ll[0]..ll[1]) {
            answer+= i
        }
        return answer
    }

}

fun main() {
    var s = 두정수사이의합()
    println(s.solution(3,5) == 12L)
    println(s.solution(3,3) == 3L)
    println(s.solution(5,3) == 12L)
}