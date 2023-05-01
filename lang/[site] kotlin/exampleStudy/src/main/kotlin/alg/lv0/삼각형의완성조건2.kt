package alg.lv0

class 삼각형의완성조건2 {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var max = sides.maxOf { it }
        var min = sides.minOf { it}
//        가장 긴게 6인경우면 4,5,6 // min + 1 <= value  >= max - 1
//        미지수가 가장 긴경우라면 7, 8 // max + 1 <=  value >= (min + max) - 1

//        3 6
        for (i in (max - min) + 1..max) { // 4 5 6
            answer++
        }
        for (i in max + 1 until (min + max)) { // 7 9
            answer++
        }

        return answer
    }

}

fun main() {
    var s = 삼각형의완성조건2()
//    println(s.solution(intArrayOf(1, 2)))
//    println(s.solution(intArrayOf(3, 6)))
//    println(s.solution(intArrayOf(11, 7)))
    println(s.solution(intArrayOf(1, 2)) == 1)
    println(s.solution(intArrayOf(3, 6)) == 5)
    println(s.solution(intArrayOf(11, 7)) == 13)
}