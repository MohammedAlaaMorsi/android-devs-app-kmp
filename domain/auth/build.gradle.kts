plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    jvmToolchain(21) // Ensure Kotlin targets JVM 21
    androidTarget()
    iosX64()
    iosArm64()   // 64-bit iPhone devices
    macosArm64() // Modern Apple Silicon-based Macs
    iosSimulatorArm64()
    jvm("desktop")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.core.network)

            }
        }
        val androidMain by getting {
            dependencies {
            }
        }

        val iosMain by creating {
            dependencies {
            }
        }

        val desktopMain by getting {
            dependencies {
            }
        }

        val commonTest by getting {
            dependencies {
            }
        }
    }

}

android {
    namespace = "nl.jovmit.androiddevs.domain.auth"
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


    testOptions.unitTests {
        isReturnDefaultValues = true
        all { tests ->
            tests.useJUnitPlatform()
            tests.testLogging {
                events("passed", "failed", "skipped")
            }
        }
    }
}
