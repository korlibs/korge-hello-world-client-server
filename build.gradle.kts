import korlibs.korge.gradle.configureAutoVersions

plugins {
    alias(libs.plugins.korge) apply false
}

configureAutoVersions()

allprojects { repositories { mavenLocal(); mavenCentral(); google(); gradlePluginPortal() } }