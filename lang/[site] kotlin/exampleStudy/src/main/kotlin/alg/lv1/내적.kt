package alg.lv1

class 내적 {
    fun solution(a: IntArray, b: IntArray) =
        (a.indices).sumOf { a[it].times(b[it]) }
}

fun main() {
    var s = 내적()
    println(s.solution(intArrayOf(1,2,3,4), intArrayOf(-3, -1, 0, 2)) == 3)
    println(s.solution(intArrayOf(-1,0,1), intArrayOf(1,0,-1)) == -2)
}