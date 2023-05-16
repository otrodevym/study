package alg.lv1

class 소수만들기 {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var l = nums.plus(nums)
        var i = 0
        while (i < nums.size - 2) {
            var j = i + 1
            while (j < nums.size -1) {
                var k = j + 1
                while (k < nums.size) {
                    var v = nums[i] + nums[j] + nums[k]
                    var c = 0
                    for (vv in 2..v) {
                        if (v.rem(vv) == 0) {
                            c++
                        }
                        if (c > 1) {
                            break
                        }
                    }
                    if (c == 1) {
                        answer++
                    }
                    k++
                }
                j++
            }

            i++
        }


        return answer
    }
}

fun main() {
    var s = 소수만들기()
    println(s.solution(intArrayOf(1,2,3,4))
//            == 1
            )
    println(s.solution(intArrayOf(1,2,7,6,4))
//            == 4
            )
}