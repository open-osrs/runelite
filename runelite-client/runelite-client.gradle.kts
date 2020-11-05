/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import org.apache.tools.ant.filters.ReplaceTokens
import java.text.SimpleDateFormat
import java.util.Date

plugins {
    id("com.github.johnrengelman.shadow") version "6.1.0"
    java
}


apply<BootstrapPlugin>()

description = "RuneLite Client"

dependencies {
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.16")
    annotationProcessor(group = "org.pf4j", name = "pf4j", version = "3.4.1")

    api(project(":runelite-api"))

    compileOnly(group = "javax.annotation", name = "javax.annotation-api", version = "1.3.2")
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.16")
    compileOnly(group = "net.runelite", name = "orange-extensions", version = "1.0")

    implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.2.3")
    implementation(group = "com.google.code.gson", name = "gson", version = "2.8.6")
    implementation(group = "com.google.guava", name = "guava", version = "30.0-jre")
    implementation(group = "com.google.inject", name = "guice", version = "4.2.3", classifier = "no_aop")
    implementation(group = "com.h2database", name = "h2", version = "1.4.200")
    implementation(group = "com.jakewharton.rxrelay3", name = "rxrelay", version = "3.0.0")
    implementation(group = "com.squareup.okhttp3", name = "okhttp", version = "4.9.0")
    implementation(group = "io.reactivex.rxjava3", name = "rxjava", version = "3.0.7")
    implementation(group = "net.java.dev.jna", name = "jna", version = "5.6.0")
    implementation(group = "org.jgroups", name = "jgroups", version = "5.0.4.Final")
    implementation(group = "net.java.dev.jna", name = "jna-platform", version = "5.6.0")
    implementation(group = "net.runelite", name = "discord", version = "1.2")
    implementation(group = "org.pushing-pixels", name = "radiance-substance", version = "2.5.1")
    implementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.4")
    implementation(group = "org.apache.commons", name = "commons-text", version = "1.9")
    implementation(group = "commons-io", name = "commons-io", version = "2.8.0")
    implementation(group = "org.jetbrains", name = "annotations", version = "20.1.0")
    implementation(group = "org.jooq", name = "jooq", version = "3.14.1")
    implementation(group = "org.jooq", name = "jooq-codegen", version = "3.14.1")
    implementation(group = "org.jooq", name = "jooq-meta", version = "3.14.1")
    implementation(group = "io.sentry", name = "sentry-logback", version = "3.1.2")
    implementation(group = "com.github.zafarkhaja", name = "java-semver", version = "0.9.0")
    implementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.30")
    implementation(group = "org.pf4j", name = "pf4j", version = "3.4.1") {
        exclude(group = "org.slf4j")
    }
    implementation(group = "org.pf4j", name = "pf4j-update", version = "2.3.0")
    implementation(project(":http-api"))

    runtimeOnly(group = "org.pushing-pixels", name = "radiance-trident", version = "2.5.1")
    runtimeOnly(project(":injected-client"))
    runtimeOnly(project(":runescape-api"))

    testAnnotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.16")

    testCompileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.16")

    testImplementation(group = "com.google.inject.extensions", name = "guice-grapher", version = "4.2.3")
    testImplementation(group = "com.google.inject.extensions", name = "guice-testlib", version = "4.2.3")
    testImplementation(group = "org.hamcrest", name = "hamcrest-library", version = "2.2")
    testImplementation(group = "junit", name = "junit", version = "4.13.1")
    testImplementation(group = "org.mockito", name = "mockito-core", version = "3.6.0")
    testImplementation(group = "org.mockito", name = "mockito-inline", version = "3.6.0")
    testImplementation(group = "com.squareup.okhttp3", name = "mockwebserver", version = "4.9.0")
    testImplementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.30")
}

fun formatDate(date: Date?) = with(date ?: Date()) {
    SimpleDateFormat("MM-dd-yyyy").format(this)
}

fun pluginPath(): String {
    if (project.hasProperty("pluginPath")) {
        return project.property("pluginPath").toString()
    }
    return ""
}

tasks {
    build {
        finalizedBy("shadowJar")
    }

    processResources {
        finalizedBy("filterResources")
    }

    register<Copy>("filterResources") {
        val tokens = mapOf(
                "project.version" to ProjectVersions.rlVersion,
                "rs.version" to ProjectVersions.rsversion.toString(),
                "open.osrs.version" to ProjectVersions.openosrsVersion,
                "open.osrs.builddate" to formatDate(Date()),
                "plugin.path" to pluginPath()
        )

        inputs.properties(tokens)

        from("src/main/resources/")
        include("**/*.properties")
        into("${buildDir}/resources/main")

        filter(ReplaceTokens::class, "tokens" to tokens)
        filteringCharset = "UTF-8"
    }

    jar {
        manifest {
            attributes(mutableMapOf("Main-Class" to "net.runelite.client.RuneLite"))
        }
    }

    shadowJar {
        archiveClassifier.set("shaded")
    }

    processResources {
        dependsOn(":runelite-script-assembler-plugin:assembleMojo")

        from("${buildDir}/scripts")
    }

    withType<BootstrapTask> {
        group = "openosrs"
    }

    register<JavaExec>("RuneLite.main()") {
        group = "openosrs"

        classpath = sourceSets["main"].runtimeClasspath
        enableAssertions = true
        mainClass.set("net.runelite.client.RuneLite")
    }
}
