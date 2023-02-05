package a_controlFlow// ### Generics ###

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "Mutablesstack(${elements.joinToString()})"
}

//fun controlFlow.main() {
//    var t = controlFlow.MutableStack<String>()
//    t.push("asd1")
//    t.push("asd2")
//    t.push("asd3")
//    println(t.toString())
//    println(t.peek())
//    println(t.isEmpty())
//    println(t.size())
//    println(t.pop())
//    println(t.size())
//    println(t.toString())
//
//}


// ### Generic Functions ###


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.623, 3.14, 2.7)
    println(stack)
}