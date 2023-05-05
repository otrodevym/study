package alg.lv1

class 최대공약수와최소공배수 {
    fun solution(n: Int, m: Int): IntArray {

        var max = listOf<Int>(n, m).maxOf { it }
        var min = listOf<Int>(n, m).minOf { it }

        var lcm = 0
        var gcm = 0
        for (i in 1..max) {
            if (n.rem(i) == 0 && m.rem(i) == 0) {
                lcm = i
            }
        }
        for (i in max..min.times(max)) {
            if (i.rem(min) == 0 && i.rem(max) == 0) {
                gcm = i
                break
            }
        }
        return listOf<Int>(lcm, gcm).toIntArray()
    }
}

fun main() {
    var s = 최대공약수와최소공배수()
    println(
        s.solution(3, 12)
            .contentEquals(intArrayOf(3, 12))
    )
    println(s.solution(2, 5).contentEquals(intArrayOf(1, 10)))
}