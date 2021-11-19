import kotlin.test.Test
import kotlin.test.assertEquals

class PlayTest {
    @Test
    fun it_determines_winner() {
        assertEquals(GameResult.WIN, Hand.Rock.play(Hand.Scissors), "rock should wins against scissors")
        assertEquals(GameResult.WIN, Hand.Scissors.play(Hand.Paper), "scissors should wins against paper")
        assertEquals(GameResult.WIN, Hand.Paper.play(Hand.Rock), "paper should wins against rock")
    }

    @Test
    fun it_determines_looser() {
        assertEquals(GameResult.LOSE, Hand.Scissors.play(Hand.Rock), "scissors should lose against rock")
        assertEquals(GameResult.LOSE, Hand.Rock.play(Hand.Paper), "rock should lose against paper")
        assertEquals(GameResult.LOSE, Hand.Paper.play(Hand.Scissors), "paper should lose against scissors")
    }

    @Test
    fun it_determines_draw_games() {
        assertEquals(GameResult.DRAW, Hand.Scissors.play(Hand.Scissors), "should be draw")
        assertEquals(GameResult.DRAW, Hand.Rock.play(Hand.Rock), "should be draw")
        assertEquals(GameResult.DRAW, Hand.Paper.play(Hand.Paper), "should be draw")
    }

}