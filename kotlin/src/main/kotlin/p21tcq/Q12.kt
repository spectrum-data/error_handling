package p21tcq

import kotlin.concurrent.thread

private fun userfun(): String {
    var result : String? = null
    val t = thread {
        result = "hello1"
        error("body")
    }
    t.join()
    return result ?: "world"
}

fun main() {
    try{
        println(userfun())
    }catch (e: Throwable){
        println(e.message)
    }
}
// Что будет распечатано?
// 1. body
// 2. hello1
// 3. world
// 4. null