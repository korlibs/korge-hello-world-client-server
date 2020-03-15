buildscript {
    val korgePluginVersion: String by project

    repositories {
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
    }
}

allprojects {
    repositories.apply {
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        jcenter()
        mavenCentral()
    }
}
