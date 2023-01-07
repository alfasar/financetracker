package com.example.financetracker.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.financetracker.data.dao.ExpensesDao
import com.example.financetracker.data.dao.IncomesDao
import com.example.financetracker.data.dao.InvestmentsDao
import com.example.financetracker.data.dao.SavingsDao
import com.example.financetracker.data.entity.ExpensesEntity
import com.example.financetracker.data.entity.IncomesEntity
import com.example.financetracker.data.entity.InvestmentsEntity
import com.example.financetracker.data.entity.SavingsEntity

@Database(
    entities = [
        IncomesEntity::class,
        ExpensesEntity::class,
        InvestmentsEntity::class,
        SavingsEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun incomesDao(): IncomesDao
    abstract fun expensesDao(): ExpensesDao
    abstract fun investmentsDao(): InvestmentsDao
    abstract fun savingsDao(): SavingsDao

}