package site.d_Collections

fun main() {

    val map = mapOf("key" to 42)

    val value1 = map["key"]
    val value2 = map["key2"]

    val value3: Int = map.getValue("key")

    val mapWithDefault = map.withDefault { k -> k }
//    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")
    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message $e")
    }

    println(value1)
    println(value2)
    println(value3)
    println(value4)

}