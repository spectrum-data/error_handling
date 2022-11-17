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
        println(e.message)
    }
}

// Что будет распечатано?
// 1. body
// 2. catch
// 3. finally