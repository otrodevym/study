package alg.lv1

class 덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var l = (1..n).map { 0 }.toList().toMutableList()
        for (i in section.sorted()) {
            if (l[i-1] == 1) {
                continue
            }
            var j = 0
            while (j < m && i+j <= l.size) {
                l[(i-1) + j] = 1
                j++
            }
            answer++
        }
        return answer
    }
}

fun main() {
    var s = 덧칠하기()
    println(s.solution(8,4, intArrayOf(2,3,6))
            == 2
             )
    println(s.solution(5,4, intArrayOf(1,3)) == 1)
    println(s.solution(4,1, intArrayOf(1,2,3,4))
            == 4
    )
    println(s.solution(4,2, intArrayOf(1,2,3,4)) == 2)
    println(s.solution(4,3, intArrayOf(1,2,3,4)) == 2)
}