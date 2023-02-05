package b_specialClasses

sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)
class Human(private val humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when(mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}
fun main() {
    println(greetMammal(Human("kim", "dev")))
    println(greetMammal(Cat("miho")))
}