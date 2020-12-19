/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity

interface InjectExtension {
    @get:[InputFile PathSensitive(PathSensitivity.NONE)]
    val vanilla: RegularFileProperty

    @get:[InputFile PathSensitive(PathSensitivity.NONE)]
    val rsclient: RegularFileProperty

    @get:[InputFile PathSensitive(PathSensitivity.NONE)]
    val mixins: RegularFileProperty

    @get:[InputFile PathSensitive(PathSensitivity.NONE)]
    val rsapi: RegularFileProperty
}

