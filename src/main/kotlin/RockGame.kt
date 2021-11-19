import kotlinx.coroutines.delay

suspend fun GameScope.againstARock(): GameResult {
    printLine(HAND_CHOICES.trimIndent())
    val option = readLine() ?: return GameResult.NONE
    val yourHand = Hand.fromOption(option) ?: return GameResult.NONE
    val opponentHand = Hand.Rock
    delay(600)
    printLine("*ROCK*")
    delay(800)
    printLine("*PAPER*")
    delay(800)
    printLine("*SCISSORS*")
    delay(1200)
    printLine("You choosed: ${yourHand.label}")
    printLine("Opponent choosed: ${opponentHand.label}")

    val gameResult = yourHand.play(opponentHand)
    when(gameResult) {
        GameResult.WIN -> printLine("You won")
        GameResult.DRAW -> printLine("Its draw")
        GameResult.LOSE -> printLine("You lost")
        else -> printLine("no one")
    }
    delay(2400)
    return gameResult
}