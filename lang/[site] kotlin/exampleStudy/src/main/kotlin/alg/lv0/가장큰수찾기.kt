package alg.lv0

class 가장큰수찾기 {
    //    fun solution(array: IntArray): IntArray {
//        for ((index, value) in array.withIndex()) {
//            if (array.maxOf{it} == value) {
//                return intArrayOf(array.maxOf{it}, index)
//            }
//        }
//        return intArrayOf()
//    }
    fun solution(array: IntArray) = array.maxOfOrNull { it }.let {
        intArrayOf(it ?: 0, array.indexOf(it ?: 0))
    }
}

fun main() {
    var r = 가장큰수찾기()
    println(r.solution(intArrayOf(1, 8, 3)).contentEquals(intArrayOf(8, 1)))
    println(
        r.solution(intArrayOf(9, 10, 11, 8)).contentEquals(intArrayOf(11, 2))
    )
}