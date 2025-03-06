plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.android.hilt)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 34
    buildToolsVersion = "32.1.0-rc1"

    defaultConfig {
        applicationId = "com.hussainmehboob.roundupapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    testOptions {
        unitTests.all { unitTest ->
            unitTest.useJUnitPlatform()  // explicitly use JUnit 5
        }
    }
    namespace = "com.hussainmehboob.roundupapp"
}

dependencies {
    implementation(libs.bundles.ui)
    implementation(libs.bundles.lifecycle)
    implementation(libs.bundles.remoteImages)
    implementation(libs.dagger.hilt)
    implementation(libs.hilt.navigation)
    kapt(libs.dagger.hilt.compiler)
    implementation(libs.bundles.network)
    kapt(libs.moshi.kotlin.codegen)
    testImplementation(libs.bundles.test)
    testRuntimeOnly(libs.junit.jupiter.engine)
    androidTestImplementation(libs.bundles.androidTest)
    kaptAndroidTest(libs.dagger.hilt.android.compiler)

    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose.ui)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.manifest)
    androidTestImplementation(libs.compose.junit4)

    testImplementation(libs.mockk.unit)
    testImplementation(libs.mockk.agent)
}
