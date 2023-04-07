package alg.lv0

import site.c_functional.joinToString

class 차원2으로만들기 {
    //    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
//        var answer: Array<IntArray> = arrayOf<IntArray>()
//        var list = mutableListOf<Int>()
//        var list2 = Array<IntArray>(num_list.size.div(n)) {
//            IntArray(n)
//        }
//        for ((index, value) in num_list.withIndex()) {
//            list.add(value)
//            if ((index + 1).rem(n) == 0) {
//                list2[index.div(n)] = list.toIntArray()
//                list.clear()
//            }
//        }
////        list2.forEach { it -> it.forEach {it2 -> println(it2) } }
//        list2.forEach { println(it.contentToString()) }
//        return list2
//    }
    fun solution(num_list: IntArray, n: Int) = num_list.toList().chunked(n)
}

fun main() {
    var s = 차원2으로만들기()

    println(
        s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 2).toList().joinToString("")
    )


    println(
        s.solution(intArrayOf(100, 95, 2, 4, 5, 6, 18, 33, 948), 3).toList().joinToString("")
    )


//    println(
//        s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 2).contentDeepEquals(
//            arrayOf(
//                intArrayOf(1, 2),
//                intArrayOf(3, 4),
//                intArrayOf(5, 6),
//                intArrayOf(7, 8)
//            )
//        )
//    )
//    println(
//        s.solution(intArrayOf(100, 95, 2, 4, 5, 6, 18, 33, 948), 3)
//            .contentDeepEquals(
//                arrayOf(
//                    intArrayOf(100, 95, 2),
//                    intArrayOf(4, 5, 6),
//                    intArrayOf(18, 33, 948)
//                )
//            )
//    )
}

//[1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
//[100, 95, 2, 4, 5, 6, 18, 33, 948]	3	[[100, 95, 2], [4, 5, 6], [18, 33, 948]]