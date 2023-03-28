package site.a_controlFlow

fun main() {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3
    var e: Int
//    println(e)

    val d: Int

    if (a.equals("initial")) {
        d = 1
    }else {
        d = 3
    }
    println(d)

    lateinit var aa: String
    aa = "gogo"

    println(aa)

    val bb by lazy {
        println("고고")
        "gone"
    }
    println(bb)
    println(bb)
}