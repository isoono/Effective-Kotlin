//package chap03.item24
//
//class Box<out T> {
//    private var value: T? = null
//
//// 코틀린에서는 사용할 수 없는 코드
//    fun set(value: T) {
//        this.value = value
//    }
//
//    fun get(): T = value ?: error("Value not set")
//}
//
//
//fun main() {
//    val puppyBox = Box<Puppy>()
//    val dogBox: Box<Dog> = puppyBox
//    dogBox.set(Hound())
//
//    val dogHouse = Box<Dog>()
//    val box: Box<Any> = dogHouse
//    box.set("Some String")
//    box.set(42)
//}