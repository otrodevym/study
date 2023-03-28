package alg.lv0

class 배열의평균값 {
    fun solution(numbers: IntArray): Double = (numbers).average()
//    fun solution(numbers: IntArray): Float = (numbers).reduce{x, y -> x + y}.div(numbers.size.toFloat())
}

fun main() {
    var r = 배열의평균값()
    println(r.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
//    println(r.solution(intArrayOf(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)))
}