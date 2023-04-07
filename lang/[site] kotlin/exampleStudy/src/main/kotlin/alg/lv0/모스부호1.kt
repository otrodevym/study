package alg.lv0

import site.c_functional.joinToString

class 모스부호1 {
    companion object{
        var morse = mapOf <String, String>(
            ".-" to "a",
            "-..." to "b",
            "-.-." to "c",
            "-.." to "d",
            "." to "e",
            "..-." to "f",
            "--." to "g",
            "...." to "h", ".." to "i", ".---" to "j", "-.-" to "k", ".-.." to "l",
            "--" to "m", "-." to "n", "---" to "o", ".--." to "p", "--.-" to "q", ".-." to "r",
            "..." to "s", "-" to "t", "..-" to "u", "...-" to "v", ".--" to "w", "-..-" to "x",
            "-.--" to "y", "--.." to "z"
        )
    }
    fun solution(letter: String) = letter.split(" ").map { morse[it] }.toList().joinToString("")
}

fun main() {
    var s = 모스부호1()
    println(s.solution(".... . .-.. .-.. ---").contentEquals("hello"))
    println(s.solution(".--. -.-- - .... --- -.").contentEquals("python"))
}