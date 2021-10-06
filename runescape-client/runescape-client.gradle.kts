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

group = "com.openosrs.rs"
description = "RuneScape Client"

dependencies {
    implementation(project(":injection-annotations"))
    implementation(group = "org.bouncycastle", name = "bcprov-jdk15on", version = "1.52")

    testImplementation(group = "junit", name = "junit", version = "4.12")
    testImplementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.32")
    testImplementation(group = "org.slf4j", name = "slf4j-simple", version = "1.7.32")
}

tasks {
    java {
        // Needs 1.8 because of lambdas in reflection
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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
}
