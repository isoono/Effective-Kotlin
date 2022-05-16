package chap01.item08

import java.util.*

fun main() {

    val printer: Printer? = getPrinter()
//    printer.print() //컴파일 오류

    printer?.print() //안전 호출
    if(printer != null) printer.print() //스마트 캐스팅
    printer!!.print() //not-null assertion

}

class Printer {
    fun print() = print("print!")
}

fun getPrinter(): Printer? {
    val random = Random()
    val result = random.nextInt()
    val printerTest = Printer()
    if (result >= 0) {
        return printerTest
    }
    return null
}