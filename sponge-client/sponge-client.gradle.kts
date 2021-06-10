import ProjectVersions.openosrsVersion

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

group = "com.spongeosrs"
description = "SpongeOSRS Client"

repositories {
    maven(url = "https://maven.gegy1000.net/")
}

plugins {
    java
}

dependencies {
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.20")
    implementation(project(":runelite-annotations"))
    implementation(project(":runescape-api"))
    implementation(project(":sponge-agent"))
    implementation(files("./build/injected/injected-client.jar"))
    implementation(group = "org.spongepowered", name = "mixin-bare", version = "0.7.11-SNAPSHOT")
    implementation(group = "org.apache.logging.log4j", name = "log4j-core", version = "2.5")
    implementation(group = "com.google.guava", name = "guava", version = "23.2-jre")
    implementation(group = "org.projectlombok", name = "lombok", version = "1.18.20")
    testImplementation(group = "junit", name = "junit", version = "4.12")
    testImplementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.12")
    testImplementation(group = "org.slf4j", name = "slf4j-simple", version = "1.7.12")
}

tasks {
    java {
        // Needs 1.8 because of lambdas in reflection
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        disableAutoTargetJvm()
    }
    withType<JavaCompile> {
        options.compilerArgs.addAll(arrayOf("-g:source,vars,lines", "-Xlint:-unchecked"))
    }
    register<JavaExec>("rsc-run") {
        group = "openosrs"

        classpath = project(":runescape-client").sourceSets.test.get().runtimeClasspath
        enableAssertions = true

        mainClass.set("Main")
    }
    processResources {
        dependsOn(":openosrs-injector:inject")
        from("build/injected")
    }
    register<Copy>("packInjectedClient") {
        dependsOn(":openosrs-injector:inject")

        from("build/injected/")
        include("**/injected-client.oprs")
        into("${buildDir}/resources/main")

        outputs.upToDateWhen { false }
    }
    register<JavaExec>("SpongeMain") {

        enableAssertions = true

        main = "Launcher"
        classpath = sourceSets["main"].runtimeClasspath
        jvmArgs("-javaagent:../sponge-agent/build/libs/sponge-agent-" + openosrsVersion + ".jar=agent.MixinAgentBootstrap","-noverify")
    }
}
