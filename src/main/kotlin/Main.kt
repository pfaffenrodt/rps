import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.util.*

suspend fun main() = coroutineScope  {
    launch {
        intro()
    }
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        val next = scanner.next()

        println("Picked mode: $next")

        when (next) {
//            "1" -> simpleGame()
//            "2" -> againstARock()
//            "3" -> simulateGames()
            "exit" -> break
            else -> {
                println("invalid argument: $next")
                printHelp()
            }
        }
    }
    scanner.close()
}