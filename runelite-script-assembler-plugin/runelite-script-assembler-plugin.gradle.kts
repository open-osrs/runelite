/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * Copyright (c) 2020 Lucas <https://github.com/Lucwousin>
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
import java.io.DataOutputStream as DOS

description = "Script Assembler Plugin"

dependencies {
    annotationProcessor(group = "org.eclipse.sisu", name = "org.eclipse.sisu.inject", version = "0.3.4")

    compileOnly(group = "org.apache.maven.plugin-tools", name = "maven-plugin-annotations", version = "3.6.0")

    implementation(project(":cache"))
    implementation(project(":runelite-api"))
    implementation(group = "com.google.guava", name = "guava", version = "23.2-jre")
    implementation(group = "org.apache.maven", name = "maven-plugin-api", version = "3.6.3")
    implementation(group = "org.slf4j", name = "slf4j-nop", version = "1.7.12")
}

tasks {
    register<JavaExec>("assembleMojo") {
        outputs.cacheIf { true }
        val inp = "${project.extra["rootPath"]}/runelite-client/src/main/scripts"
        val out = "${project.extra["rootPath"]}/runelite-client/build/scripts/runelite"
        inputs.dir(inp)
        outputs.dir(out)

        classpath = project.sourceSets.main.get().runtimeClasspath
        main = "net.runelite.script.AssembleMojo"
        args(listOf(inp, out))

        doLast {
            DOS(project.file("$out/index").outputStream().buffered(256)).use {
                project.fileTree(out) {
                    exclude { it.path.endsWith(".hash") || it.name.equals("index") }
                    var lastDir = Int.MAX_VALUE
                    visit {
                        if (this.isDirectory) lastDir = this.name.toInt().shl(16)
                        else it.writeInt(lastDir.or(this.name.toInt()))
                    }
                }
                it.writeInt(-1)
            }
        }
    }
}