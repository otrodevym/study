package alg.lv1

class 수박수박수박수 {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 1..n) {
            if (i.rem(2) != 0) {
                answer += "수"
            } else {
                answer += "박"
            }
        }
        return answer
    }
}

fun main() {
    var s = 수박수박수박수()
    println(s.solution(3).contentEquals("수박수"))
    println(s.solution(4).contentEquals("수박수박"))
//    3	"수박수"
//    4	"수박수박"
}