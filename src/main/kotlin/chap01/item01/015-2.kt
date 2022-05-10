package chap01.item01

data class dataUser(
    val name: String,
    val surname: String
)

fun main() {
    var user = dataUser("Maja", "Markiewicz")
    user = user.copy(surname="Moskala")
    println(user)
}