package p21tcq

import java.io.Closeable

internal object ErrorClose: Closeable {
    override fun close() {
        error("on close")
    }
}
private fun userfun2(): String{
    ErrorClose.use {
        error("body")
    }
}
fun main() {
    try{
        userfun2()
    }catch (e: Throwable){
        println(e.message)
    }
}
// Что будет распечатано?
// 1. завалится
// 2. body; body
// 3. on close; on close
// 4. on close; body
// 5. body; on close