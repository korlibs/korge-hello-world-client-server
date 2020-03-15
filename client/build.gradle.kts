import com.soywiz.korge.gradle.*

apply<KorgeGradlePlugin>()

korge {
    id = "com.sample.clientserver"
}

dependencies {
    add("commonMainImplementation", project(":shared"))
}
