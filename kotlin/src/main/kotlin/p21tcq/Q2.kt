package p21tcq

private fun userfun(): List<String> {
    val calls = mutableListOf<String>()
    try {
        error("it's error")
    } catch (e: Throwable) {
        calls.add("catch")
    } finally {
        calls.add("finally")
    }
    return calls
}

fun main() {
    val result = userfun()
    println(result.joinToString())
}

// Что будет распечатано?
// 1. ничего, завалится
// 2. catch, finally
// 3. finally
// 4. finally, catch