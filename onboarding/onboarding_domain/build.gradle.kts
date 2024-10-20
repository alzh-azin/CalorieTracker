plugins {
    alias(libs.plugins.calorietracker.android.library)
    alias(libs.plugins.calorietracker.android.hilt)
}

android {
    namespace = "com.example.onboarding_domain"
}

dependencies {
    implementation(projects.core)
}