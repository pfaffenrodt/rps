import java.util.*

fun printHelp() {
    println(
"""
#### ROCK PAPER SCISSORS ####

* modes: 
* 1 - simple play
* 2 - play against a rock
* 3 - simulate 100 rounds
* exit - exit

Pick mode ? (1)
"""
    )
}

fun main(args: Array<String>) {
    printHelp()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()

        println("Picked mode: $next")

        if (next == "exit") {
            break
        } else {
            // next round
            printHelp()
        }
    }
    scanner.close()
}