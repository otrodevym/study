package alg.lv0

class 저주의숫자3 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = 1
        while (true) {
            answer++
            if (answer.toString().contains("3")) {
                continue
            } else if (answer.rem(3) == 0) {
                continue
            }

            if (num == n) {
                break
            }
            num++

        }
        return answer
    }
}

fun main() {
    var s = 저주의숫자3()
    println(s.solution(15) == 25)
    println(s.solution(40) == 76)

}