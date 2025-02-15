interface Judge {
    fun callToWitness(witnessManager: WitnessManager): Witness
    fun testify(witness: Witness)
}