import kotlin.test.assertEquals

class TestGameScope(
    val readLines: MutableList<String> = mutableListOf()
): GameScope {

    val actualSequence: MutableList<String> = mutableListOf()

    override fun readLine(): String? {
        val value = readLines.removeFirstOrNull()
        actualSequence.add(expectedReadLine(value))
        return value
    }

    override fun printLine(message: String) {
        actualSequence.add(expectedPrintLine(message))
    }

    override fun print(message: String) {
        actualSequence.add(expectedPrint(message))
    }

    fun expectedReadLine(value: String?) = "readLine:$value"
    fun expectedPrintLine(message: String) = "printLine:$message"
    fun expectedPrint(message: String) = "print:$message"

    fun assertSequence(expectedSequence: List<String>) {
        expectedSequence.forEachIndexed { index, expected ->
            val actual = actualSequence.getOrNull(index) ?: "NO VALUE"
            assertEquals(expected, actual, "unexpected game sequence")
        }
    }
}