plugins {

    alias(libs.plugins.calorietracker.android.application.ui)

}

android {
    namespace = "com.example.calorietracker"
}

dependencies {

    //TODO must be moved into test convention plugin
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(projects.core)
    implementation(projects.onboarding.onboardingPresentation)
    implementation(projects.coreUi)

}