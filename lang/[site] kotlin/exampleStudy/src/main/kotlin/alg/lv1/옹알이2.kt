package alg.lv1

class 옹알이2 {
//    fun solution(babbling: Array<String>)=
//    babbling.map { it.replace("ayaaya|yeye|woowoo|mama".toRegex(), " ") }
//    .map { it.replace("aya|ye|woo|ma".toRegex(), "") }
//    .count { it.contentEquals("")  }

    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        var list = listOf<String>("aya", "ye", "woo", "ma")
        for (i in babbling) {
            var ii = i

            for ((index, j) in list.withIndex()) {
                ii = ii.replace(j, index.toString())
            }

            var temp = '9'
            var count = 0
            for (c in ii) {
                if (temp != c && (c == '0' || c == '1' || c == '2' || c == '3')) count++
                temp = c
            }
//            println("$count ${ii.length}")



            if (count == ii.length) answer++
        }
        return answer
    }
}

fun main() {
    var s = 옹알이2()
    println(s.solution(arrayOf("aya", "yee", "u", "maa")) == 1)
    println(
        s.solution(
            arrayOf(
                "ayaye",
                "uuu",
                "yeye",
                "yemawoo",
                "ayaayaa"
            )
        )
                == 2
    )
    println(
        s.solution(
            arrayOf(
                "mama",
                "yeye",
                "woowoo",
                "ayaaya",
                "myeaa",
                "ayayeaya"
            )
        )
                == 1
    )
    println(
        s.solution(
            arrayOf(
//                "mama", "yeye", "woowoo", "ayaaya", "ayayeye", "ayayeayayeayaaya",
                "ayayeaya", "mawoowoo"
            )
        )
                == 1
    )
//    "aya", "yee", "u", "maa"

}