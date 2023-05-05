package alg.lv1

import site.c_functional.joinToString

class 정수내림차순으로배치하기 {
    fun solution(n: Long) =
        n.toString().map { it.digitToInt() }.toList().sortedDescending()
            .joinToString("").toLong()
}

fun main() {
    var s = 정수내림차순으로배치하기()
    println(s.solution(118372) == 873211L)
}