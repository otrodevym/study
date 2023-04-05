package alg.lv0

class 암호해독 {
//    fun solution(cipher: String, code: Int): String {
//        var answer: String = ""
//        for (i in code .. cipher.length step code) {
//            answer += cipher[i-1]
//        }
//        return answer
//    }
    fun solution(cipher: String, code: Int) = cipher.filterIndexed{index, _ -> (index + 1).mod(code) == 0 }
}

fun main() {
    var r = 암호해독()

//    println(r.solution("dfjardstddetckdaccccdegk", 4))
    println(r.solution("dfjardstddetckdaccccdegk", 4).contentEquals("attack"))
    println(r.solution("pfqallllabwaoclk", 2).contentEquals("fallback"))
}