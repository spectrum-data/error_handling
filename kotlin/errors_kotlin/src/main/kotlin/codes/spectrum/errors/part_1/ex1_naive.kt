package codes.spectrum.errors.part_1

import java.io.File
import java.nio.CharBuffer
import kotlin.system.exitProcess

/**
 * Наивная реализация `sqr` вообще без какого бы то ни было представления, что могут вообще быть ошибки
 */
fun main(argv: Array<String>) {
    val filename = argv[0];
    val file = File(filename)
    val buffer = CharBuffer.allocate(10)
    file.reader().read(buffer)
    val content = buffer.flip().toString()
    val number = content.toInt()
    println("$number * $number = ${number * number}")
    exitProcess(0)
}