package alg.lv1

import java.lang.StringBuilder

class 시저암호 {
    fun solution(s: String, n: Int): String {

        var answer = StringBuilder()
        for (i in s) {
            if (i.isLetter()) {
                var base = if (i.isLowerCase()) 'a' else 'A'
                var ch = ((i - base ) + n).rem(26).plus(base.code).toChar()
                answer.append(ch)
            } else {
                answer.append(i)
            }

        }
        return answer.toString()
    }
}

fun main() {
    var s = 시저암호()
    println(s.solution("AB", 1).contentEquals("BC"))
    println(s.solution("z", 1).contentEquals("a"))
    println(s.solution("a B z", 4).contentEquals("e F d"))
}