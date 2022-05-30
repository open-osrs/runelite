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
    testAnnotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
    testCompileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    implementation(gradleApi())

    implementation(project(":deobfuscator"))
    implementation(project(":runescape-api"))
    implementation(project(":runescape-client"))
    implementation(project(":runelite-mixins"))

    implementation(group = "org.ow2.asm", name = "asm", version = "9.0")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "9.0")
    implementation(group = "org.jetbrains", name = "annotations", version = "22.0.0")
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
    implementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.4")

    testImplementation(group = "junit", name = "junit", version = "4.12")
}

tasks.register<JavaExec>("inject") {
    dependsOn(":runelite-mixins:build")
    dependsOn(":runescape-api:build")
    dependsOn(":runescape-client:build")

    enableAssertions = true

    classpath = project.sourceSets.main.get().runtimeClasspath
    mainClass.set("com.openosrs.injector.Injector")

    inputs.dir("${project.extra["rootPath"]}/runelite-mixins/src/main/java")
    inputs.dir("${project.extra["rootPath"]}/runelite-api/src/main/java")
    inputs.dir("${project.extra["rootPath"]}/runescape-api/src/main/java")
    inputs.dir("${project.extra["rootPath"]}/runescape-client/src/main/java")

    val out = "${project.extra["rootPath"]}/runelite-client/build/injected/injected-client.oprs"
    outputs.file(out)
    outputs.file("${project.extra["rootPath"]}/runelite-client/build/injected/client.hash")

    outputs.cacheIf { true }

    args("--outmode", "jar", "--vanilla", vanillaDep.singleFile, "--version", openosrsVersion, "--output", out)
}

