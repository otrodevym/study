package alg.lv0

class 삼각형의완성조건1 {
//    fun solution(sides: IntArray): Int {
//        var sort = sides.sorted()
//        var value =
//        return when {
//            sort[2].minus(sort[0].plus(sort[1])) < 0 -> 1
//            else -> 2
//        }
//    }
    fun solution(sides: IntArray) = sides.sorted().let { (x, y, z) -> if(x.plus(y).minus(z) > 0) 1 else 2 }
}

fun main() {
    var s = 삼각형의완성조건1()
    println(s.solution(intArrayOf(3,3,2)) == 1)
    println(s.solution(intArrayOf(3,3,3)) == 1)
    println(s.solution(intArrayOf(1,2,3)) == 2)
    println(s.solution(intArrayOf(3,6,2)) == 2)
    println(s.solution(intArrayOf(199,72,222)) == 1)
    println(s.solution(intArrayOf(1,99,3)) == 2)
    println(s.solution(intArrayOf(99,99,3)) == 1)
    println(s.solution(intArrayOf(99,99,1)) == 1)
}