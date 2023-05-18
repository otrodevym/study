package alg.lv1


data class S(var stage: Int, var failPercent:Float, var oldIndex: Int, var newIndex: Int, var personCount: Int)
class 실패율 {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var m = mutableMapOf<Int, S>()

        for (i in 1..N) {
            m[i] = S(i, 0.0f, -1, -1, 0)
        }

        for ((index,i) in stages.sorted().withIndex()) {
            if (i > N) {
                break
            }
            if(m[i] == null) {
//                m[i] = S(i, 0.0f, index, -1, 1)
            } else {
                m[i] = S(i, 0.0f, index, -1, m[i]!!.personCount + 1)
            }
        }

        var stageSize = stages.size
        for (i in m) {
            var v = i.value
            v.failPercent = v.personCount.div(stageSize.toFloat())
            stageSize -= v.personCount
        }
        m.forEach { println(it.value.toString()) }
        var l = m.values.toList().sortedWith(compareBy({-it.failPercent}, {it.stage}))
//        l.forEach { println(it) }
        var ll = l.map { it.stage }.toList()
//        ll.forEach { println(it) }



        return ll.toIntArray()
    }
}

fun main() {
    var s = 실패율()
    println(s.solution(5, intArrayOf(2,1,2,6,2,4,3,3)).contentEquals(intArrayOf(3,4,2,1,5)))
    println(s.solution(4, intArrayOf(4,4,4,4,4)).contentEquals(intArrayOf(4,1,2,3)))
//    5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//    4	[4,4,4,4,4]	[4,1,2,3]
}