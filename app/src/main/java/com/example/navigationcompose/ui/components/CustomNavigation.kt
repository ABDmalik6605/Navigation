package com.example.navigationcompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.screens.HomeScreen
import com.example.navigationcompose.ui.screens.LazyScreen
import com.example.navigationcompose.ui.screens.StaggeredScreen
import com.example.navigationcompose.ui.screens.VerticalScreen
import com.example.navigationcompose.ui.theme.NavigationcomposeTheme

@Composable
fun CustomNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable(
            "detailsLazy/{message}",
            arguments = listOf(navArgument("message") { type = NavType.StringType })
        ) { backStackEntry ->
            LazyScreen(
                navController,
                backStackEntry.arguments?.getString("message") ?: ""
            )
        }
        composable(
            "detailsVertical/{message}",
            arguments = listOf(navArgument("message") { type = NavType.StringType })
        ) { backStackEntry ->
            VerticalScreen(
                navController,
                backStackEntry.arguments?.getString("message") ?: ""
            )
        }
        composable(
            "detailsStaggering/{message}",
            arguments = listOf(navArgument("message") { type = NavType.StringType })
        ) { backStackEntry ->
            StaggeredScreen(
                navController,
                backStackEntry.arguments?.getString("message") ?: ""
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewCustomNavigation() {
    NavigationcomposeTheme {
        val navController = rememberNavController()
        CustomNavigation(navController = navController)
    }
}