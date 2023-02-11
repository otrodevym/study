package e_ScopeFunctions
class Person(var name:String, var age:Int, var about:String){
    constructor(): this("", 0,"")
}


fun main() {
    val jake = Person()
    val stringDescription = jake.apply{
        name = "jake"
        age = 30
        about = "Android Develop"
    }.toString()
    println(stringDescription)
}