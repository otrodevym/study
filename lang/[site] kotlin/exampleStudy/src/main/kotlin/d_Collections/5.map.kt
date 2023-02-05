package d_Collections

fun main() {
    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }
    println(doubled)
    println(tripled)
}