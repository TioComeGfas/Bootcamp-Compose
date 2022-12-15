package com.fif.tech.android.composetest.screen

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator(navController: NavHostController, onUpdateButton: (Boolean) -> Unit) {
    NavHost(
        navController = navController,
        startDestination = ScreensExperience.HomeScreen.route
    ) {
        composable(
            route = ScreensExperience.HomeScreen.route
        ) {
            HomeScreen(navController = navController)
            onUpdateButton(false)
        }
        composable(
            route = ScreensExperience.DetailsScreen.route + "/{image}/{title}/{subtitle}",
            arguments = listOf(
                navArgument(name = "image") {
                    type = NavType.IntType
                    defaultValue = com.fif.tech.android.composetest.R.drawable.user
                    nullable = false
                },
                navArgument(name = "title") {
                    type = NavType.StringType
                    defaultValue = "Non title"
                    nullable = false
                },
                navArgument(name = "subtitle") {
                    type = NavType.StringType
                    defaultValue = "Non subtitle"
                    nullable = false
                }
            )
        ) { entry ->
            DetailScreen(
                navController = navController,
                drawable = entry.arguments?.getInt("image") ?: 0,
                title = entry.arguments?.getString("title") ?: "",
                subtitle = entry.arguments?.getString("subtitle") ?: ""
            )
            onUpdateButton(true)
        }
    }
}

sealed class ScreensExperience(val name: String, val route: String) {
    object HomeScreen: ScreensExperience("home", "home")
    object DetailsScreen: ScreensExperience("details", "details")

    fun addArguments(vararg args: String): String {
        return buildString {
            append(route)
            args.iterator().forEach { arg ->
                append("/$arg")
            }
        }
    }
}