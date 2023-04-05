package alg.lv0


class 최빈값구하기 {
    fun solution(array: IntArray): Int {
        var map = HashMap<Int, Int>()
        array.forEach {
            if (map[it] == null) {
                map[it] = 1
            } else {
                map[it] = map[it]!!.plus(1)
            }
        }

        val maxVal = map.maxByOrNull { it.value }

        var checkDuplicate = 0;
        map.forEach {
            if (it.value == maxVal!!.value) {
                checkDuplicate++
            }
        }
        if (checkDuplicate == 1) return maxVal!!.key else return -1

    }
}

fun main() {
    var s = 최빈값구하기()
    var r = s.solution(intArrayOf(1, 2, 3, 3, 3, 3, 4))
//    var r = s.solution(intArrayOf(1, 1, 2, 2))
//    var r = s.solution(intArrayOf(1))
//    var r = s.solution(intArrayOf(-2,2,2,3,-2))
    println(r)
}