package alg.lv0

class 배열원소의길이 {
    fun solution(strlist: Array<String>) = strlist.map { it.length }.toIntArray()
}

fun main() {
    var r = 배열원소의길이()
    println(r.solution(arrayOf("We", "are", "the", "world!")).contentEquals(
        intArrayOf(2,3,3,6)))
    println(r.solution(arrayOf("I", "Love", "Programmers.")).contentEquals(
        intArrayOf(1,4,12)))
}