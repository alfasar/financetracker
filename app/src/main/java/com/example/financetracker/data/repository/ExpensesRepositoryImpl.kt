package com.example.financetracker.data.repository

import com.example.financetracker.data.AppDatabase
import com.example.financetracker.domain.repository.ExpensesRepository
import javax.inject.Inject

class ExpensesRepositoryImpl @Inject constructor(
    private val db: AppDatabase
) : ExpensesRepository {

    override suspend fun createExpenses() {
        TODO("Not yet implemented")
    }

    override suspend fun getExpensesById() {
        TODO("Not yet implemented")
    }

    override suspend fun getExpenses() {
        TODO("Not yet implemented")
    }

    override suspend fun updateExpenses() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteExpenses() {
        TODO("Not yet implemented")
    }
}
