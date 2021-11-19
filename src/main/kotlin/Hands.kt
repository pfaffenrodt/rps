
sealed class Hand(
    /**
     * option used as input argument to pick a hand
     */
    val option: String,

    /**
     * will be used to print
     */
    val label: String,
) {

    object Rock: Hand("1", "rock")
    object Paper: Hand("2","paper")
    object Scissors: Hand("3", "scissors")

    override fun toString(): String {
        return label
    }

    companion object {
        fun fromOption(option: String): Hand? {
            return listOf(Rock, Paper, Scissors)
                .find { it.option == option }
        }

        fun randomHand(): Hand {
            return listOf(Rock, Paper, Scissors)
                .random()
        }
    }
}