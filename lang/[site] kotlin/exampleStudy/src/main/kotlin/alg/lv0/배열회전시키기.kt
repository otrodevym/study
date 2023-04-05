package alg.lv0

import java.util.*

class 배열회전시키기 {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var list = numbers.toMutableList()
        return when (direction) {
            "right" -> {
                Collections.rotate(list, 1)
                return list.toIntArray()
            }
            "left" -> {
                Collections.rotate(list, -1)
                return list.toIntArray()
            }
            else -> intArrayOf()
        }
    }
}

fun main() {
    var r = 배열회전시키기()
    println(
        r.solution(intArrayOf(1, 2, 3), "right")
            .contentEquals(intArrayOf(3, 1, 2))
    )
    println(
        r.solution(intArrayOf(4, 455, 6, 4, -1, 45, 6), "left")
            .contentEquals(intArrayOf(455, 6, 4, -1, 45, 6, 4))
    )
}