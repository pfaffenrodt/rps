
sealed class Hand(
    val label: String
) {

    object Rock: Hand("rock")
    object Scissors: Hand("scissors")
    object Paper: Hand("paper")

    override fun toString(): String {
        return label
    }
}