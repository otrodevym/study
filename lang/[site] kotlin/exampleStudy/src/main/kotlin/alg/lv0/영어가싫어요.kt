package alg.lv0

import site.c_functional.joinToString

class 영어가싫어요 {
//    fun solution(numbers: String): Long {
//        var t = mapOf<String, String>(
//            "zero" to "0",
//            "one" to "1",
//            "two" to "2",
//            "three" to "3",
//            "four" to "4",
//            "five" to "5",
//            "six" to "6",
//            "seven" to "7",
//            "eight" to "8",
//            "nine" to "9"
//        )
//        var l = listOf(
//            "zero",
//            "one",
//            "two",
//            "three",
//            "four",
//            "five",
//            "six",
//            "seven",
//            "eight",
//            "nine"
//        )
//
//        var ss: String = ""
//        var result: String = ""
//        for (i in numbers) {
//            ss += i
//            if (l.contains(ss)) {
//                result += t[ss]
//                ss = ""
//            }
//        }
//        return result.toLong()
//    }


    companion object{
        var t = mapOf<String, String>(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9"
        )
    }

    fun solution(numbers: String): Long {
        var result: String = numbers
        t.forEach{
            result = result.replace(it.key, it.value)
        }
            return result.toLong()
    }

//    fun solution(numbers: String) = t.mapKeys { numbers.replace(it.key, it.value) }.toList().joinToString("").toLong()

//
}

fun main() {
    var s = 영어가싫어요()
    println(s.solution("onetwothreefourfivesixseveneightnine") == 123456789L)
    println(s.solution("onefourzerosixseven") == 14067L)
}
