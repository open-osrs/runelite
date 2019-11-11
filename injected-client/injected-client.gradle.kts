/*
 * Copyright (c) 2019 ThatGamerBlue
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

apply<FernflowerPlugin>()

description = "Injected Client"

plugins {
    id("com.openosrs.injector")
}

configurations {
    create("vanilla")
    create("injected-client")
}

dependencies {
    "vanilla"(Libraries.vanilla)
    implementation(project(":runelite-mixins"))
    implementation(project(":runescape-api"))
    implementation(project(":runescape-client"))
}

injector {
    mixins.set(tasks.getByPath(":runelite-mixins:jar").outputs.files.singleFile)
    rsapi.set(tasks.getByPath(":runescape-api:jar").outputs.files.singleFile)
    rsclient.set(tasks.getByPath(":runescape-client:jar").outputs.files.singleFile)
    vanilla.set(project.file(configurations["vanilla"].asPath))
}

artifacts {
    add("runtimeOnly", tasks.inject.get().output) {
        builtBy(tasks.inject)
    }
}

// keep the sourcesets etc but remove useless tasks
tasks {
    classes {
        enabled = false
    }
    compileJava {
        enabled = false
    }
    jar {
        enabled = false
    }
    processResources {
        enabled = false
    }
}