package alg.lv1


//class TempStack<E>(vararg items: E){
//    private val elements = items.toMutableList()
//
//    fun push(item: E) = elements.add(item)
//    fun pop() = elements.removeAt(elements.size -1)
//    fun isEmpty() = elements.isEmpty()
//
//    fun size() = elements.size
//}
//
//fun <E> mutableTempStack(vararg elements: E) = TempStack(*elements)

class 크레인인형뽑기 {

    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var ms = mutableListOf<Int>()
        for (i in moves) {

            var j = 0
            while (j < board.size) {
                var mm = board[j][i-1]
                board[j][i-1] = 0
                if (mm != 0) {
                    ms.add(mm)
                    break
                }
                j++
            }
        }

        var i = 1
        while (i < ms.size) {
            if (ms[i] == ms[i - 1]) {
                ms.removeAt(i)
                ms.removeAt(i-1)
                answer += 2
                i = 0
            }
            i++
        }

        return answer
    }
}

fun main() {
    var s = 크레인인형뽑기()
//    [[0, 0, 0, 0], [0, 0, 0, 0], [0, 4, 4, 0], [1, 2, 2, 1]], [2, 3, 1, 4, 2, 3] 기댓값 6
    println(
        s.solution(
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 4, 4, 0),
                intArrayOf(1, 2, 2, 1),
            ),
            intArrayOf(2,3,1,4,2,3)
        )
//                == 4
    )
//    println(
//        s.solution(
//            arrayOf(
//                intArrayOf(0, 0, 0, 0, 0),
//                intArrayOf(0, 0, 1, 0, 3),
//                intArrayOf(0, 2, 5, 0, 1),
//                intArrayOf(4, 2, 4, 4, 2),
//                intArrayOf(3, 5, 1, 3, 1)
//            ),
//            intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
//        )
//        //        == 4
//    )
}