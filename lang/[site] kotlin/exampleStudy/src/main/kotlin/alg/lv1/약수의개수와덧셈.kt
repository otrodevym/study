package alg.lv1

class 약수의개수와덧셈 {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) {
            var l = mutableListOf<Int>()
            for (j in 1..i) {
                if (i.rem(j) == 0) {
                    l.add(j)
                }
            }
            if (l.size.rem(2) == 0) {
                answer += i
            } else {
                answer -= i
            }
        }
        return answer
    }
}

fun main() {
    var s = 약수의개수와덧셈()
    println(s.solution(13, 17) == 43)
    println(s.solution(24, 27) == 52)
}