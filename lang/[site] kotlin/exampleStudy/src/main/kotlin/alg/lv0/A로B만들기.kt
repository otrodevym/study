package alg.lv0

class A로B만들기 {
//    fun solution(before: String, after: String): Int {
//        var answer: Int = 0
//        var list1 = before.toList().sorted()
//        var list2 = after.toList().sorted()
//        for ((index, value) in list1.withIndex()) {
//            if (list2[index] == value) {
//                answer++
//            }
//        }
//        return if(answer == before.length) 1 else 0
//    }
    fun solution(before: String, after: String) = if(before.toList().sorted() == after.toList().sorted()) 1 else 0
}

fun main() {
    var s = A로B만들기()
    println(s.solution("olleh", "hello") == 1)
    println(s.solution("allpe", "apple") == 0)
}