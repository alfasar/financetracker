package com.example.financetracker.domain.repository

interface SavingsRepository {

    suspend fun createSavings()

    suspend fun getSavingsById()

    suspend fun getSavings()

    suspend fun updateSavings()

    suspend fun deleteSavings()
}
