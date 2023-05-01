package alg.lv0

import site.c_functional.joinToString

class 잘라서배열로저장하기 {
    fun solution(my_str: String, n: Int) = my_str.chunked(n)


}

fun main() {
    var s = 잘라서배열로저장하기()
    println(s.solution("abc1Addfggg4556b", 6))
}
