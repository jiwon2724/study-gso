fun main() {
    startJudgement()
}

private fun startJudgement() {
    val king: Judge = King()
    val rabbit: WitnessManager = Rabbit()

    val enteredWitness = king.callWitness(witnessManager = rabbit)
    king.testify(enteredWitness)
}

