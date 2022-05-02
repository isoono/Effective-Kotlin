package chap01.item01

val immutableList = listOf(1, 2, 3)

val mutableList = immutableList.toMutableList()

fun main() {
    mutableList.add(4)
    print(mutableList)
}