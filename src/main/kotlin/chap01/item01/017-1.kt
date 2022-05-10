package chap01.item01

import kotlin.properties.Delegates

var names by Delegates.observable(listOf<String>()) { _, old, new ->
    println("Names changed from $old to $new")
}

fun main() {
    names += "Fabio"
    names += "Bill"
}