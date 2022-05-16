package chap01.item09

import java.io.BufferedReader
import java.io.FileReader

fun countCharactersInFile3(path: String): Int {
    BufferedReader(FileReader(path)).use { reader ->
        return reader.lineSequence().sumBy { it.length }
    }
}