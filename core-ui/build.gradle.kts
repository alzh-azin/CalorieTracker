plugins {
    alias(libs.plugins.calorietracker.android.library.ui)
}

android {
    namespace = "com.example.core_ui"

}

dependencies {

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}