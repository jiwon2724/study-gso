class Rabbit : WitnessManager {
    private val witnesses: ArrayList<Witness> = arrayListOf(
        Hatter(),
        Cook(),
        Alice()
    )

    override fun callWitnessToStand(): Witness {
        var witnessOrder: Int = 0
        for ((index, witness) in witnesses.withIndex()) {
            if (!witness.isEntered) {
                witness.enter()
                witnessOrder = index
                break
            }
        }
        return witnesses[witnessOrder]
    }
}