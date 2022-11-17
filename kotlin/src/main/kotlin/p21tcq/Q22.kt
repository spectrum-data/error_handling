package p21tcq

import kotlin.Exception

fun main() {
    try{
        throw Exception()
    }catch (e: Throwable){
        println(e.stackTrace[0].methodName)
        println(e.stackTrace[1].methodName)
    }
}
//  Будет ли стек? Что напечатает
// 1. main, <clinit>
// 2. main, завал
// 3. main, что-то еще
