package p21tcq


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
        println(e.suppressed[0].message)
    }
}
// Что будет распечатано?
// 1. body; on close
// 2. body; завал