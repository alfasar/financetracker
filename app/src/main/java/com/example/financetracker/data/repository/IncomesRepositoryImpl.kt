package com.example.financetracker.data.repository

import com.example.financetracker.data.AppDatabase
import com.example.financetracker.domain.repository.IncomesRepository
import javax.inject.Inject

class IncomesRepositoryImpl @Inject constructor(
    private val db: AppDatabase
) : IncomesRepository {

    override suspend fun createIncome() {
        db.incomesDao().addIncome()
    }

    override suspend fun getIncomeById(incomeId: Int) {
        db.incomesDao().getIncomeById(incomeId)
    }

    override suspend fun getIncomes() {
        db.incomesDao().getAllIncomes()
    }

    override suspend fun updateIncome(incomeId: Int) {
        db.incomesDao().updateIncomeById(incomeId)
    }

    override suspend fun deleteIncome(incomeId: Int) {
        db.incomesDao().deleteIncomeById(incomeId)
    }
}
