package chap01.item08

//fun largestOf (a: Int, b: Int, c: Int, d: Int): Int =
//    listOf(a, b, c, d).maxOrNull()!!

fun largestOf (vararg nums: Int): Int =
    nums.maxOrNull()!!

fun main() {
    largestOf() //NPE
}