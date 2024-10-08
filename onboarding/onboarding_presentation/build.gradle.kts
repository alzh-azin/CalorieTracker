plugins {

    alias(libs.plugins.calorietracker.android.library.ui)
}

android {
    namespace = "com.example.onboarding_presentation"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(projects.core)
    implementation(projects.coreUi)
    implementation(projects.onboarding.onboardingDomain)
}