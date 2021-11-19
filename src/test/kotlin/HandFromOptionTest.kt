import kotlin.test.Test
import kotlin.test.assertEquals

class HandFromOptionTest {

    @Test
    fun it_provide_rock() {
        assertEquals(Hand.Rock, Hand.fromOption("1"))
    }

    @Test
    fun it_provide_paper() {
        assertEquals(Hand.Paper, Hand.fromOption("2"))
    }

    @Test
    fun it_provide_scissors() {
        assertEquals(Hand.Scissors, Hand.fromOption("3"))
    }
}