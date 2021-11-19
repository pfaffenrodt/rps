val winnerMap = mapOf(
    Hand.Rock to Hand.Scissors,
    Hand.Scissors to Hand.Paper,
    Hand.Paper to Hand.Rock,
)
/**
 * will play rock paper scissors against opponentHand
 *
 * @return true if hand wins
 */
fun Hand.play(opponentHand: Hand): GameResult = when (opponentHand) {
    this -> GameResult.DRAW
    winnerMap[this] -> GameResult.WIN
    else -> GameResult.LOSE
}

suspend fun GameScope.play(yourHand: Hand, opponentHand: Hand): GameResult {
    delay(600)
    printLine("*ROCK*")
    delay(800)
    printLine("*PAPER*")
    delay(800)
    printLine("*SCISSORS*")
    delay(1200)
    printLine("You choosed: $yourHand")
    printLine("Opponent choosed: $opponentHand")

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