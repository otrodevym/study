package alg.lv0

class 문자열안에문자열 {
//    fun solution(str1: String, str2: String): Int {
//        if (str1.contains(str2)) {
//            return 1
//        } else {
//            return 2
//        }
//    }
    fun solution(str1: String, str2: String) = if(str1.contains(str2)) 1 else 2
}

fun main() {
    var r = 문자열안에문자열()
    println(r.solution("ab6CDE443fgh22iJKlmn1o", "6CD") == 1)
    println(r.solution("ppprrrogrammers", "pppp") == 2)
    println(r.solution("AbcAbcA", "AAA") == 2)
}