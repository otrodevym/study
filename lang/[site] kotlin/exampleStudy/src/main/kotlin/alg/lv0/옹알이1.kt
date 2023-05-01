package alg.lv0

class 옹알이1 {

    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var l = listOf<String>(
            "aya",
            "ye",
            "woo",
            "ma"
        )
        for (i in babbling) {
            var ss = i
            for (s in l) {
                ss = ss.replace(s, " ")
            }
            if (ss.replace(" ", "").isEmpty()) {
                answer++
            }
        }
        return answer
    }
}

fun main() {
    var s = 옹알이1()
    println(s.solution(arrayOf("aya", "yee", "u", "maa", "wyeoo")) == 1)
    println(s.solution(arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")) == 3)
}