package c_functional


fun main() {

val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = {str: String -> str.uppercase()}

//val upperCase4 = {str -> str.uppercase()}

val upperCase5: (String) -> String = {it.uppercase()}
val upperCase6: (String) -> String = String::uppercase

println(upperCase1("Hello"))
println(upperCase2("Hello"))
println(upperCase3("Hello"))
//println(upperCase4("Hello"))
println(upperCase5("Hello"))
println(upperCase6("Hello"))
}
