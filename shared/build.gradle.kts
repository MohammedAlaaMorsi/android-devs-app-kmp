plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}



kotlin {
    jvmToolchain(21) // Ensure Kotlin targets JVM 21
    androidTarget()
    listOf(
        iosX64(),
        iosArm64(),
        macosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "AndroidDevsKMP"
            isStatic = true
            // Required when using NativeSQLiteDriver
            linkerOpts.add("-lsqlite3")
        }
    }
    jvm("desktop")

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(libs.koin.composeVM)
                implementation(libs.room.runtime)
                implementation(libs.sqlite.bundled)
                implementation(projects.core.network)
                implementation(projects.core.database)

                /*
                implementation(projects.domain.auth)
                implementation(projects.feature.login)
                implementation(projects.feature.signup)
                implementation(projects.feature.timeline)
                implementation(projects.feature.postdetails)
                implementation(projects.feature.welcome)*/


            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.koin.android)
                implementation(libs.room.runtime.android)

            }
        }

        val iosMain by creating {
            dependencies {

            }
        }
        val commonTest by getting {
            dependencies {
            }
        }
        val desktopMain by getting {
            dependencies {
            }
        }

    }
}
android {
    namespace = "nl.jovmit.androiddevs.shared"
    compileSdk = libs.versions.compileSdkVersion.get().toInt()
    defaultConfig {
        minSdk = libs.versions.minSdkVersion.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
