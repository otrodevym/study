package alg.ohtest

class c05 {
//    private fun swapList(list1: IntArray, list2: IntArray): Int {
//        var answer: Int = 0
//        var temp: Int = list1[0]
//        var indexList1 = list1.toMutableList()
//        var indexList2 = list2.toMutableList()
////        for ((index, value) in list1.withIndex()) {
//        for ( index in 1 until list1.size step(1)) {
//            if (list1[index] == temp) {
//                indexList1[index] = list2[index]
//                indexList2[index] = list1[index]
//                answer++
//            }
//            temp = list1[index]
//        }
//        return answer
//    }




    fun solution(heights1: IntArray, heights2: IntArray): Int {
//        return swapList(heights1.sortedArray(), heights2.sortedArray()).plus(swapList(heights2.sortedArray(), heights1.sortedArray()))
//        heights1.groupBy { it }.forEach{println(it)}
//        heights2.groupBy { it }.forEach{println(it)}
        heights1.reduce{acc: Int, i: Int ->  if(acc == i) heights1.indexOfLast { it == i } else i}

        return 0

    }
}

fun main() {
    var s = c05()
    println(s.solution(intArrayOf(150, 170, 180, 180), intArrayOf(150, 160, 170, 190)))
    println(s.solution(intArrayOf(130, 140), intArrayOf(130, 140)))
}