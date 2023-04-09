package alg.ohtest

class c03 {
    fun solution(references: IntArray): Int {
        var answer:Int = 0
        var checkCount: Int = 0
        for (i in 1..references.size) {
            for (j in references) {
                if (j.minus(i) >= 0) {
                    checkCount++
                }
            }
//            if(i > references.size.minus(checkCount)) {
                if (i <= checkCount) {
                    answer = i
//                }
            }
            checkCount = 0
        }

        return answer
    }
}

fun main() {
    var s = c03()

    println(s.solution(intArrayOf(3,0,4,2,8)))
    println(s.solution(intArrayOf(1,3,1)))
    println(s.solution(intArrayOf(1)))
//    println(s.solution(intArrayOf(3,3,3,3,3,3,3,3)))
//    println(s.solution(intArrayOf(3,0,4,2,8)) == 3)
//    println(s.solution(intArrayOf(1,3,1)) == 1)
//    println(s.solution(intArrayOf(1)) == 0)
//    println(s.solution(intArrayOf(3,3,3,3,3,3,3,3)) == 8)
}