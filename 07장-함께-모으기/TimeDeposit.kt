package jiwondev.ilovecompose

import java.util.Date

class TimeDeposit {
    private val duration: Int = 0 // 예금 기간
    private val closed: Int = 0 // 예금 만기 날짜?

    // 해지일자를 파라미터로
    fun calculateInterest(cancelDate: Int) {
        checkDate()
        val account: Account = Account()
        account.calculateInterest(cancelDate)
    }

    private fun checkDate(): Date {
        return Date()
    }
}