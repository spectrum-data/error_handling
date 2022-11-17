package p21tcq

fun main() {
    println(Thread.currentThread().stackTrace[0].methodName)
    println(Thread.currentThread().stackTrace[1].methodName)
}
// Что будет распечатано?
// 1. main, null
// 2. main, завал
// 3. что-то другое, main
// 4. main, что-то другое
