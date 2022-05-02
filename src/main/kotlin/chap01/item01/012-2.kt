package chap01.item01

val list = listOf(1, 2, 3)

fun main() {
    //이렇게 하면 안됨
    if (list is MutableList) {
        list.add(4)
    }
}