package alg.lv0

class 최대값만들기2 {
    fun solution(numbers: IntArray): Int {
        var answer: Int = numbers[0].times(numbers[1])
        for ((index1, i) in numbers.withIndex()) {
            for ((index2, j) in numbers.withIndex()) {
                if (index1 == index2) {
                    continue
                } else {
                    var v = i.times(j)
                    if (answer < v) {
                        answer = v
                    }
                }
            }
        }
        return answer
    }
}

fun main() {
    var s = 최대값만들기2()

//    println(s.solution(intArrayOf(1,2,-3,4,-5)))
//    println(s.solution(intArrayOf(0, -31, 24, 10, 1, 9)))
//    println(s.solution(intArrayOf(10, 20, 30, 5, 5, 20, 5)))


    println(s.solution(intArrayOf(1, 2, -3, 4, -5)) == 15)
    println(s.solution(intArrayOf(0, -31, 24, 10, 1, 9)) == 240)
    println(s.solution(intArrayOf(10, 20, 30, 5, 5, 20, 5)) == 600)
}