package chap01.item09

import java.io.BufferedReader
import java.io.FileReader

fun countCharactersInFile2(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    reader.use {
        return reader.lineSequence().sumBy { it.length }
    }
}