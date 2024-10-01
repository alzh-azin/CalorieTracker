package com.example.core.util.navigation

import kotlinx.serialization.Serializable

sealed class NavigationRoute {
    @Serializable
    data object Welcome : NavigationRoute()

    @Serializable
    data object Age : NavigationRoute()

    @Serializable
    data object Gender : NavigationRoute()

    @Serializable
    data object Height : NavigationRoute()

    @Serializable
    data object Weight : NavigationRoute()

    @Serializable
    data object NutrientGoal : NavigationRoute()

    @Serializable
    data object TrackerOverview : NavigationRoute()

    @Serializable
    data object Search : NavigationRoute()
}