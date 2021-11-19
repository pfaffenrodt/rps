import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.TestCoroutineScope
import kotlinx.coroutines.test.runBlockingTest
import kotlin.test.Test

class RockGameTest {

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun it_can_play_a_rock_game() {
        runBlockingTest {
            TestGameScope(mutableListOf(Hand.Rock.option)).apply {
                againstARock()
                assertSequence(listOf(
                    expectedPrintLine(HAND_CHOICES.trimIndent()),
                    expectedReadLine(Hand.Rock.option),
                        expectedPrintLine("*ROCK*"),
                        expectedPrintLine("*PAPER*"),
                        expectedPrintLine("*SCISSORS*"),
                        expectedPrintLine("You choosed: rock"),
                        expectedPrintLine("Opponent choosed: rock"),
                        expectedPrintLine("Its draw"),
                ))
            }
        }
    }
}