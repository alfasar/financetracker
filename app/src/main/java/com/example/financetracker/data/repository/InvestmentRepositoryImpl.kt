package com.example.financetracker.data.repository

import com.example.financetracker.data.AppDatabase
import com.example.financetracker.domain.repository.InvestmentRepository
import javax.inject.Inject

class InvestmentRepositoryImpl @Inject constructor(
    private val db: AppDatabase
) : InvestmentRepository {

    override suspend fun createInvestment() {
        TODO("Not yet implemented")
    }

    override suspend fun getInvestmentById() {
        TODO("Not yet implemented")
    }

    override suspend fun getInvestment() {
        TODO("Not yet implemented")
    }

    override suspend fun updateInvestment() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteInvestment() {
        TODO("Not yet implemented")
    }
}
