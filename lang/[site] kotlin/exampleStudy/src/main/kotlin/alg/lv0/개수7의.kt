package alg.lv0

class 개수7의 {
    fun solution(array: IntArray) = array.joinToString("").count{ it == '7'}
}

fun main() {
    var s = 개수7의()

    println(s.solution(intArrayOf(7, 77, 17,	)) == 4)
}