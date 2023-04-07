package alg.lv0

class 진료순서정하기 {
//    fun solution(emergency: IntArray): IntArray {
//        var list = emergency.sortedDescending()
//        var result = mutableListOf<Int>()
//        for (i in emergency) {
//            for ((index, j) in list.withIndex()) {
//                if (i == j) {
//                    result.add(index.plus(1))
//                }
//            }
//        }
//        result.forEach{println(it)}
//        return result.toIntArray()
//    }

    fun solution(emergency: IntArray) = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()
}

fun main() {
    var s = 진료순서정하기()
        println(s.solution(intArrayOf(3, 76, 24)).contentEquals(intArrayOf(3, 1, 2)))
        println(s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7)).contentEquals(intArrayOf(7, 6, 5, 4, 3, 2, 1)))
        println(s.solution(intArrayOf(30, 10, 23, 6, 100)).contentEquals(intArrayOf(2, 4, 3, 5, 1)))

}

//[3, 76, 24]	[3, 1, 2]
//[1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
//[30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]