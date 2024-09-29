pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven {
            url = uri("https://inexus.samentic.com/repository/samentic-android")
            credentials {
                username = "azin.alizadeh"
                password = "K}bWjB%k7PpAJ>."
            }
        }

        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://inexus.samentic.com/repository/samentic-android")
            credentials {
                username = "azin.alizadeh"
                password = "K}bWjB%k7PpAJ>."
            }
        }
        maven {
            url = uri("https://inexus.samentic.com/repository/samentic-android")
            credentials {
                username = "azin.alizadeh"
                password = "K}bWjB%k7PpAJ>."
            }
        }

        google()
        mavenCentral()
    }
}

rootProject.name = "CalorieTracker"
include(":app")
include(":core")
include(":onboarding")
include(":onboarding")
include(":onboarding:onboarding_presentation")
include(":onboarding:onboarding_domain")
include(":tracker")
include(":tracker:tracker_data")
include(":tracker:tracker_domain")
include(":tracker:tracker_presentation")
