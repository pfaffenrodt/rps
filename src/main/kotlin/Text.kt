import kotlinx.coroutines.delay

suspend fun intro() {
    print("Hello ")
    delay(800)
    print("Player")
    delay(800)
    print(" lets play ROCK PAPER SCISSORS!")
    delay(800)
    printHelp()
}

fun printHelp() {
    println(
"""

* Available modes: 
* 1 - simple play
* 2 - play against a rock
* 3 - simulate 100 rounds (rock player)
* exit - exit

Pick mode ?
"""
    )
}