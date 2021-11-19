import kotlinx.coroutines.delay

suspend fun simulateGames() {
    var winCount = 0
    var loseCount = 0
    var drawCount = 0
    (1..100).onEach {
        SimulatedGameScope().apply {
            when(againstARock()) {
                GameResult.WIN -> winCount++
                GameResult.LOSE -> loseCount++
                GameResult.DRAW -> drawCount++
            }
        }
    }
    println("simulated 100 games against rock")
    println("win: $winCount \t lost: $loseCount \t draw: $drawCount")
    delay(3000)
}

/**
 * simulated scope were output is ignored and read is hardcoded by random hand
 */
class SimulatedGameScope: GameScope {
    override fun readLine(): String? {
        return Hand.randomHand().option
    }

    override fun printLine(message: String) {}

    override fun print(message: String) {}

    override suspend fun delay(timeMillis: Long) {}
}