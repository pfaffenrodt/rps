/**
 * a scope that is required to print or read from system
 */
interface GameScope {
    fun readLine(): String?
    fun printLine(message: String)
    fun print(message: String)
    suspend fun delay(timeMillis: Long)
}

/**
 * default scope use standard input output streams
 */
class DefaultGameScope(
): GameScope {
    /**
     * @see kotlin.io.readlnOrNull
     */
    override fun readLine(): String? {
        return readlnOrNull()
    }

    /**
     * @see kotlin.io.println
     */
    override fun printLine(message: String) {
        kotlin.io.println(message)
    }

    /**
     *
     * @see kotlin.io.print
     */
    override fun print(message: String) {
        kotlin.io.print(message)
    }

    /**
     * delay current coroutines by time in millis
     */
    override suspend fun delay(timeMillis: Long) {
        kotlinx.coroutines.delay(timeMillis)
    }
}