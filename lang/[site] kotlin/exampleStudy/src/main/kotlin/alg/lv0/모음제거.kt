package alg.lv0

class 모음제거 {
//    fun solution(my_string: String) = my_string
//        .replace("a", "")
//        .replace("e", "")
//        .replace("i", "")
//        .replace("o", "")
//        .replace("u", "")
    fun solution(my_string: String) = my_string.replace("a|e|i|o|u".toRegex(), "")
}
//  a, e, i, o, u
fun main() {
    var r = 모음제거()
    println(r.solution("bus").contentEquals("bs"))
    println(r.solution("nice to meet you").contentEquals("nc t mt y"))
}