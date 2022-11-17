package p21tcq

private fun userfun(): String {
    try {
        error("body")
    } catch (e: Throwable) {
        error("catch")
    } finally {
        error("finally")
    }
}

fun main() {
    try{
        userfun()
    }catch (e: Throwable){
        println(e.suppressed[0].message)
    }
}

// Что будет распечатано?
// 1. завалится
// 2. catch
// 3. body