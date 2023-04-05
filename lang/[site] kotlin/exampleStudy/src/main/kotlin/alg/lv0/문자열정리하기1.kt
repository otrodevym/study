package alg.lv0

class 문자열정리하기1 {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()

        var c = "[0-9]+".toRegex().findAll(my_string).map { it.value }
        c.forEach { println(it) }
//        return my_string.filter { it.isDigit() }.map { it.digitToInt() }.toIntArray().sortedArray()
        return intArrayOf()
    }
}

fun main() {
    var r = 문자열정리하기1()
    println(r.solution("hi12392").forEach { println(it) })
    println(r.solution("hi12392").contentEquals(intArrayOf(1,2,2,3,9)))
    println(r.solution("p2o4i8gj2").contentEquals(intArrayOf(2,2,4,8)))
    println(r.solution("abcde0").contentEquals(intArrayOf(0)))
}