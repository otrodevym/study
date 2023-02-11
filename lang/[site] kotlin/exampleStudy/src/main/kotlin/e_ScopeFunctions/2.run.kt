package e_ScopeFunctions

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\": ")
        val result = ns?.run{
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
        println("result : $result")
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength(
        "some string with Kotlin"
    )
}