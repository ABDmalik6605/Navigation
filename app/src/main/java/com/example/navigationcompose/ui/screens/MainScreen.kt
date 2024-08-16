package com.example.navigationcompose.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.components.CustomNavigation
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Color.Black)
            .padding(top = 20.dp)
    ){
        val navController = rememberNavController()
        CustomNavigation(navController = navController)
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    NavigationcomposeTheme {
        MainScreen()
    }
}