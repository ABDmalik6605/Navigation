package com.example.navigationcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
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
fun StaggeredScreen(navController: NavHostController, message: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ) {
        CustomText(
            backgroundColor = Color.White,
            text = "Vertical Staggered Grid Screen",
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

        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {
            items(36) { index ->
                CustomText(
                    backgroundColor = when (index) {
                        0 -> Color.Red
                        1 -> Color.Green
                        2 -> Color.Blue
                        3 -> Color.Black
                        4 -> Color.Gray
                        5 -> Color.Magenta
                        else -> Color.LightGray
                    },
                    text = "Staggered Item ${index + 1}",
                    textColor = Color.White,
                    fontSize = when (index) {
                        0 -> 20.sp
                        1 -> 16.sp
                        2 -> 18.sp
                        3 -> 22.sp
                        4 -> 14.sp
                        5 -> 24.sp
                        else -> 16.sp
                    },
                    modifier = Modifier
                        .padding(4.dp)
                        .height(when (index) {
                            0 -> 100.dp
                            1 -> 120.dp
                            2 -> 80.dp
                            3 -> 150.dp
                            4 -> 90.dp
                            5 -> 130.dp
                            else -> 100.dp
                        })
                )
            }
        }
    }
}
