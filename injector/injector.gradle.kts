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

    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    implementation(gradleApi())

    implementation(project(":deobfuscator"))
    implementation(project(":runescape-api"))
    implementation(project(":runescape-client"))
    implementation(project(":runelite-mixins"))

    implementation(group = "org.ow2.asm", name = "asm", version = "8.0.1")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "8.0.1")
    implementation(group = "org.jetbrains", name = "annotations", version = "19.0.0")
    implementation(group = "com.google.guava", name = "guava", version = "23.2-jre")
    implementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.1")
}

tasks.register<JavaExec>("inject") {
    dependsOn(":runelite-mixins:build")
    dependsOn(":runescape-api:build")
    dependsOn(":runescape-client:build")

    enableAssertions = true

    main = "com.openosrs.injector.Injector"
    val out = "${project.extra["rootPath"]}/runelite-client/build/injected/injected-client.oprs"
    outputs.file(out)
    classpath = sourceSets["main"].runtimeClasspath
    args("--outmode", "jar", "--vanilla", vanillaDep.singleFile, "--version", openosrsVersion, "--output", out)
    outputs.upToDateWhen {
        false
    }
}

