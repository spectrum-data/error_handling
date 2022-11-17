package p21tcq

import kotlin.system.exitProcess

private fun userfun(): String {
    var wasCatch: Boolean = false
    try {
        error("it's error")
    } catch (e: Throwable) {
        wasCatch = true
        return "catch"
    } finally {
        if (!wasCatch) {
            exitProcess(-1)
        }
    }
    return "aftertry"
}

fun main() {
    val result = userfun()
    println(result)
}

// Что будет распечатано?
// 1. after try
// 3. catch
// 4. ничего, завалится