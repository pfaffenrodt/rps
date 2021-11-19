interface GameScope {
    fun readLine(): String?
    fun printLine(message: String)
    fun print(message: String)
    suspend fun delay(timeMillis: Long)
}

class DefaultGameScope(
): GameScope {
    override fun readLine(): String? {
        return readlnOrNull()
    }

    override fun printLine(message: String) {
        kotlin.io.println(message)
    }

    override fun print(message: String) {
        kotlin.io.print(message)
    }

    override suspend fun delay(timeMillis: Long) {
        kotlinx.coroutines.delay(timeMillis)
    }
}