package com.example.onboarding_presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.core.R
import com.example.core_ui.LocalSpacing
import com.example.onboarding_presentation.components.ActionButton

@Composable
fun WelcomeScreen(
    onNavigate :() ->Unit
) {

    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.welcome_text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(spacing.spaceMedium))

        ActionButton(
            text = stringResource(id = R.string.next),
            onClick = {
                onNavigate()
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}