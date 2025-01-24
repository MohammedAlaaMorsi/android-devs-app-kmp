import com.codingfeline.buildkonfig.compiler.FieldSpec
import com.codingfeline.buildkonfig.compiler.FieldSpec.Type
import com.codingfeline.buildkonfig.gradle.BuildKonfigExtension

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.buildkonfig)
    alias(libs.plugins.kotlin.serialization)
}



kotlin {
    jvmToolchain(21) // Ensure Kotlin targets JVM 21
    androidTarget()
    iosX64()
    iosArm64()   // 64-bit iPhone devices
    macosArm64() // Modern Apple Silicon-based Macs
    watchosX64() // Modern 64-bit Apple Watch devices
    tvosArm64()  // Modern Apple TV devices
    iosSimulatorArm64()
    jvm("desktop")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.logging)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.ktor.client.encoding)
                implementation(libs.kermit)

            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.ktor.client.okhttp)
            }
        }

        val iosMain by creating {
            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }
        val commonTest by getting {
            dependencies {
            }
        }
    }
}
android {
    namespace = "nl.jovmit.androiddevs.core.network"
    compileSdk = libs.versions.compileSdkVersion.get().toInt()
    defaultConfig {
        minSdk = libs.versions.minSdkVersion.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

configure<BuildKonfigExtension> {
    packageName = "nl.jovmit.androiddevs.core.network"
    defaultConfigs {
        buildConfigField(Type.STRING, "BASE_URL", "https://api.skool.com/")
    }

    targetConfigs {

        create("android") {
            buildConfigField(FieldSpec.Type.STRING, "API_KEY", "test")
        }
        create("jvm") {
            buildConfigField(FieldSpec.Type.STRING, "target", "test")
        }
        create("ios") {
            buildConfigField(FieldSpec.Type.STRING, "target", "test")
        }
        create("desktop") {
            buildConfigField(FieldSpec.Type.STRING, "desktopvalue", "test")
        }
    }

}
