package alg.lv0

class 다음에올숫자 {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        if (common[1] - common[0] == common[2] - common[1]) {
            // 등차
            return common[common.size - 1] + (common[1] - common[0])
        } else {
            // 등비
            return common[common.size - 1] * (common[1] / common[0])
        }
        return 0
    }
}

fun main() {
    var s = 다음에올숫자()
//    println(s.solution(intArrayOf(1)) == 1)
//    println(s.solution(intArrayOf(1,1,1)) == 1)
    println(s.solution(intArrayOf(1, 2, 3, 4)) == 5)
    println(s.solution(intArrayOf(2, 4, 8)) == 16)
}