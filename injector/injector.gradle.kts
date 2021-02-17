import ProjectVersions.openosrsVersion
import ProjectVersions.rsversion

group = "com.openosrs"
version = 1.0

val vanillaDep: Configuration by configurations.creating

plugins {
    java
}

dependencies {
    vanillaDep(group = "net.runelite.rs", name = "vanilla", version = rsversion.toString())

    implementation(gradleApi())
    annotationProcessor("org.projectlombok:lombok:1.18.12")
    compileOnly("org.projectlombok:lombok:1.18.12")

    implementation("org.ow2.asm:asm:8.0.1")
    implementation("org.ow2.asm:asm-util:8.0.1")
    implementation("org.jetbrains:annotations:19.0.0")
    implementation("com.google.guava:guava:29.0-jre")
    implementation(project(":deobfuscator"))
    implementation(project(":runescape-api"))
    implementation(project(":runescape-client"))
    implementation(project(":runelite-mixins"))
}

tasks.register<JavaExec>("inject") {
    main = "com.openosrs.injector.Injector"
    classpath = sourceSets["main"].runtimeClasspath
    args(vanillaDep.singleFile, openosrsVersion)
    outputs.upToDateWhen {
        false
    }
}

tasks {
    build {
        finalizedBy("inject")
    }
}

