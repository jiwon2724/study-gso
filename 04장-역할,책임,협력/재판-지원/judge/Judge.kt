interface Judge {
    fun callWitness(witnessManager: WitnessManager): Witness
    fun testify(witness: Witness)
}