package com.example.financetracker.domain.repository

interface IncomesRepository {

    suspend fun createIncome()

    suspend fun getIncomeById(incomeId: Int)

    suspend fun getIncomes()

    suspend fun updateIncome(incomeId: Int)

    suspend fun deleteIncome(incomeId: Int)
}
