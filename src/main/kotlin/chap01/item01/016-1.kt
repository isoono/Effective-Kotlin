package chap01.item01

import kotlin.concurrent.thread

fun main() {
    var list = listOf<Int>()
    for (i in 1..1000) {
        thread {
            list = list + 1
        }
    }

    Thread.sleep(1000)
    print(list.size)
    // 1000이 되지 않고, 실행할 때마다 다른 숫자가 나옴
}
