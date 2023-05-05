package alg.lv1

class 서울에서김서방찾기 {
    fun solution(seoul: Array<String>) = "김서방은 ${seoul.indexOf("Kim")}에 있다"
}

fun main() {
    var s = 서울에서김서방찾기()
    s.solution(
      arrayOf("Jane", "Kim")
    ).contentEquals("김서방은 1에 있다")
//    	"김서방은 1에 있다"
}