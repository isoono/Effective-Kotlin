package chap03.item24

class Box<out T> {
    private var value: T? = null

    private fun set(value: T) {
        this.value = value
    }

    fun get(): T = value ?: error("Value not Set")
}