package alg.lv0

class 문자열밀기 {
    fun solution(A: String, B: String) = (B + B).indexOf(A)
//    fun solution(A: String, B: String): Int {
//        var answer: Int = 0
//
//        var a = A
//        while (a != B) {
//            answer++
//            if (a.length == answer) {
//                return -1
//            }
//            var temp1 = a[a.length-1]
//            var temp2 = a.substring(0, a.length-1)
//            a = temp1+temp2
//            if (a.contentEquals(B)) {
//                return answer
//            }
//        }
//        return answer
//    }
}

fun main() {
    var s = 문자열밀기()
    println(s.solution("hel", "elh") == 2)
//    println(s.solution("hello", "") == -1)
//    println(s.solution("hello", "aaa") == -1)
//    println(s.solution("hello", "a") == -1)
//    println(s.solution("hello", "ohell") == 1)
//    println(s.solution("apple", "elppa") == -1)
//    println(s.solution("atat", "tata") == 1)
//    println(s.solution("abc", "abc") == 0)
}
