/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector

import org.gradle.api.Plugin
import org.gradle.api.Project

class InjectPlugin: Plugin<Project> {
    override fun apply(project: Project) { with(project) {
        val task = tasks.create("inject", Inject::class.java)
        task.output.convention { file("$buildDir/libs/$name-$version.jar") }

        artifacts {
            it.add("runtimeElements", task.output)
        }

        tasks.getByName("assemble") {
            it.finalizedBy("inject")
        }

        extensions.add(InjectExtension::class.java, "injector", task.extension)
    }}
}