package com.example.navigationcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.components.CustomText
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

@Composable
fun VerticalScreen(navController: NavHostController, message: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ){
        CustomText(
            backgroundColor = Color.White,
            text = "Vertical Grid Screen",
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
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items(100) { index ->
                CustomText(
                    backgroundColor = Color.DarkGray,
                    text = "Grid Item ${index + 1}",
                    textColor = Color.White,
                    fontSize = 19.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}
@Preview
@Composable
fun PreviewVerticalScreen() {
    NavigationcomposeTheme {
        val navController = rememberNavController() // Create a fake NavHostController
        VerticalScreen(
            navController = navController,
            message = "Sample Message" // Pass a sample message
        )
    }
}