package alg.lv0

class 나이출력 {
    fun solution(age: Int): Int {
        return 2022.minus(age).plus(1)
    }
}

fun main() {
    var s = 나이출력()
//    var r = s.solution(40)
    var r = s.solution(23)
    println(r)

}