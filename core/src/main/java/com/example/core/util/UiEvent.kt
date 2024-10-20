package com.example.core.util

import com.example.core.navigation.NavigationRoute

sealed class UiEvent {
    data class Navigate(val route : NavigationRoute) : UiEvent()

    object NavigationUp : UiEvent()

    data class ShowSnackBar(val message : UiText) : UiEvent()
}