import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope  {
    launch {
        intro()

        do {
            val next = readLine()
            if (next != null) {
                println("Picked mode: $next")
            }
            when(next) {
//            "1" -> simpleGame()
//            "2" -> againstARock()
//            "3" -> simulateGames()
                null, "exit" -> return@launch
                else -> {
                    println("invalid argument: $next")
                    printHelp()
                }
            }
        } while (true)
    }
    println()
}