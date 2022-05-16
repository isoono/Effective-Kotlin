package chap01.item09

import java.io.BufferedReader
import java.io.FileReader

fun countCharactersInFile1(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    try {
        return reader.lineSequence().sumBy { it.length }
    } finally {
        reader.close()
    }
}