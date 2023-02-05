//package c_functional
//
//// ### Higher-Order Functions ###
////
////fun calculate(x: Int, y:Int, operation: (Int, Int) -> Int):Int {
////    return operation(x,y)
////}
////
////fun sum(x: Int, y: Int) = x + y;
////
////fun main() {
////    val sumResult = calculate(4, 5, ::sum)
////    val mulResult = calculate(4,5) { a, b -> a * b }
////    println("sumResult $sumResult, mulResult $mulResult")
////}
////
//
//
//// ### Returning Functions ###
//
//fun operation(): (Int) -> Int {
//    return ::square
//}
//
//fun square(x:Int) = x * x
//
//fun main() {
//    val func = operation()
//    println(func(2))
//}

fun operation(x: Int, oper: (Int) -> Int):Int {
    return oper(x)
}

fun ss(s:Int): Int = s * s

fun main() {
    println(operation(10, oper = ::ss))
    println(operation(5){x -> x*2})
}