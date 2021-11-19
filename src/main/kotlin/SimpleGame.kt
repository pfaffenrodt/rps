suspend fun GameScope.simpleGame(): GameResult {
    printLine(HAND_CHOICES.trimIndent())
    val option = readLine() ?: return GameResult.NONE
    val yourHand = Hand.fromOption(option) ?: return GameResult.NONE
    val opponentHand = Hand.randomHand()
    return play(yourHand, opponentHand)
}