import com.soywiz.korge.gradle.*

apply<com.soywiz.korge.gradle.KorgeGradlePlugin>()

korge {
    id = "com.sample.clientserver"
}

dependencies {
    add("commonMainImplementation", project(":shared"))
}
