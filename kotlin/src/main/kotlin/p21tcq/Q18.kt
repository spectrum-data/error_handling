package p21tcq

class MyOnlyMessageError(message: String) : Throwable(
    message, null, false, false
)

fun main() {
    val e = MyOnlyMessageError("hello")
    println(e.stackTrace[0].methodName)
}
//  Будет ли стек? Что напечатает
// 1. main
// 2. ошибка

