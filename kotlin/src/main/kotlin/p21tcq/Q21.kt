package p21tcq


import kotlin.Exception

val e = Exception()

fun main() {
    try{
        throw e
    }catch (e: Throwable){
        println(e.stackTrace[0].methodName)
    }


}
//  Будет ли стек? Что напечатает
// 1. main  - это обычное исключение, при throw определится
// 2. завал - на момент создания нет трейса
// 3. main - так-то трейс фиксировался при создании, но main - это точка входа и при компиляции инициализац
// ция была помещена туда
// 4. null
// 5. что-то еще

