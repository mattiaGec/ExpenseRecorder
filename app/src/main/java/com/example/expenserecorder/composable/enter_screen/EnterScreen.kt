package com.example.expenserecorder.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.expenserecorder.composable.enter_screen.EnterViewModel
import org.koin.androidx.compose.get
import org.koin.androidx.compose.getViewModel

@Composable
fun EnterScreen(
    viewModel: EnterViewModel = get()
) {

    Column(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()
    ) {
        Row(horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()) {
            Button(modifier = Modifier.padding(16.dp) ,onClick = { /*TODO*/ }) {
                Text("Reset")
            }
        }
    }
}