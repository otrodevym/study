package alg.lv1

class 행렬의덧셈 {
    fun solution(
        arr1: Array<IntArray>,
        arr2: Array<IntArray>
    ) =
        (arr1.indices).map {
            arr1[it].mapIndexed { index, i -> arr1[it][index].plus(arr2[it][index]) }
                .toList().toIntArray()
        }
}

fun main() {
    var s = 행렬의덧셈()
//    println(
    s.solution(
        arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
        arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
    ).forEach { println(it.joinToString(","))}

//    == arrayOf(intArrayOf(4, 6), intArrayOf(7, 9)
//    )
//    [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//    [[1],[2]]	[[3],[4]]	[[4],[6]]

}