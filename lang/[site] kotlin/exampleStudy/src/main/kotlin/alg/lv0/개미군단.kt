package alg.lv0

class 개미군단 {
//    장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다
    fun solution(hp: Int): Int {
        var answer: Int = 0
        answer = hp.div(5)
        answer += hp.mod(5).div(3)
        answer += hp.mod(5).mod(3).div(1)
        return answer
    }
}

fun main() {
    var r = 개미군단()
    println(r.solution(23) == 5)
    println(r.solution(24) == 6)
    println(r.solution(999) == 201)
}