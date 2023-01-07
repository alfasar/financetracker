package com.example.financetracker.di

import com.example.financetracker.data.AppDatabase
import com.example.financetracker.data.repository.ExpensesRepositoryImpl
import com.example.financetracker.data.repository.IncomesRepositoryImpl
import com.example.financetracker.data.repository.InvestmentRepositoryImpl
import com.example.financetracker.data.repository.SavingsRepositoryImpl
import com.example.financetracker.domain.repository.ExpensesRepository
import com.example.financetracker.domain.repository.IncomesRepository
import com.example.financetracker.domain.repository.InvestmentRepository
import com.example.financetracker.domain.repository.SavingsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideIncomesRepository(appDatabase: AppDatabase): IncomesRepository =
        IncomesRepositoryImpl(appDatabase)

    @Provides
    @Singleton
    fun provideExpensesRepository(appDatabase: AppDatabase): ExpensesRepository =
        ExpensesRepositoryImpl(appDatabase)

    @Provides
    @Singleton
    fun provideInvestmentsRepository(appDatabase: AppDatabase): InvestmentRepository =
        InvestmentRepositoryImpl(appDatabase)

    @Provides
    @Singleton
    fun provideSavingsRepository(appDatabase: AppDatabase): SavingsRepository =
        SavingsRepositoryImpl(appDatabase)

}