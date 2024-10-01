package utils

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal fun Project.getAndroidApplication(): String {
    return libs.findPlugin("android-application").get().get().pluginId
}

internal fun Project.getAndroidLibrary(): String {
    return libs.findPlugin("android-library").get().get().pluginId
}

internal fun Project.getKotlinAndroid(): String {
    return libs.findPlugin("jetbrains-kotlin-android").get().get().pluginId
}

internal fun Project.getKotlinSerialization(): String {
    return libs.findPlugin("kotlin-serialization").get().get().pluginId
}
