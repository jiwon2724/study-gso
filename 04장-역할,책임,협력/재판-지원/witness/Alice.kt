class Alice(
    override var isTestified: Boolean = false,
    override var isEntered: Boolean = false
) : Witness() {
    override fun enter() {
        println("엘리스 입장완료")
        isEntered = true
    }

    override fun speakTruth() {
        println("엘리스 증언완료")
        isTestified = true
    }
}