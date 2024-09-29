package utils

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(commonExtension: CommonExtension<*, *, *, *, *, *>) {

    commonExtension.run {
        buildFeatures {
            compose = true
        }

        composeOptions {

            kotlinCompilerExtensionVersion = libs
                .findVersion("composeCompiler")
                .get()
                .toString()
        }

        dependencies {

            val bom = libs.findLibrary("androidx.compose.bom").get()

            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))
            "debugImplementation"(libs.findLibrary("androidx.ui.tooling.preview").get())

            "implementation"(libs.findLibrary("androidx.core.ktx").get())
            "implementation"(libs.findLibrary("androidx.lifecycle.runtime.ktx").get())
            "implementation"(libs.findLibrary("androidx.activity.compose").get())
            "implementation"(libs.findLibrary("androidx.ui").get())
            "implementation"(libs.findLibrary("androidx.ui.graphics").get())
            "implementation"(libs.findLibrary("androidx.ui.tooling.preview").get())
            "implementation"(libs.findLibrary("androidx.material3").get())

        }
    }
}