// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.46.1")
    }
}

plugins {
    id("com.android.application") version "8.2.0-beta04" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}