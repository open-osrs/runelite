/*
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
package net.runelite.client.plugins.nightmare;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("betterNightmare")
public interface NightmareConfig extends Config {
    @ConfigSection(
        keyName = "features",
        name = "Features",
        description = "Features",
        position = 0
    )
    default boolean features() { return true; }

    @ConfigItem(
        keyName = "prayerHelper",
        name = "Prayer helper",
        description = "Displays the correct prayer to use at various points in the fight.",
        position = 1,
        section = "features"
    )
    default boolean prayerHelper() { return true; }

    @ConfigItem(
        keyName = "tickCounter",
        name = "Show Ticks",
        description = "Displays the number of ticks until next attack",
        position = 2,
        section = "features"
    )
    default boolean ticksCounter() { return true; }

    @ConfigItem(
            keyName = "highlightTotems",
            name = "Highlight Totems",
            description = "Highlights Totems based on their status",
            position = 3,
            section = "features"
    )
    default boolean highlightTotems() { return true; }
}
