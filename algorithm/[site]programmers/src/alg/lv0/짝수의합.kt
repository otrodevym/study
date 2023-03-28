package alg.lv0

class 짝수의합 {
//    fun solution(n: Int): Int {
////        var intList = ArrayList<Int>()
//        var sum = 0
//        for (i in 1..n) {
//            if(i.mod(2) == 0)
////                intList.add(i)
//                sum += i
//        }
//        return sum
////        return intList.sum()
//    }

    fun solution(n: Int) = (0..n).filter { it.mod(2) == 0 }.sum()
}

fun main() {
    var r = 짝수의합()
    println(r.solution(10))

}