package alg.lv0

import site.c_functional.joinToString

class 공던지기 {
//    fun solution(numbers: IntArray, k: Int): Int {
//        var numList = arrayListOf<Int>()
//        var num: Int = 0
//        for (i in 1 until k) {
//            num += 2
//        }
//        if (num >= numbers.size) {
//            num = num.rem(numbers.size)
//        }
//
//        return numbers[num]
//    }
    fun solution(numbers: IntArray, k: Int): Int {
    (1..k).map {numbers}
        .flatMap { it.toList() }[2 * (k - 1)]
//        .forEach {
//            println(it)
//    }




        return 0
//        return (1..k).map {numbers}.flatMap { it.toList() }[2 * (k - 1)]
    }
}

fun main() {
    var s = 공던지기()


    println(s.solution(intArrayOf(1, 2, 3, 4), 2) == 3) // 2/4 = 0..2
//    println(s.solution(intArrayOf(1, 2, 3, 4), 3) == 1) // 3/4 = 0..3
//    println(s.solution(intArrayOf(1, 2, 3, 4), 4) == 3) // 4/4 = 1..0
//    println(s.solution(intArrayOf(1, 2, 3, 4), 5) == 1) // 5/4 = 1..1
//    println(s.solution(intArrayOf(1, 2, 3, 4), 6) == 3) // 6/4 = 1..2
//    println(s.solution(intArrayOf(1, 2, 3, 4), 7) == 1) // 7/4 = 1..3
//    println(s.solution(intArrayOf(1, 2, 3, 4), 8) == 3) // 8/4 = 2..0
//    println(s.solution(intArrayOf(1, 2, 3, 4), 12) == 3) // 12/4 = 3..0
//    println(s.solution(intArrayOf(1, 2, 3, 4, 5, 6), 5) == 3)
//    println(s.solution(intArrayOf(1, 2, 3), 3) == 2)
//    println(s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3) == 5)
}