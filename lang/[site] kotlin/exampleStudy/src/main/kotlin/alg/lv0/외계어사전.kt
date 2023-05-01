package alg.lv0

class 외계어사전 {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        for (s in dic) {
            var c = mutableSetOf<String>()
            for (i in spell) {
                if (s.contains(i)) {
                    c.add(i)
                }
            }
            if (c.size == spell.size) {
                return 1
            }

        }
//        println(answer)
//        return if(answer == spell.size) 1 else 2
        return 2
    }
}

fun main() {
    var s = 외계어사전()
    println(
        s.solution(
            arrayOf("p", "o", "s"),
            arrayOf("sod", "eocd", "qixm", "adio", "soo")
        ) == 2
    )
    println(
        s.solution(
            arrayOf("z", "d", "x"),
            arrayOf("def", "dww", "dzx", "loveaw")
        ) == 1
    )
    println(
        s.solution(
            arrayOf("s", "o", "m", "d"),
            arrayOf("moos", "dzx", "smm", "sunmmo", "som")
        ) == 2
    )
}