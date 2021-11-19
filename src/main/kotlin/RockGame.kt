suspend fun GameScope.againstARock(): GameResult {
    printLine(HAND_CHOICES.trimIndent())
    val option = readLine() ?: return GameResult.NONE
    val yourHand = Hand.fromOption(option) ?: return GameResult.NONE
    val opponentHand = Hand.Rock

    return play(yourHand, opponentHand)
}