package com.example.financetracker.domain.repository

interface InvestmentRepository {

    suspend fun createInvestment()

    suspend fun getInvestmentById()

    suspend fun getInvestment()

    suspend fun updateInvestment()

    suspend fun deleteInvestment()
}
