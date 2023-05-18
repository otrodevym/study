package alg.lv1

class 카드뭉치 {
    fun solution(
        cards1: Array<String>,
        cards2: Array<String>,
        goal: Array<String>
    ): String {
        var answer: String = ""
        var i = 0
        var j = 0
        for (v in goal) {
            if (i < cards1.size && v == cards1[i]) {
                answer += v
                i++
            } else if (j < cards2.size && v == cards2[j]) {
                answer += v
                j++
            } else {
                answer = ""
            }
        }
        return if(answer.contentEquals(goal.joinToString(""))) "Yes" else "No"
    }
}

fun main() {
    var s = 카드뭉치()
    println(
        s.solution(
            arrayOf("i", "drink", "water"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ).contentEquals("Yes")
    )
    println(
        s.solution(
            arrayOf("i", "water", "drink"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ).contentEquals("No")
    )
}