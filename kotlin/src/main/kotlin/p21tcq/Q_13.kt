package p21tcq

import kotlin.concurrent.thread as ktthread

fun thread(unwindExceptions: Boolean, body:()->Unit) : Thread {
    if(unwindExceptions) {
        // все просто сделаем в нашем потоке хук
        val exceptionHook: (Thread, Throwable) -> Unit = { t, error ->
            throw error
        }
        val thread = ktthread(start = false) {
            body()
        }
        // все ставим хук из нашего потока сюда и мы поймаем все исключения
        thread.setUncaughtExceptionHandler(exceptionHook)
        thread.start()
        return thread
    }else{
        return ktthread(start = true) {
            body()
        }
    }
}