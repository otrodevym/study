package alg.lv0

class 옷가게할인받기 {

    companion object {
        private const val M5 = 500_000
        private const val M3 = 300_000
        private const val M1 = 100_000
    }

    fun solution(price: Int): Int {
        if (price.div(M5) > 0) {
            return price.minus(price.times(0.2)).toInt()
        } else if (price.div(M3) > 0) {
            return price.minus(price.times(0.1)).toInt()
        } else if (price.div(M1) > 0) {
            return price.minus(price.times(0.05)).toInt()
        } else {
            return price
        }

    }
}

fun main() {
    var r = 옷가게할인받기()
    println(r.solution(150000))
    println(r.solution(580000))
}
