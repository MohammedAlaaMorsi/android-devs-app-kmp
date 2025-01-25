pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")

    }
}

rootProject.name = "AndroidDevsKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":androidApp")
include(":core:view")
include(":feature:welcome")
include(":feature:signup")
include(":feature:login")
include(":feature:timeline")
include(":feature:postdetails")
include(":domain:auth")
include(":core:network")
include(":core:database")
include(":shared")
include(":testutils")
