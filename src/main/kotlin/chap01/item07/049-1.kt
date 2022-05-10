package chap01.item07

import kotlin.Result

//inline fun <reified T> String.readObjectOfNull(): T? {
//    //...
//    val result: T? = null
//    if (incorrectSign) {
//        return null
//    }
//    //...
//    return result
//}

//inline fun <reified T> String.readObject(): Result<T> {
//    //...
//    val result: T? = null
//    if (incorrectSign) {
//        return Failure(JsonParsingException())
//    }
//    //...
//    return Success(result)
//}

//sealed class Result<out T>
//class Success<out T>(val result: T): Result<T>()
//class Failure(val throwable: Throwable): Result<Nothing>()
//
//class JsonParsingException: Throwable()
//
//val incorrectSign: Boolean = false