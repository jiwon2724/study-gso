class Hatter(
    override var isTestified: Boolean = false,
    override var isEntered: Boolean = false
) : Witness() {
    override fun enter() {
        println("모자장수 입장완료")
        isEntered = true
    }

    override fun speakTruth() {
        println("모자장수 증언완료")
        isTestified = true
    }

    fun sellHat() {
        println("모자팔기")
    }
}