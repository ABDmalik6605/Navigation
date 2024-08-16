package com.example.navigationcompose.ui.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Text(text = "Home Screen", color = Color.White)
            Button(onClick = { navController.navigate("detailsLazy/HelloWorld") }) {
                Text("Lazy column")
            }
        Spacer(modifier = Modifier.height(5.dp))

            Button(onClick = { navController.navigate("detailsVertical/HelloWorld") }) {
                Text("Lazy vertical\ngrid")
            }
        Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { navController.navigate("detailsStaggering/HelloWorld") }) {
                Text("Lazy vertical\nStaggering grid")
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