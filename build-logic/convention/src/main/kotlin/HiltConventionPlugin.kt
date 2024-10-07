import org.gradle.api.Plugin
import org.gradle.kotlin.dsl.dependencies
import utils.getDaggerHilt
import utils.getKapt
import utils.libs

class HiltConventionPlugin : Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        target.apply {
            plugin(target.getKapt())
            plugin(target.getDaggerHilt())
        }

        target.run {
            dependencies {
                "implementation"(libs.findLibrary("androidx-hilt-navigation-compose").get())
                "implementation"(libs.findLibrary("hilt.android").get())
                "implementation"(libs.findLibrary("androidx-hilt-common").get())
                "kapt"(libs.findLibrary("hilt.compiler").get())
                "kapt"(libs.findLibrary("hilt.ext.compiler").get())
            }
        }
    }
}