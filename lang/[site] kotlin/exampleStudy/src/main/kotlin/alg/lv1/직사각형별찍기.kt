package alg.lv1

class 직사각형별찍기 {

}

fun main() {
        val (a, b) = readln().split(' ').map(String::toInt)
        println("$a $b")
        for (i in 0 until b) {
                for (j in 0 until a) {
                        print("*")
                }
                println()
        }
}