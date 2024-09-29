pluginManagement{
    repositories {

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

dependencyResolutionManagement {
    repositories {

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
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")