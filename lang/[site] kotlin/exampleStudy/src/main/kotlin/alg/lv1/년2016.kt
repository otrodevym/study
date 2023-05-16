package alg.lv1

import java.time.LocalDate

class 년2016 {


    fun solution(a: Int, b: Int): String {
        var answer = ""
        var m = mapOf<String, String>(
            "SUNDAY" to "SUN",
            "MONDAY" to "MON",
            "TUESDAY" to "TUE",
            "WEDNESDAY" to "WED",
            "THURSDAY" to "THU",
            "FRIDAY" to "FRI",
            "SATURDAY" to "SAT"
        )

        return m[LocalDate.of(2016, a, b).dayOfWeek.toString()].toString()
    }
}

fun main() {
    var s = 년2016()
    println(s.solution(5, 24).contentEquals("TUE"))
}