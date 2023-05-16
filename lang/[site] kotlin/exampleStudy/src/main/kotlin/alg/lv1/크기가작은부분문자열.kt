package alg.lv1

class 크기가작은부분문자열 {
//    fun solution(t: String, p: String): Int {
//        var answer: Int = 0
//        for (v in 0..t.length - p.length) {
//            var s = t.substring(v, v + p.length)
//
//            if (s.toInt() <= p.toInt())
//                answer++
//        }
//        return answer
//    }

    fun solution(t: String, p: String) =
        (0..t.length - p.length).map { t.substring(it, it.plus(p.length)) }
            .count { it.toLong() <= p.toLong() }
}

fun main() {
    var s = 크기가작은부분문자열()
    println(s.solution("3141592", "271") == 2)
    println(s.solution("500220839878", "7") == 8)
    println(s.solution("10203", "15") == 3)
}