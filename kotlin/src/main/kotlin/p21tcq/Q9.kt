package p21tcq

import java.io.Closeable

private fun userfun(): String {
    try {
        try {
            error("body")
        } finally {
            return "inner"
        }
    }finally {
        return "outer"
    }
}

fun main() {
    println(userfun())
}
// Что будет распечатано?
// 1. завалится
// 2. inner
// 3. outer