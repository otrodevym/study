package site.g_ProductivityBoosters
fun format(userName:String, domain:String) = "$userName@$domain"
fun main() {
    println(format("mario", "example.com"))
    println(format("domain.com", "useranme"))
    println(format(userName = "foo", domain = "bar.com"))
    println(format(domain = "frog.com", userName = "pepe"))

}