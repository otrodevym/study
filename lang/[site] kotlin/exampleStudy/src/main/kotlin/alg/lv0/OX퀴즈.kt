package alg.lv0

class OX퀴즈 {

    fun op(a: Int, b: Int, operation: (Int, Int)-> Int ) = operation(a, b)
    fun plus(a: Int, b: Int): Int = a + b
    fun minus(a: Int, b: Int): Int = a - b

    fun solution(quiz: Array<String>): Array<String> {
        var answer = mutableListOf<String>()

        for (q1 in quiz) {
            var s = q1.split(" = ")
            var qAnswer = s[1]
            var ss = s[0].split(" ")
            var result = when (ss[1]) {
                "+" -> op(ss[0].toInt(),ss[2].toInt(), ::plus)
                "-" -> op(ss[0].toInt(),ss[2].toInt(), ::minus)
                else -> 0
            }
            if (result == qAnswer.toInt()) {
                answer.add("O")
            } else {
                answer.add("X")
            }
        }

        return answer.toTypedArray()
    }
}

fun main() {
    var s = OX퀴즈()
    println(
        s.solution(arrayOf("3 - 4 = -3", "5 + 6 = 11"))
            .contentEquals((arrayOf("X", "O")))
    )
    println(
        s.solution(
            arrayOf(
                "19 - 6 = 13",
                "5 + 66 = 71",
                "5 - 15 = 63",
                "3 - 1 = 2"
            )
        ).contentEquals((arrayOf("O", "O", "X", "O")))
    )
}