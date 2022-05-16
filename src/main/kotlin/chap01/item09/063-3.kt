package chap01.item09

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun countCharactersInFile4(path: String): Int {
    File(path).useLines { lines ->
        return lines.sumBy { it.length }
    }
}