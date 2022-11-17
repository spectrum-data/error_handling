package p21tcq

import kotlin.concurrent.thread

private fun userfun(): String {
    var exception: Throwable? = null
    var result: String? = null
    val t = thread {
        try{
            error("body")
        }catch (e: Throwable){
            exception = e
            result = "hello1"
        }
    }
    t.join()
    if(exception != null) {
        throw exception!!
    }
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
