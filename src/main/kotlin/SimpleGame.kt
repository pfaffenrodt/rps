import kotlinx.coroutines.delay


suspend fun GameScope.simpleGame() {
    printLine(HAND_CHOICES.trimIndent())
    val option = readLine() ?: return
    val yourHand = Hand.fromOption(option) ?: return
    val opponentHand = Hand.randomHand()
    delay(600)
    printLine("*ROCK*")
    delay(800)
    printLine("*PAPER*")
    delay(800)
    printLine("*SCISSORS*")
    delay(1200)
    printLine("You choosed: ${yourHand.label}")
    printLine("Opponent choosed: ${opponentHand.label}")

    when(yourHand.play(opponentHand)) {
        GameResult.WIN -> printLine("You won")
        GameResult.DRAW -> printLine("Its draw")
        GameResult.LOSE -> printLine("You lost")
    }
    delay(2400)
}