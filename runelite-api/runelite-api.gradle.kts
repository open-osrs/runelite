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

description = "RuneLite API"

dependencies {
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    implementation(group = "com.google.code.findbugs", name = "jsr305", version = "3.0.2")
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
    implementation(group = "org.apache.commons", name = "commons-text", version = "1.9")
    implementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.32")

    testImplementation(group = "junit", name = "junit", version = "4.12")
}

tasks {
    jar {
        exclude("net/runelite/api/widgets/ItemQuantityMode.class")
        exclude("net/runelite/api/widgets/WidgetConfig.class")
        exclude("net/runelite/api/widgets/WidgetID*.class")
        exclude("net/runelite/api/widgets/WidgetModalMode.class")
        exclude("net/runelite/api/widgets/WidgetModelType.class")
        exclude("net/runelite/api/widgets/WidgetPositionMode.class")
        exclude("net/runelite/api/widgets/WidgetSizeMode.class")
        exclude("net/runelite/api/widgets/WidgetTextAlignment.class")
        exclude("net/runelite/api/widgets/WidgetType.class")
        exclude("net/runelite/api/clan/ClanID.class")
        exclude("net/runelite/api/AnimationID.class")
        exclude("net/runelite/api/EnumID.class")
        exclude("net/runelite/api/FontID.class")
        exclude("net/runelite/api/GraphicID.class")
        exclude("net/runelite/api/ItemID.class")
        exclude("net/runelite/api/NpcID.class")
        exclude("net/runelite/api/NullItemID.class")
        exclude("net/runelite/api/NullNpcID.class")
        exclude("net/runelite/api/NullObjectID.class")
        exclude("net/runelite/api/ObjectID.class")
        exclude("net/runelite/api/Opcodes.class")
        exclude("net/runelite/api/ParamID.class")
        exclude("net/runelite/api/ProjectileID.class")
        exclude("net/runelite/api/ScriptID.class")
        exclude("net/runelite/api/SettingID.class")
        exclude("net/runelite/api/SoundEffectID.class")
        exclude("net/runelite/api/SoundEffectVolume.class")
        exclude("net/runelite/api/SpriteID.class")
        exclude("net/runelite/api/StructID.class")
    }
}