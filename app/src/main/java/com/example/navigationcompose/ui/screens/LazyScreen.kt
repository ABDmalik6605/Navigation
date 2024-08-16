package com.example.navigationcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigationcompose.ui.components.CustomText

@Composable
fun LazyScreen(navController: NavHostController, message: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ) {
        CustomText(
            backgroundColor = Color.White,
            text = "Lazy Column Screen",
            textColor = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
        CustomText(
            backgroundColor = Color.DarkGray,
            text = "Message: $message",
            textColor = Color.White,
            fontSize = 15.sp,
            modifier = Modifier.padding(5.dp)
        )
        Button(onClick = { navController.navigateUp() }) {
            Text("Go Back")
        }
        Spacer(modifier = Modifier.height(40.dp))

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            items(25) { index ->
                CustomText(
                    backgroundColor = Color.Magenta,
                    text = "Item ${index + 1}",
                    textColor = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(vertical = 34.dp).fillMaxWidth()
                )
            }
        }
    }
}
