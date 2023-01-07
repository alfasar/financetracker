package com.example.financetracker.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "investments")
data class InvestmentsEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val group: String, // todo enum
    val monthlyAmount: Float,
    val weeklyAmount: Float,
    val dailyAmount: Float,
)
