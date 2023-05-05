package alg.lv1

import site.c_functional.joinToString

class 핸드폰번호가리기 {
    fun solution(phone_number: String) = "${(1..phone_number.length-4).map { "*" }.toList().joinToString("")}${phone_number.takeLast(4)}"
}

fun main() {
    var s = 핸드폰번호가리기()
    println(s.solution("01033334444").contentEquals("*******4444"))
    println(s.solution("027778888").contentEquals("*****8888"))
    //"01033334444"	"*******4444"
    //"027778888"	"*****8888"
}