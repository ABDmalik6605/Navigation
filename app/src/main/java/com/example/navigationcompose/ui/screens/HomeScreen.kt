package com.example.navigationcompose.ui.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Text(text = "Home Screen")
            Button(onClick = { navController.navigate("detailsLazy/HelloWorld") }) {
                Text("Lazy column")
            }
            Button(onClick = { navController.navigate("detailsVertical/HelloWorld") }) {
                Text("Lazy vertical grid")
            }
            Button(onClick = { navController.navigate("detailsStaggering/HelloWorld") }) {
                Text("Lazy vertical Staggering grid")
            }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    NavigationcomposeTheme {
        MainScreen()
    }
}