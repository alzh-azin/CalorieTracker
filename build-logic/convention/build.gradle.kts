import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.example.calorietracker.buildlogic"

// Configure the build-logic plugins to target JDK 17
// This matches the JDK used to build the project, and is not related to what is running on device.
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {

    plugins {
        plugins {
            register("androidApplication") {
                id = "calorietracker.android.application"
                implementationClass = "AndroidApplicationConventionPlugin"
            }
        }

        register("androidApplicationUi") {
            id = "calorietracker.android.application.ui"
            implementationClass = "AndroidApplicationUiConventionPlugin"
        }

        register("androidLibrary") {
            id = "calorietracker.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidLibraryUi"){
            id = "calorietracker.android.library.ui"
            implementationClass = "AndroidLibraryUiConventionPlugin"
        }

        register("androidSerialization"){
            id = "calorietracker.android.serialization"
            implementationClass = "AndroidSerializationConventionPlugin"
        }

        register("hilt"){
            id = "calorietracker.android.hilt"
            implementationClass = "HiltConventionPlugin"
        }
    }
}