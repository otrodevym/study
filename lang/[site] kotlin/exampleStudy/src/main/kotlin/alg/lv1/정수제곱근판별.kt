package alg.lv1


class 정수제곱근판별 {
    fun solution(n: Long): Long {
        var answer: Long = -1L
        for (i in 0L..n.div(2) + 1) {
            var t = i.times(i)
            if (t == n) {
                var temp = i + 1
                answer = temp.times(temp)
            } else if (t >= n) {
                break
            }
        }

        return answer
    }
}

fun main() {
    var s = 정수제곱근판별()
    println(s.solution(1) == 4L)
    println(s.solution(121) == 144L)
    println(s.solution(3) == -1L)
    println(s.solution(484) == 529L)
    println(s.solution(483) == -1L)
}