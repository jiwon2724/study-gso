abstract class Witness {
    abstract var isTestified: Boolean
        protected set

    abstract var isEntered: Boolean
        protected set

    abstract fun enter()
    abstract fun speakTruth()
}