package alg.lv1

class 부족한금액계산하기 {
    fun solution(price: Int, money: Int, count: Int) = run {
        var s = (0L..count).reduce{acc: Long, i: Long -> acc.plus(price.times(i))}
        if (money > s) {
            0L
        } else {
            s.minus(money)
        }
    }
}

fun main() {
    var s = 부족한금액계산하기()
    println(s.solution(3,	20,	4	) == 10L)
}