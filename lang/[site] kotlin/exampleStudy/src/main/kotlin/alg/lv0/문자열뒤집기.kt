package alg.lv0

class 문자열뒤집기 {
    fun solution(my_string: String) = my_string.reversed()
}

fun main() {
    var s = 문자열뒤집기()

    println(s.solution("jaron") == "noraj")
    println(s.solution("bread") == "daerb")

}