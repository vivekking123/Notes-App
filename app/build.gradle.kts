import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp" ) // specify the correct version
    id("androidx.navigation.safeargs.kotlin")

}

android {
    namespace = "com.example.notes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notes"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true

    }
}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    val roomVersion = "2.6.1"
    implementation (libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    // Coroutines
    implementation(libs.kotlinx.coroutines.android.v171)
    implementation (libs.androidx.room.ktx)
    // Navigation
    val navVersion = "2.7.5"
    implementation(libs.androidx.navigation.fragment.ktx.v275)
    implementation(libs.androidx.navigation.ui.ktx.v275)
    // Life Cycle Arch
    val lifecycleVersion = "2.6.2"
    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v262)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx.v262)
    // Annotation processor
    ksp(libs.androidx.lifecycle.compiler.v262)


}





