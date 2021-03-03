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

    annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.4")

    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.4")

    implementation(gradleApi())

    implementation(project(":deobfuscator"))
    implementation(project(":runescape-api"))
    implementation(project(":runescape-client"))
    implementation(project(":runelite-mixins"))

    implementation(group = "org.ow2.asm", name = "asm", version = "8.0.1")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "8.0.1")
    implementation(group = "org.jetbrains", name = "annotations", version = "19.0.0")
    implementation(group = "com.google.guava", name = "guava", version = "23.2-jre")
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

