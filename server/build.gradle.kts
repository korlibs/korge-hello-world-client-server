plugins {
    application
}

apply(plugin = "kotlin")

val ktorVersion: String by project

dependencies {
    add("implementation", project(":shared"))
    add("implementation", "io.ktor:ktor-server-netty:$ktorVersion")
    add("implementation", "ch.qos.logback:logback-classic:1.2.3")

}

application {
    mainClassName = "MainKt"
}
