package com.example.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.calorietracker.ui.theme.CalorieTrackerTheme
import com.example.core_ui.Dimensions
import com.example.core_ui.LocalSpacing
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            CompositionLocalProvider(LocalSpacing provides Dimensions()) {

                CalorieTrackerTheme {

                    val snackBarHostState = remember {
                        SnackbarHostState()
                    }

                    Scaffold(
                        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
                        modifier = Modifier.fillMaxSize()
                    ) { innerPadding ->
                        NavGraph(snackBarHostState)
                    }
                }
            }
        }
    }
}
