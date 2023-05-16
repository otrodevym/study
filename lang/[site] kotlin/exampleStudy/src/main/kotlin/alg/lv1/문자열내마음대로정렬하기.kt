package alg.lv1

class 문자열내마음대로정렬하기 {
    fun solution(strings: Array<String>, n: Int) =
        (strings.sortedWith ( compareBy({it[n]}, {it} ) ).toList()).toTypedArray()
}

fun main() {
    var s = 문자열내마음대로정렬하기()
//    println(
//        s.solution(arrayOf("sun", "bed", "car"), 1)
//        .contentEquals(arrayOf("car", "bed", "sun")))
//            .forEach { println(it) }

//    println(
        s.solution(arrayOf("abce", "abcd", "cdx"), 2)
            .forEach { println(it) }
//        .contentEquals(arrayOf("abcd", "abce", "cdx")))
}