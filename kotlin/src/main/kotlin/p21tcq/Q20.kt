package p21tcq

class SpecialTracedException: Throwable("",null, false, true) {
    init {
        this.stackTrace = arrayOf(
            StackTraceElement("hello","world","and",1)
        )
    }
}

fun main() {
    try{
        throw SpecialTracedException()
    }catch (e: Throwable){
        println(e.stackTrace[0].methodName)
    }


}
//  Будет ли стек? Что напечатает
// 1. не закомпилится
// 2. не создастся, завалит другую ошибку
// 3. main - так как writeableStackTrace
// 4. world

