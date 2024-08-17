package com.example.navigationcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.components.CustomNavigation
import com.example.navigationcompose.ui.components.CustomTextField
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

@Composable
fun MainScreen() {
    MainScreenContent()
}
@Composable
private fun MainScreenContent() {
    var textFieldValue by remember { mutableStateOf("kaboom") }
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ){
        val navController = rememberNavController()
        CustomNavigation(navController = navController,textFieldValue)

        CustomTextField(
            backgroundColor = Color.LightGray,
            text = "",
            placeholder = "Enter text",
            textColor = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth(0.7f),
            alignment = Alignment.CenterHorizontally,
        ) {
            textFieldValue = it
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    NavigationcomposeTheme {
        MainScreen()
    }
}