package p21tcq

private fun userfun(): String {
    try {
        try {
            error("body")
        } finally {
            return "inner"
        }
    }finally {
    }
    return "body"
}

fun main() {
    println(userfun())
}
// Что будет распечатано?
// 1. завалится
// 2. inner
// 3. body
// 4. subbody