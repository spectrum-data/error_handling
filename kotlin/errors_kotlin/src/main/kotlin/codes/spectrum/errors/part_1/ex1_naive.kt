package codes.spectrum.errors.part_1

import java.io.File
import kotlin.system.exitProcess

/**
 * Наивная реализация `sqr` вообще без какого бы то ни было представления, что могут вообще быть ошибки
 */
fun main(argv: Array<String>) {
    val filename = argv[0];
    val file = File(filename)
    val buffer = ByteArray(10)
    val size = file.inputStream().read(buffer)
    val content = String(buffer,0,size)
    val number = content.toInt()
    println("$number * $number = ${number * number}")
    exitProcess(0)
}