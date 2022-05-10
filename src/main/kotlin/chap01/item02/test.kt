package chap01.item02

fun main() {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        var prime: Int
        while (true) {
            prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }
    print(primes.take(10).toList())
    // [2, 3, 5, 6, 7, 8, 9, 10, 11, 12]
}