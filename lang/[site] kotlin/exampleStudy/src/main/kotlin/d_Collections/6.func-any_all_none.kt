package d_Collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it < 6 }
    println(anyNegative)
    println(anyGT6)

    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println(allEven)
    println(allLess6)

    val allEvenNone = numbers.none { it % 2 == 0 }
    val allLess6None = numbers.none { it < 6 }
    println(allEvenNone)
    println(allLess6None)



}