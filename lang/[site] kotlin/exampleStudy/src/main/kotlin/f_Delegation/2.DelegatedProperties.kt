package f_Delegation
//
//import kotlin.reflect.KProperty
//
//class Delegate() {
//    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
//        return "$thisRef, thank you fro delegating '${prop.name}' to me!"
//    }
//
//    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
//        println("$value has benn assigned to ${prop.name} in $thisRef")
//    }
//}
//
//class Example {
//    var p: String by Delegate()
//    override fun toString() = "Example Class"
//}
//
//fun main() {
//    val e = Example()
//    println(e.p)
//    e.p = "NEW"
//}
//
//
//class LazySample{
//    init {
//        println("created")
//    }
//    val lazyStr: String by lazy{
//        println("computed!")
//        "my lazy"
//    }
//}
//fun main() {
//    val sample = LazySample()
//    println("lazyStr = ${sample.lazyStr}")
//    println(" = ${sample.lazyStr}")
//}

class User(val map: Map<String, Any?>) {
    val name:String by map
    val age:Int     by map
}

fun main() {
    val user = User(mapOf(
        "name" to "John Doe",
        "age" to 25
    ))
    println("name = ${user.name} age = ${user.age}")
}
