package com.example.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calorietracker.ui.theme.CalorieTrackerTheme
import com.example.core_ui.Dimensions
import com.example.core_ui.LocalSpacing
import com.example.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompositionLocalProvider(LocalSpacing provides Dimensions()) {
                CalorieTrackerTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        NavGraph()
                    }
                }
            }
        }
    }
}
