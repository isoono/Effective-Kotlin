package chap01.item01

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            num += 1
        }
    }
    Thread.sleep(5000)
    print(num)
    //1000이 아닐 확률이 높으며, 실행할 때마다 다른 숫자가 출력된다.
}