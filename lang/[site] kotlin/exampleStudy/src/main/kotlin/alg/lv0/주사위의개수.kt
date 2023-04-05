package alg.lv0

class 주사위의개수 {
    //    fun solution(box: IntArray, n: Int): Int {
//        var answer: Int = 0
//        answer = box[0].div(n)
//        answer *= box[1].div(n)
//        answer *= box[2].div(n)
//
//        return answer
//    }
    fun solution(box: IntArray, n: Int) = box.fold(1) { acc: Int, i: Int -> acc.times(i.div(n)) }
}

fun main() {
    var r = 주사위의개수()
//    println(r.solution(intArrayOf(1,1,1), 1) == 1)
//    println(r.solution(intArrayOf(10,8,6), 3) == 12)
    println(r.solution(intArrayOf(1,1,1), 1))
    println(r.solution(intArrayOf(10,8,6), 3))
}