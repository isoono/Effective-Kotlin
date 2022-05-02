package chap01.item01

var name: String = "Marcin"
var surname: String = "Moskala"
val fullName
    get() = "$name $surname"

fun main() {
    println(fullName)
    name = "Maja"
    println(fullName)
}