package com.example.expenserecorder.di

import androidx.room.Room
import com.example.expenserecorder.composable.enter_screen.EnterViewModel
import com.example.expenserecorder.data.room.Database
import com.example.expenserecorder.repository.DBRepository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

   single {
      DBRepository(get())
   }

   single {
      val dbBuilder = Room.databaseBuilder(
         androidContext().applicationContext,
         Database::class.java,
         Database.DB_NAME
      ).createFromAsset(Database.DB_NAME)

      dbBuilder.addMigrations(Database.MIGRATION_0_1)

      dbBuilder.build()
   }

   viewModel {
      EnterViewModel(get())
   }
}
