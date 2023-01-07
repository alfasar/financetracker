package com.example.financetracker.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.financetracker.data.entity.IncomesEntity
import javax.inject.Inject

@Dao
interface IncomesDao {

    @Query("SELECT * FROM incomes")
    suspend fun getAllIncomes(): List<IncomesEntity>

    @Query("SELECT * FROM incomes WHERE id = :id")
    suspend fun getIncomeById(id: Int): IncomesEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addIncome()

    suspend fun updateIncomeById(id: Int)

    @Query("DELETE FROM incomes WHERE id = :id")
    suspend fun deleteIncomeById(id: Int)

    @Query("DELETE FROM incomes")
    suspend fun clearIncomes()

}