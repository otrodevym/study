
class 최대값만들기1() {
//    fun solution(numbers: IntArray): Int {
//        var answer: Int = 0
//        var index: Int = 1
//        var temp: Int = numbers[0]
//        while(true) {
//            var multiple: Int = temp.times(numbers[index])
//            if(answer < multiple) {
//                answer = multiple
//            }
//            temp = numbers[index]
//            index++
//            if (numbers.size == index) {
//                break;
//            }
//
//        }
//        return answer
//    }
    fun solution(numbers: IntArray) = numbers.sorted().let { it[it.lastIndex].times(it[it.lastIndex -1]) }
}

fun main() {
    var r = 최대값만들기1()
    println(r.solution(intArrayOf(1,2,3,4,5)))
}