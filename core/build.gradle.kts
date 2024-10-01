plugins {
    alias(libs.plugins.calorietracker.android.library)
    alias(libs.plugins.calorietracker.android.serialization)
}

android {
    namespace = "com.example.core"

}

dependencies {

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}