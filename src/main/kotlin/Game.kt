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