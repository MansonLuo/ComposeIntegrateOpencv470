pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ComposeIntegrateOpencv470"
include(":app")
include(":opencvsdk470")
project(":opencvsdk470").projectDir = file("opencvsdk470/sdk")

