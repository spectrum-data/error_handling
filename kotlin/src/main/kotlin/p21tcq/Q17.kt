package p21tcq

import kotlin.concurrent.thread

val locker = Object()
fun call() {
    locker.notifyAll()
    locker.wait()
}

fun main() {
    synchronized(locker) {
        val t = thread {
            synchronized(locker) {
                call()
            }
        }
        locker.notify()
        locker.wait()
        println(t.stackTrace[2].methodName)
        locker.notifyAll()
    }
}
// Смогу ли я добраться до t и распечатать call?, 2 - ну выглядит так что 2 wait и call потом  в стеке
// 1. вообще не сработает, дедлок
// 2. выдаст запрет на доступ к стеку другого потока
// 3. да, выдаст `call`
// 4. да, выдаст, но точно зависнет из-за смешения стеков

