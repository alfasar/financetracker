package com.example.financetracker.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "savings")
data class SavingsEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val group: String, // todo enum
    val monthlyAmount: Float,
    val weeklyAmount: Float,
    val dailyAmount: Float,
)
