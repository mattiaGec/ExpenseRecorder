package com.example.expenserecorder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.expenserecorder.composable.EnterScreen
import com.example.expenserecorder.di.appModule
import com.example.expenserecorder.ui.theme.ExpenseRecorderTheme
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init koin
        startKoin {
            androidContext(this@MainActivity)
            // use Koin logger
            printLogger()
            // declare modules
            modules(appModule)
        }
        //start first page
        setContent {
            EnterScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   EnterScreen()
}