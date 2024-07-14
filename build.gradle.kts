// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Top-level build file where you can add configuration options common to all sub-projects/modules.




buildscript {
    

    repositories {
        google()
    }

    dependencies {

        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
        classpath (libs.gradle)
    }
}


plugins {
    id ("com.android.application") version "8.5.1" apply false
    id ("com.android.library") version "8.5.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.devtools.ksp") version "1.9.22-1.0.17"  apply false
}

