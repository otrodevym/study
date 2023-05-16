package alg.lv1

class 추억점수 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = mutableListOf<Int>()


        for ((index1, list) in photo.withIndex()) {
            var v = 0
            for (value in photo[index1]) {
                var f = name.indexOf(value)
                if(f != -1 ) {
                    v = v.plus(yearning[f])
                }
            }
            answer.add(v)
        }


        return answer.toIntArray()
    }
}

fun main() {
    var s = 추억점수()
    println(s.solution(arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3),
        arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))
    ).contentEquals(intArrayOf(19, 15, 6)))
//    ["kali", "mari", "don"]	[11, 1, 55]	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	[67, 0, 55]
//    ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	[5, 15, 0]
}