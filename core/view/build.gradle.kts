plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kotlin.compose.compiler)
}

kotlin {
    jvmToolchain(21) // Ensure Kotlin targets JVM 21
    androidTarget()
    iosX64()
    iosArm64()   // 64-bit iPhone devices
    iosSimulatorArm64()
    jvm("desktop")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
                implementation(compose.material3)
                implementation(libs.coil)
                implementation(libs.coil.compose)
                implementation(libs.material.icons.extended)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.viewmodel.savestate.android)
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
    }

}
compose {
}


android {
    namespace = "nl.jovmit.androiddevs.core.view"
    compileSdk = libs.versions.compileSdkVersion.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdkVersion.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        val javaVersion = libs.versions.javaVersion.get()
        sourceCompatibility = JavaVersion.toVersion(javaVersion)
        targetCompatibility = JavaVersion.toVersion(javaVersion)
    }


    buildFeatures {
        compose = true
    }
}
