package d_Collections

fun main() {
    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }
    println(positives)
    println(negatives)
}