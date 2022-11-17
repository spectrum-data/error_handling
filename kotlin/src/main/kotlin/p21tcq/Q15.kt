package p21tcq

fun main() {
    try{
       error("1")
    }catch (e: Throwable) {
       println( e.stackTrace[0].methodName )
    }
    val e = Exception("1")
    println( e.stackTrace[0].methodName )
}
// Что будет распечатано?
// 1. main, main
// 2. что-то другое, что-то другое
// 3. завалится еще на 7, так нельзя
// 4. main и завалится на 9
// 5. main и завалится на 10
