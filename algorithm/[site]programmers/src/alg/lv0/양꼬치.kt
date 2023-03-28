package alg.lv0

class 양꼬치 {
    companion object {
        private val N_MONEY = 12_000
        private val K_MONEY = 2_000
        private val K_SERVICE = 10
    }
    fun nTimes(n: Int) = n.times(N_MONEY)
    fun kService(n: Int, k: Int) = k.minus(n.div(K_SERVICE))
    fun kTimes(n: Int, k: Int) = k.times(kService(n, k))
    fun solution(n: Int, k: Int): Int {
//        return n.times(N_MONEY).plus(k.minus(n.div(K_SERVICE)).times(K_MONEY))
        return nTimes(n).plus(kTimes(n, k))
    }
}

fun main() {
    var s = 양꼬치()
//    println(s.solution(10,3))
    println(s.solution(64, 6))
}