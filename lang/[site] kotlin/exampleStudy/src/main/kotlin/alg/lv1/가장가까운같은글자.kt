package alg.lv1

import site.c_functional.joinToString
import kotlin.math.abs

class 가장가까운같은글자 {
    fun solution(s: String) =
        s.mapIndexed { index, c -> s.substring(0, index).reversed().indexOf(c) }
            .map { if (it == -1) -1 else it + 1 }.toList().toIntArray()
}

fun main() {
    var s = 가장가까운같은글자()
    println(
        s.solution("banana")
            .contentEquals(intArrayOf(-1, -1, -1, 2, 2, 2))
    )
    println(
        s.solution("foobar").contentEquals(intArrayOf(-1, -1, 1, -1, -1, -1))
    )
}