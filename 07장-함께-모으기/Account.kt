package jiwondev.ilovecompose

class Account {
    val accountNumber: Int = 0 // 계좌번호
    val amount: Long = 0L // 예금액

    // 해지일자를 파라미터로
    fun calculateInterest(cancelDate: Int): Interest {
        val interestRate = InterestRate()
        return interestRate.createInterest()
    }
}