package p21tcq

private fun errorer() {
    throw AssertionError("fail")
}

fun main() {
    try{
        errorer()
        println("no error")
    }catch (e: Exception){
        println("catched")
        throw e
    }
    println("at the end")
}

// Что будет распечатано
// 1. no error; at the end
// 2. catched; at the end
// 3. ничего
// 4. catched