package com.example.calorietracker

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigation.NavigationRoute
import com.example.onboarding_presentation.activity.ActivityScreen
import com.example.onboarding_presentation.age.AgeScreen
import com.example.onboarding_presentation.gender.GenderScreen
import com.example.onboarding_presentation.goal.GoalScreen
import com.example.onboarding_presentation.height.HeightScreen
import com.example.onboarding_presentation.nutrientGoal.NutrientGoalScreen
import com.example.onboarding_presentation.weight.WeightScreen
import com.example.onboarding_presentation.welcome.WelcomeScreen

@Composable
fun NavGraph(snackBarHostState: SnackbarHostState) {

    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationRoute.Welcome) {

        composable<NavigationRoute.Welcome> {
            WelcomeScreen(
                onNavigate = {
                    navController.navigate(NavigationRoute.Gender)
                }
            )
        }

        composable<NavigationRoute.Age> {
            AgeScreen(
                snackBarHostState = snackBarHostState,
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.Gender> {
            GenderScreen(
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.Height> {
            HeightScreen(
                snackBarHostState = snackBarHostState,
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.Weight> {
            WeightScreen(
                snackBarHostState = snackBarHostState,
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.Activity> {
            ActivityScreen(
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.Goal> {
            GoalScreen(
                onNavigate = {
                    navController.navigate(it)
                })
        }

        composable<NavigationRoute.NutrientGoal> {
            NutrientGoalScreen(
                snackBarHostState = snackBarHostState,
                onNavigate = {
                    navController.navigate(it)
                })
        }
    }
}