package alg.lv0

class 피자나눠먹기2 {
    companion object {
        private const val PIZZA_SIZE = 6
    }
    fun solution(n: Int): Int {
        if(n.mod(PIZZA_SIZE) == 0) {
            return n.div(PIZZA_SIZE)
        } else {
            var c = 1
            while(true) {
                var r = c.times(PIZZA_SIZE)
                if (r.mod(n) == 0) {
                    return c
                }
                c++
            }
        }
    }
}

fun main() {
    var r = 피자나눠먹기2()
    println(r.solution(6))
    println(r.solution(10))
    println(r.solution(4))
}