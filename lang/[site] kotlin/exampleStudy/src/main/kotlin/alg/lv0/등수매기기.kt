package alg.lv0

class 등수매기기 {
    fun solution(score: Array<IntArray>): IntArray {
        var l = score.map { it.average() }

        var ll  = l.sortedBy { -it }
        var result = mutableListOf<Int>()
        for (j in l) {
            for ((index, i) in ll.withIndex()) {
                if (i == j) {
                    result.add(index + 1)
                    break
                }
            }
        }
        result.forEach{
            println(it)
        }
        return result.toIntArray()
    }
}

fun main() {
    var s = 등수매기기()
//    println(
//        s.solution(
//            arrayOf(
//                intArrayOf(80, 70),
//                intArrayOf(90, 50),
//                intArrayOf(40, 70),
//                intArrayOf(50, 80)
//            )
//        ).contentEquals(
//            intArrayOf(1, 2, 4, 3)
//        )
//    )
//    println(
//        s.solution(
//            arrayOf(
//                intArrayOf(80, 70),
//                intArrayOf(70, 80),
//                intArrayOf(30, 50),
//                intArrayOf(90, 100),
//                intArrayOf(100, 90),
//                intArrayOf(100, 100),
//                intArrayOf(10, 30),
//            )
//        ).contentEquals(
//            intArrayOf(4, 4, 6, 2, 2, 1, 7)
//        )
//    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(1,3),
                intArrayOf(3,1),
                intArrayOf(2,3),
                intArrayOf(3,2),
                intArrayOf(1,2),
                intArrayOf(0,0),
            )
        ).contentEquals(
            intArrayOf(3,3,1,1,5,6)
        )
    )
}