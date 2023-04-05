package alg.lv0

class 편지 {
    fun solution(message: String) =  message.length.times(2)
}

fun main() {
    var r = 편지()
    println(r.solution("happy birthday!") == 30)
    println(r.solution("I love you~") == 22)

}