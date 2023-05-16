package alg.lv1

class 두개뽑아서더하기 {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()


        var i = 1
        while (numbers.size > i) {
            for ((index,number) in numbers.withIndex()) {
                if(index == i) {
                    continue
                }
                answer.add(numbers[i].plus(number))
            }
            i++
        }
        return answer.sorted().toIntArray()
    }

}



fun main() {
    var s = 두개뽑아서더하기()
    println(s.solution(intArrayOf(2,1,3,4,1)).contentEquals(
        intArrayOf(2,3,4,5,6,7)))
    println(s.solution(intArrayOf(5,0,2,7)).contentEquals(
        intArrayOf(2,5,7,9,12)))


}