package com.example.calorietracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.util.navigation.NavigationRoute
import com.example.onboarding_presentation.welcome.WelcomeScreen

@Composable
fun NavGraph() {

    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationRoute.Welcome) {

        composable<NavigationRoute.Welcome> {
            WelcomeScreen(
                onNavigate = {
                    navController.navigate(NavigationRoute.Age)
                }
            )
        }

        composable<NavigationRoute.Age> { }


    }
}