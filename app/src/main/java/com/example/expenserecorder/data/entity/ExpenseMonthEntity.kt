package com.example.expenserecorder.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExpenseMonthEntity (
    @PrimaryKey
    val id: Int
)