package site.d_Collections

fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B)
    val resultReduce2 = A.zip(B) {a, b -> "$a$b"}
    println("resultPairs : $resultPairs")
    println("resultReduce : $resultReduce")
    println("resultReduce2 : $resultReduce2")

}