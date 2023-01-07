package com.example.financetracker.domain.repository

interface ExpensesRepository {

    suspend fun createExpenses()

    suspend fun getExpensesById()

    suspend fun getExpenses()

    suspend fun updateExpenses()

    suspend fun deleteExpenses()
}
