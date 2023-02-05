package a_controlFlow////// ## for ###
////
////
////fun controlFlow.main() {
////    val cakes = listOf("carrot", "cheese", "chocolate")
////    for (cake in cakes) {
////        println("Yummy, its a $cake kate!")
////    }
////
////}
////
//
//// ### while ###
//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")
//
//fun controlFlow.main(args: Array<String>) {
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5) {
//        eatACake()
//        cakesEaten++
//    }
//
//    do{
//        bakeACake()
//        cakesBaked++
//    }while (cakesBaked < cakesEaten)
//
//}

// ### Iterators ###

class Animal(val name: String)

//class controlFlow.Zoo(val animals: List<controlFlow.Animal>){
class Zoo(private val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//    for (animal in zoo.animals) {
    for (animal in zoo) {
        println("watch out, it's a ${animal.name}")
    }
}