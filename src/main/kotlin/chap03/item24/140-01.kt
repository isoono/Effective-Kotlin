package chap03.item24

open class Dog
class Puppy: Dog()
class Hound: Dog()

fun takeDog(dog: Dog) {}

fun main() {
    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())
}
