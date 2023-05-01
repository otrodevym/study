package alg.lv0

class 다항식더하기 {
    fun solution(polynomial: String): String {


        var s = polynomial.split(" + ").toList().groupBy { it.contains("x") }

        var sT = s[true]?.let {
            it.map { s -> s.replace("x", "") }
                .map { ss -> if (ss == "") 1 else ss.toInt() }
                .sumOf { sss -> sss }
        }

        var sF = s[false]?.let {
            it.sumOf { ss -> ss.toInt() }
        }

        if (sT != null && sF != null) {
            if (sT == 1) {
                return "x + $sF"
            } else {
                return "${sT }x + $sF"
            }

        } else if (sT != null && sF == null) {
            if (sT == 1) {
                return "x"
            } else {
                return "${sT}x"
            }

        } else if (sT == null && sF != null) {
            return "$sF"
        } else {
            return ""
        }


    }
}

fun main() {
    var s = 다항식더하기()
    println(s.solution("3x + 7 + x").contentEquals("4x + 7"))
    println(
        s.solution("x + x + x").contentEquals("3x")
    )
    println(s.solution("x"))
}