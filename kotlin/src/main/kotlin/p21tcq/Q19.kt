package p21tcq



fun main() {
    try{
        throw MyOnlyMessageError("hello")
    }catch (e: Throwable){
        println(e.stackTrace[0].methodName)
    }


}
//  Будет ли стек? Что напечатает
// 1. main
// 2. ошибка

