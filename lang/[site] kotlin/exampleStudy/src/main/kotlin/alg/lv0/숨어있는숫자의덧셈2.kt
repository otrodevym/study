package alg.lv0

class 숨어있는숫자의덧셈2 {
    fun solution(my_string: String) = "[0-9]+".toRegex().findAll(my_string).toList().sumOf { it.value.toInt() }
}

fun main() {
    var s = 숨어있는숫자의덧셈2()
//    println(s.solution("aAb1B2cC34oOp") == 37)
//    println(s.solution("1a2b3c4d123Z") == 133)

    println(s.solution("aAb1B2cC34oOp"))
    println(s.solution("1a2b3c4d123Z"))
}
//"aAb1B2cC34oOp"	37
//"1a2b3c4d123Z"	133