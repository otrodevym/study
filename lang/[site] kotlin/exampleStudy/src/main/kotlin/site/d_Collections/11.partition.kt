package site.d_Collections

fun main() {
    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    println(evenOdd)
    println("$positives, $negatives")
}