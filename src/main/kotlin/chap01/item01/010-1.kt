package chap01.item01

val anotherName: String? = "Marton"
val anotherSurname: String = "Braun"

val anotherFullName: String?
    get() = anotherName?.let { "$it $anotherSurname "}

val anotherFullName2: String? = anotherName?.let { "$it $anotherSurname "}

fun main() {
//    if (anotherFullName != null) {
//        println(anotherFullName.length) //오류
//    }

    if (anotherFullName2 != null) {
        println(anotherFullName2.length)
    }
}