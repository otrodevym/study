package d_Collections

fun main() {
    val words = listOf<String>("Lets", "something", "in", "collection", "somehow")
    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }
    println(first)
    println(last)
    println(nothing)

}