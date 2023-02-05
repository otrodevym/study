package d_Collections

fun main() {
    val fruitsBag = listOf<String>("apple", "orange", "banana", "grapes")
    val clothesBag = listOf<String>("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    val flatMapBag2 = cart.flatten()

    println(mapBag)
    println(flatMapBag)
    println(flatMapBag2)


}