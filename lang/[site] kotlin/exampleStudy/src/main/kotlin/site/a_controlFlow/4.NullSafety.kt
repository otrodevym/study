package site.a_controlFlow

fun main() {
//    var neverNull: String "This cal't be null"
//    neverNull = null
//
//    var nullAble:String? = "You can keep a null here "
//    nullAble = null
//
//    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null
//
//    fun strLength(notNull: String): Int {
//        return notNull.length
//    }
//
//    strLength(neverNull)
//    strLength(nullAble)

    println(describeString(null))
    println(describeString("sdgkndslgn"))

}

fun describeString(maybeString: String?): String {
    if(maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null String"
    }
}