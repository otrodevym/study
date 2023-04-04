package alg.lv0

class 배열자르기 {
//    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.filterIndexed { index, _ ->  index in num1..num2  }.toIntArray()
    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2)
}

fun main() {
    var s = 배열자르기()
    println(s.solution(intArrayOf(1,2,3,4,5), 1, 3).contentEquals(intArrayOf(2,3,4)))
    println(s.solution(intArrayOf(1,3,5), 1, 2).contentEquals(intArrayOf(3,5)))
}