package alg.lv0

import kotlin.math.abs


class 평행 {
    fun solution(dots: Array<IntArray>): Int {



        var (a,b,c,d) = dots
        var ab = (a[0] - b[0]).toDouble() / (a[1] - b[1]).toDouble()

        var ac = (a[0] - c[0]).toDouble() / (a[1] - c[1]).toDouble()

        var ad = (a[0] - d[0]).toDouble() / (a[1] - d[1]).toDouble()

        var bc = (b[0] - c[0]).toDouble() / (b[1] - c[1]).toDouble()

        var bd = (b[0] - d[0]).toDouble() / (b[1] - d[1]).toDouble()

        var cd = (c[0] - d[0]).toDouble() / (c[1] - d[1]).toDouble()

        if (ab === cd || ac === bd || ad === bc) return 1 else return 0





//        var answer: Int = 0
//
//        var abX = abs(dots[0][0] - dots[1][0])
//        var abY = abs(dots[0][1] - dots[1][1])
//
//        var cdX = abs(dots[2][0] - dots[3][0])
//        var cdY = abs(dots[2][1] - dots[3][1])
//        if (abX == cdX && abY == cdY) {
//            return 1
//        }
//
//
//
//        var acX = abs(dots[0][0] - dots[2][0])
//        var acY = abs(dots[0][1] - dots[2][1])
//
//        var bdX = abs(dots[1][0] - dots[3][0])
//        var bdY = abs(dots[1][1] - dots[3][1])
//        if (acX == bdX && acY == bdY) {
//            return 1
//        }
//
//
//        var adX = abs(dots[0][0] - dots[3][0])
//        var adY = abs(dots[0][1] - dots[3][1])
//
//        var bcX = abs(dots[1][0] - dots[2][0])
//        var bcY = abs(dots[1][1] - dots[2][1])
//        if (adX == bcX && adY == bcY) {
//            return 1
//        }
//        return 0



//        var l = mutableListOf<String>()
//        for ((index, i) in dots.withIndex()) {
//            var k = index + 1
//            while (k < dots.size) {
//                var s = "${abs(i[0] - dots[k][0])}:${abs(i[1] - dots[k][1])}"
//                if (l.contains(s)) {
//                    return 1
//                }
//                l.add(s)
//                k++
//            }
//        }
//        l.forEach{println(it)}
//        return answer
    }
}

fun main() {
    var s =평행()
    println(s.solution(arrayOf(intArrayOf(1,4), intArrayOf(9,2), intArrayOf(3,8), intArrayOf(11,6))) == 1)
    println(s.solution(arrayOf(intArrayOf(3,5), intArrayOf(4,1), intArrayOf(2,4), intArrayOf(5,10))) == 0)

}