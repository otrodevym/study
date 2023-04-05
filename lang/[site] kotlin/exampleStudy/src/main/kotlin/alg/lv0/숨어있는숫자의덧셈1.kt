package alg.lv0

class 숨어있는숫자의덧셈1 {
//    fun solution(my_string: String) = my_string.replace("[a-zA-Z]".toRegex(), "").map { it.digitToInt() }.reduce{acc: Int, i: Int -> acc.plus(i) }
    fun solution(my_string: String) = my_string.filter(Char::isDigit).map { it.digitToInt() }.reduce{acc: Int, i: Int -> acc.plus(i) }
}


fun main() {
    var r = 숨어있는숫자의덧셈1()
    println(r.solution("aAb1B2cC34oOp"))
    println(r.solution("aAb1B2cC34oOp") == 10)
    println(r.solution("1a2b3c4d123") == 16)

}