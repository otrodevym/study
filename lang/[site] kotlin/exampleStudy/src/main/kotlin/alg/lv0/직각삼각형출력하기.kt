package alg.lv0

class 직각삼각형출력하기 {

}

fun main() {
    var (v) = readln().split(' ').map(String::toInt)
    for (i in 1..v) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}