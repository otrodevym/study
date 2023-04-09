package alg.ohtest

class c02 {
    fun solution(str: String): String {
        var answer: String = ""

        var v = listOf('a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'U' )
        var m = mutableListOf<Char>()
        for (value in str) {
            if (value in v) {
                m.add(value)
            }
        }
        m.reverse()
        for (value in str) {
            if (value in v) {
                answer += m.removeFirst()
            } else {
                answer += value
            }
        }




        return answer
    }

}

fun main() {
    var s = c02()
    println(s.solution("bucketplace"))
    println(s.solution("aa"))
    println(s.solution("AE"))
    println(s.solution("AE1 aa"))
    println(s.solution("12345"))
    println(s.solution("IAE"))
    println(s.solution("BBBBAAAA"))
    println(s.solution("BBAA"))
    println(s.solution("BBA"))
    println(s.solution("BBUA"))
    println(s.solution("BBUAEe"))
//    println(s.solution("bucketplace") =="beckatplecu")
//    println(s.solution("bucketplace") =="beckatplecu")
}