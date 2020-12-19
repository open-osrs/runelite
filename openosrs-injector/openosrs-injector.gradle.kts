/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-gradle-plugin")
    kotlin("jvm") version "1.3.72"
    `maven-publish`
    id("se.patrikerdes.use-latest-versions")
}

val oprsver = "3.5.1"

group = "com.openosrs"
version = "1.0.1"

repositories {
    mavenCentral()
    mavenLocal()
    maven {
        url = uri("https://repo.runelite.net")
        url = uri("https://raw.githubusercontent.com/open-osrs/hosting/master")
        url = uri("https://repo.openosrs.com/repository/maven")
    }
}

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.12")
    compileOnly("org.projectlombok:lombok:1.18.12")

    implementation("org.ow2.asm:asm:8.0.1")
    implementation("org.ow2.asm:asm-util:8.0.1")
    implementation("org.jetbrains:annotations:19.0.0")
    implementation("com.google.guava:guava:29.0-jre")
    implementation(project(":deobfuscator"))

    testCompileOnly(project(":injection-annotations"))
    testImplementation("junit:junit:4.13")
}

gradlePlugin {
    plugins {
        create("injectorPlugin") {
            id = "com.openosrs.injector"
            implementationClass = "com.openosrs.injector.InjectPlugin"
        }
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

publishing {
    repositories {
        mavenLocal()
    }
}
