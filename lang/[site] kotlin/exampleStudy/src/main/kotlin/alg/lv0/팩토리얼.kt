package alg.lv0

class 팩토리얼 {
//    fun solution(n: Int): Int {
//        var answer: Int = 1
//        if (n == 0) {
//            return 0
//        }
//        for (i in 1..n) {
//            answer = answer.times(i)
//            if(answer > n) {
//                return i -1
//            }
//            if (answer >= n) {
//                return i
//            }
//        }
//        return answer
//    }


//
//    private tailrec fun factorial(n: Int, run: Int = 1): Int = if(n == 1) run else factorial(n - 1, run * n)
//    fun solution(n: Int) = (2..n).find { n < factorial(it) }?.dec() ?: n
//
//
//    tailrec fun factorial2(n: Int, acc: Int): Int {
//        return if (n <= 0) {
//            acc
//        } else {
//            factorial2(n - 1, n * acc)
//        }
//    }

//    fun factorial2(n: Int, acc: Int): Int {
//        return if (n <= 0) {
//            acc
//        } else {
//            factorial2(n - 1, acc * n)
//        }
//    }

    private tailrec fun factorial(n: Int, acc: Int = 1): Int = if(n <= 0 ) acc else factorial(n - 1, acc * n)
    fun solution(n: Int) = (1..n).find{ n < factorial(it) }?.dec() ?: n
}

fun main() {
    var s = 팩토리얼()

//    println(s.solution(0) == 0)
//    println(s.solution(1) == 1)
//    println(s.solution(3628800) == 10)
//    println(s.solution(7) == 3)
//    println(s.solution(2))
    println(s.solution(0) == 0)
    println(s.solution(1) == 1)
    println(s.solution(2) == 2)
    println(s.solution(3) == 2)
    println(s.solution(4) == 2)
    println(s.solution(5) == 2)
    println(s.solution(6) == 3)
    println(s.solution(7) == 3)
    println(s.solution(8) == 3)
    println(s.solution(9) == 3)
    println(s.solution(1) )
    println(s.solution(3628800))


//    var v = 4
//    println("factorial(${v}) : ${s.factorial2(v, 1)}")
}