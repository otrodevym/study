package c_functional

import kotlin.coroutines.EmptyCoroutineContext

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String get() = items.joinToString { it.name }


fun Order.last(): String = items.lastOrNull()?.name ?: "없음"
fun String.lastChar(): Char = this.lastChar()

fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

var List<String>.lastChar: String
    get() {
        return last()
    }
    set(value) {
        var lastChart: String = last()
        lastChart = value
    }


fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"


fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    val list = arrayListOf<Int>(1, 2, 3, 4)
    println(list.joinToString())
}