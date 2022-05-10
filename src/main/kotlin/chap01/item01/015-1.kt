package chap01.item01

class User(
    val name: String,
    val surname: String
) {
    fun withSurname(
        surname: String
    ) = User(name, surname)

    override fun toString(): String {
        return "User(name=$name, surname=$surname)"
    }

}

fun main() {
    var user = User("Maja", "Markiwicz")
    println(user)
    user = user.withSurname("Moskala")
    println(user)
}