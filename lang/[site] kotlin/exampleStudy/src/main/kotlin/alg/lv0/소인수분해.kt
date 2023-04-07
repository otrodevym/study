package alg.lv0

class 소인수분해 {
//    fun solution(n: Int): IntArray {
//        var k = 2
//        var v = n
//        var list = mutableListOf<Int>()
//
//
//
//        for (i in 2..n) {
//            if (v.rem(i) == 0) {
//                list.add(i)
//                while (v.rem(i) == 0) {
//                    v = v.div(i)
//                }
//            }
//            if (v < i) {
//                break
//            }
//        }
//
////        while (true) {
////            var x = v.div(k)
////            var y = v.rem(k)
////            if (x != 0 && y == 0) {
////                list.add(k)
////                v = x
////            } else {
////                k = k.inc()
////            }
////            if (x == y) {
////                list.add(k)
////                break
////            }
////        }
//
//        return list.sorted().distinct().toIntArray()
//    }

    fun solution(n: Int): IntArray {
        return f1(n).distinct().sorted().toIntArray()
    }

    tailrec fun f1(
        n1: Int,
        k: Int = 2,
        list: IntArray = intArrayOf()
    ): IntArray {
        var a: Int = k
        var l = list.toMutableList()

        if (n1 <= a) {
            l.add(a)
            return l.toIntArray()
        }
        if (n1.rem(a) == 0) {
            l.add(a)
            return f1(n1.div(k), a, l.toIntArray())
        } else {
            a = a.inc()
            return f1(n1, a, l.toIntArray())
        }
    }
}

fun main() {
    var s = 소인수분해()
    println(s.solution(12).forEach { println(it) })
    println(s.solution(24).forEach { println(it) })
    println(s.solution(17).forEach { println(it) })
    println(s.solution(420).forEach { println(it) })
//    println(s.solution(12).contentEquals(intArrayOf(2,3)))
//    println(s.solution(17).contentEquals(intArrayOf(17)))
//    println(s.solution(420).contentEquals(intArrayOf(2,3,5,7)))
}
//12	[2, 3]
//17	[17]
//420	[2, 3, 5, 7]