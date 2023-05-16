package alg.lv1

class 푸드파이터대회 {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for ((index, value) in food.withIndex()) {
            if (index == 0) {
                continue
            }
            if (value.div(2) != 0) {
                var v = value.div(2)
                answer = answer.plus(index.toString().repeat(v))
            }
        }
        var v = answer.reversed()
        answer = answer.plus(0)
        answer = answer.plus(v)
        return answer
    }
}

fun main() {
    var s = 푸드파이터대회()
    println(s.solution(intArrayOf(1,3,4,6)).contentEquals("1223330333221"))
    println(s.solution(intArrayOf(1,7,1,2)).contentEquals("111303111"))

}