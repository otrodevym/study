package alg.lv0

class 이진수더하기 {
    fun solution(bin1: String, bin2: String) =
        Integer.toBinaryString(bin1.toInt(2).plus(bin2.toInt(2)))

}

fun main() {
    var s = 이진수더하기()
//    println(s.solution("10", "11"))
//    println(s.solution("1001", "1111"))
    println(s.solution("10", "11").contentEquals("101"))
    println(s.solution("1001", "1111").contentEquals("11000"))
}

//"10"	"11"	"101"
//"1001"	"1111"	"11000"