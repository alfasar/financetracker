package com.example.financetracker.data.repository

import com.example.financetracker.data.AppDatabase
import com.example.financetracker.domain.repository.SavingsRepository
import javax.inject.Inject

class SavingsRepositoryImpl @Inject constructor(
    private val db: AppDatabase
) : SavingsRepository {

    override suspend fun createSavings() {
        TODO("Not yet implemented")
    }

    override suspend fun getSavingsById() {
        TODO("Not yet implemented")
    }

    override suspend fun getSavings() {
        TODO("Not yet implemented")
    }

    override suspend fun updateSavings() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteSavings() {
        TODO("Not yet implemented")
    }
}
