class Cook(
    override var isTestified: Boolean = false,
    override var isEntered: Boolean = false
) : Witness() {
    override fun enter() {
        println("요리사 입장완료")
        isEntered = true
    }

    override fun speakTruth() {
        println("요리사 증언완료")
        isTestified = true
    }

    fun cook() {
        println("요리하기")
    }
}