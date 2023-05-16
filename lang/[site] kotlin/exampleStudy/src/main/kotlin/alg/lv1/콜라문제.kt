package alg.lv1

class 콜라문제 {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0

        var nn = n
        while (true) {
            var nnn = nn.div(a).times(b)
            answer = answer.plus(nnn)
            nnn = nnn.plus(nn.rem(a))
            nn = nnn
            if (nn < a) {
//                answer = answer.plus(nn.rem(a))
                break
            }
        }
        return answer
    }
}

fun main() {
    var s = 콜라문제()
//    println(s.solution(2,1,20) ==19)
//    println(s.solution(3,1,20) ==9)
    println(s.solution(3,2,20) ==36) // 6
}