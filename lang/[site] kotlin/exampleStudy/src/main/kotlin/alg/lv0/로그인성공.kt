package alg.lv0

class 로그인성공 {
//    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
//        var answer: String = ""
//
//        var dbMap = mutableMapOf<String, String>()
//        for (strings in db) {
//            dbMap[strings[0]] = strings[1]
//        }
//        if (dbMap[id_pw[0]] != null) {
//            if (dbMap[id_pw[0]] == id_pw[1]) {
//                return "login"
//            } else {
//                return "wrong pw"
//            }
//        } else {
//            return "fail"
//        }
//
//    return answer
    //}
        fun solution(id_pw: Array<String>, db: Array<Array<String>>) = db.associate { (k, v) -> k to v}[id_pw[0]]?.run { if(equals(id_pw[1])) "login" else "wrong pw" } ?: "fail"

}
fun main() {
    var s = 로그인성공()
    println(
        s.solution(
            arrayOf("meosseugi", "1234"), arrayOf(
                arrayOf("rardss", "123"), arrayOf(
                    "yyoom", "1234"
                ), arrayOf(
                    "meosseugi", "1234"
                )
            )
        ).contentEquals("login")
    )

    println(
        s.solution(
            arrayOf("programmer01", "15789"), arrayOf(
                arrayOf(
                    "programmer02", "111111"
                ), arrayOf("programmer00", "134"), arrayOf(
                    "programmer01", "1145"
                )
            )
        ).contentEquals("wrong pw")
    )
//    ["rabbit04", "98761"][["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]] "fail"
}