package com.example.expenserecorder.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.expenserecorder.data.dao.ExpenseDao
import com.example.expenserecorder.data.dao.ExpenseMonthDao
import com.example.expenserecorder.data.entity.ExpenseEntity
import com.example.expenserecorder.data.entity.ExpenseMonthEntity

@Database(
    entities = [ExpenseEntity::class, ExpenseMonthEntity::class],
    version = 1,
    exportSchema = true
)
abstract class Database: RoomDatabase() {
    companion object{
        const val DB_NAME = "ExpenseRecorderDb.db"

        @JvmField
        val MIGRATION_0_1: Migration = object : Migration(0, 1) {
            override fun migrate(database: SupportSQLiteDatabase) {
                //technical migration
            }
        }
    }

    abstract fun expenseMonthDao(): ExpenseMonthDao
    abstract fun expenseDao(): ExpenseDao
}