package alg.lv0

import site.c_functional.joinToString

class 한번만등장한문자 {
    //    fun solution(s: String) = s.groupBy { it }.filterValues { chars -> chars.size == 1 }.map { it.key }.toList().toCharArray().sorted().joinToString("")
    fun solution(s: String) =
        s.toSet().filter { c -> s.count { it == c } == 1 }.sorted()
            .joinToString("")
}

fun main() {
    var s = 한번만등장한문자()
//        println(s.solution("abcabcadc"))
//    println(s.solution("abdc"))
//    println(s.solution("hello"))
    println(s.solution("abcabcadc").contentEquals("d"))
    println(s.solution("abdc").contentEquals("abcd"))
    println(s.solution("hello").contentEquals("eho"))
}

//"abcabcadc"	"d"
//"abdc"	"abcd"
//"hello"	"eho"