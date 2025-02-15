class King : Judge {
    override fun callToWitness(witnessManager: WitnessManager): Witness {
        return witnessManager.callWitnessToStand()
    }

    override fun testify(witness: Witness) {
        witness.speakTruth()
    }
}