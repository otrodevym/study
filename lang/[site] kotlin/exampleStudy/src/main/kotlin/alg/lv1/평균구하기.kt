package alg.lv1

class 평균구하기 {
    fun solution(arr: IntArray) = arr.average()
}

fun main() {
    var s = 평균구하기()
    println(s.solution(intArrayOf(1,2,3,4)) == 2.5)
    println(s.solution(intArrayOf(5,5)) == 5.toDouble())

//    [1,2,3,4]	2.5
//    [5,5]	5
}