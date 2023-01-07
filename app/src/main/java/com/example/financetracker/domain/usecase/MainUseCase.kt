package com.example.financetracker.domain.usecase

import com.example.financetracker.domain.model.UserPlan
import com.example.financetracker.domain.repository.ExpensesRepository
import com.example.financetracker.domain.repository.IncomesRepository
import com.example.financetracker.domain.repository.InvestmentRepository
import com.example.financetracker.domain.repository.SavingsRepository
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val incomesRepository: IncomesRepository,
    private val expensesRepository: ExpensesRepository,
    private val investmentRepository: InvestmentRepository,
    private val savingsRepository: SavingsRepository
) {

    suspend fun getUserPlan(): UserPlan =
        UserPlan(
            income = 0F
        )

}
