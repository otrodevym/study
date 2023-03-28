package site.a_controlFlow

class Customer

class Contract(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contract = Contract(1, "mary@gmail.com")
    println(contract.id)
    contract.email = "jane@gmail.com"

    println(contract.toString())
    println(contract.id)
    println(contract.email)
}