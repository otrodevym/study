package alg.lv1

import site.a_controlFlow.mutableStackOf
import java.util.*
import kotlin.collections.ArrayDeque

class 숫자짝꿍 {
    fun solution(X: String, Y: String): String {
        var l = mutableListOf<Char>()
        var x = X.toMutableList()
        var y = Y.toMutableList()

        var m1 = mutableMapOf<Char, Int>()
        var m2 = mutableMapOf<Char, Int>()
        for (j in x) {
            if (m1[j] == null) {
                m1[j] = 1
            } else {
                m1[j] = m1[j]!! + 1
            }
        }

        for (j in y) {
            if (m2[j] == null) {
                m2[j] = 1
            } else {
                m2[j] = m2[j]!! + 1
            }
        }
        for (i in m1) {
            if (m2[i.key] != null) {
                var v = minOf(i.value, m2[i.key]!!)
                i.key.toString().repeat(v).map { l.add(it) }
            }
        }


        var s = l.sortedDescending().joinToString("")
        s = s.ifEmpty { "-1" }
        s = if (s[0] == '0') "0" else s

        return s
    }
}

fun main() {
    var s = 숫자짝꿍()
    println(s.solution("100", "2345").contentEquals("-1"))
    println(s.solution("100", "203045").contentEquals("0"))
    println(s.solution("100", "123450").contentEquals("10"))
    println(s.solution("12321", "42531").contentEquals("321"))
    println(s.solution("5525", "1255").contentEquals("552"))
    println(
        s.solution(
            "000000000000000100000",
            "0000000000000001111111111111100000"
        ).contentEquals("100000000000000000000")
    )
}