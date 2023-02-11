package e_ScopeFunctions

class Person2(var name:String, var age:Int, var about:String)

fun writeCreationLog(p: Person2) {
    println("A new Person: ${p.name} was created.")
}
fun main() {
    val jake = Person2("Jake", 30, "Android Develop")
        .also {
            writeCreationLog(it)
        }
}