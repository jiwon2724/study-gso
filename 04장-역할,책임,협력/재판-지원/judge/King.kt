class King : Judge {
    override fun callWitness(witnessManager: WitnessManager): Witness {
        return witnessManager.callWitnessToStand()
    }

    override fun testify(witness: Witness) {
        witness.speakTruth()
    }
}