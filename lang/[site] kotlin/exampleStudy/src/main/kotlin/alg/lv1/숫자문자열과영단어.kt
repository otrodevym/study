package alg.lv1

class 숫자문자열과영단어 {
    companion object {
        var m = mapOf<String, Int>(
            "zero" to 0,
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )
    }
    fun solution(s: String): Int {
        var ss = s

        for (i in m) {
            ss = ss.replace(i.key, i.value.toString())
        }
        return ss.toInt()
    }
}

fun main() {
    var s = 숫자문자열과영단어()
    println(s.solution("one4seveneight") == 1478)
    println(s.solution("23four5six7") == 234567)
            println(s.solution("2three45sixseven") == 234567)
            println(s.solution("123") == 123)
}