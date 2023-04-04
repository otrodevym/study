package alg.lv0

class 배열의유사도 {
//    fun solution(s1: Array<String>, s2: Array<String>) = s1.plus(s2).groupBy { it }.filter { it.value.size > 1 }.count()
    fun solution(s1: Array<String>, s2: Array<String>) = s1.count { s2.contains(it) }
}

fun main() {
    var s = 배열의유사도()
    println(s.solution(arrayOf("a", "b", "c"),	arrayOf("com", "b", "d", "p", "c")) == 2)
    println(s.solution(arrayOf("n", "omg"),	arrayOf("m", "dot")) == 0)
}