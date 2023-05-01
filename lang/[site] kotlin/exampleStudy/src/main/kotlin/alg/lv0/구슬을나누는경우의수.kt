package alg.lv0

import java.math.BigInteger
class 구슬을나누는경우의수 {
    //    fun solution(balls: Int, share: Int): Int {
//        // 3 2
////        n! / (n-m)! * m!
//        var n = factorial(balls.toULong())
//        var m = factorial(share.toULong())
//        var nm = factorial((balls - share).toULong() )
//
//        return n.div(nm.times(m)).toInt()
//    }
//    fun factorial(a: ULong, b: ULong = 1u): ULong {
//        if (a == 0.toULong()) {
//            return b
//        }
//        return factorial(a - 1u , a * b)
//    }

    fun Long.toBigInteger() = BigInteger.valueOf(this)
    fun Int.toBigInteger() = BigInteger.valueOf(toLong())
    fun solution(balls: Int, share: Int): Int {
//        n! / (n-m)! * m!
        var n = 1.toBigInteger()
        var m = 1.toBigInteger()
        var nm = 1.toBigInteger()
        for (i in 1..balls) {
            n *= i.toBigInteger()
        }
        for (i in 1..share) {
            m *= i.toBigInteger()
        }
        for (i in 1..(balls - share)) {
            nm *= i.toBigInteger()
        }
        println("n $n m $m nm $nm")
//265252859812191058636308480000000
//9682165104862298112
        return n.div(nm.times(m)).toInt()
    }
}


fun main() {
    var s = 구슬을나누는경우의수()
//    println(s.factorial(0, 4))
//    println(s.solution(3, 2))
//    println(s.solution(3, 2) == 3)
//    println(s.solution(3, 2))
//    println(s.solution(5, 3))
//    println(s.solution(5, 3))
    println(s.solution(30, 15))
}