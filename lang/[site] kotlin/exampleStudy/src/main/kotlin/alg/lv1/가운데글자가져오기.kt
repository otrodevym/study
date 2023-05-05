package alg.lv1

class 가운데글자가져오기 {
    fun solution(s: String): String {
        var answer = ""
        if (s.length.rem(2) != 0) {
            var ss = s.length.div(2)
            answer = s.substring(ss, ss + 1)
        } else {
            var ss = s.length.div(2)
            answer = s.substring(ss -1, ss +1)
        }
        return answer
    }
}

fun main() {
    var s = 가운데글자가져오기()
    println(s.solution("abcde").contentEquals("c"))
    println(s.solution("qwer").contentEquals("we"))
}