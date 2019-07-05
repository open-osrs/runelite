/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Jordan Atwood <jordan.atwood423@gmail.com>
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
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
package net.runelite.client.plugins.timers;

import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.GraphicID;
import net.runelite.api.ItemID;
import net.runelite.api.SpriteID;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.SpriteManager;

enum GameTimer
{
	STAMINA(ItemID.STAMINA_POTION4, GameTimerImageType.ITEM, "Stamina", 2, ChronoUnit.MINUTES, true),
	ANTIFIRE(ItemID.ANTIFIRE_POTION4, GameTimerImageType.ITEM, "Antifire", 6, ChronoUnit.MINUTES),
	EXANTIFIRE(ItemID.EXTENDED_ANTIFIRE4, GameTimerImageType.ITEM, "Extended antifire", 12, ChronoUnit.MINUTES),
	OVERLOAD(ItemID.OVERLOAD_4, GameTimerImageType.ITEM, "Overload", 5, ChronoUnit.MINUTES, true),
	CANNON(ItemID.CANNON_BARRELS, GameTimerImageType.ITEM, "Cannon", 25, ChronoUnit.MINUTES),
	MAGICIMBUE(SpriteID.SPELL_MAGIC_IMBUE, GameTimerImageType.SPRITE, "Magic imbue", 12, ChronoUnit.SECONDS),
	FULLTB(SpriteID.SPELL_TELE_BLOCK, GameTimerImageType.SPRITE, "Full Teleblock", 5, ChronoUnit.MINUTES, true),
	HALFTB(SpriteID.SPELL_TELE_BLOCK, GameTimerImageType.SPRITE, "Half Teleblock", 150, ChronoUnit.SECONDS, true),
	DMM_FULLTB(SpriteID.SPELL_TELE_BLOCK, GameTimerImageType.SPRITE, "Deadman Mode Full Teleblock", 150, ChronoUnit.SECONDS, true),
	DMM_HALFTB(SpriteID.SPELL_TELE_BLOCK, GameTimerImageType.SPRITE, "Deadman Mode Half Teleblock", 75, ChronoUnit.SECONDS, true),
	SUPERANTIFIRE(ItemID.SUPER_ANTIFIRE_POTION4, GameTimerImageType.ITEM, "Super antifire", 3, ChronoUnit.MINUTES),
	BIND(SpriteID.SPELL_BIND, GameTimerImageType.SPRITE, "Bind", GraphicID.BIND, 5, ChronoUnit.SECONDS, true),
	HALFBIND(SpriteID.SPELL_BIND, GameTimerImageType.SPRITE, "Half Bind", GraphicID.BIND, 2500, ChronoUnit.MILLIS, true),
	SNARE(SpriteID.SPELL_SNARE, GameTimerImageType.SPRITE, "Snare", GraphicID.SNARE, 10, ChronoUnit.SECONDS, true),
	HALFSNARE(SpriteID.SPELL_SNARE, GameTimerImageType.SPRITE, "Half Snare", GraphicID.SNARE, 5, ChronoUnit.SECONDS, true),
	ENTANGLE(SpriteID.SPELL_ENTANGLE, GameTimerImageType.SPRITE, "Entangle", GraphicID.ENTANGLE, 15, ChronoUnit.SECONDS, true),
	HALFENTANGLE(SpriteID.SPELL_ENTANGLE, GameTimerImageType.SPRITE, "Half Entangle", GraphicID.ENTANGLE, 7500, ChronoUnit.MILLIS, true),
	ICERUSH(SpriteID.SPELL_ICE_RUSH, GameTimerImageType.SPRITE, "Ice rush", GraphicID.ICE_RUSH, 5, ChronoUnit.SECONDS, true),
	ICEBURST(SpriteID.SPELL_ICE_BURST, GameTimerImageType.SPRITE, "Ice burst", GraphicID.ICE_BURST, 10, ChronoUnit.SECONDS, true),
	ICEBLITZ(SpriteID.SPELL_ICE_BLITZ, GameTimerImageType.SPRITE, "Ice blitz", GraphicID.ICE_BLITZ, 15, ChronoUnit.SECONDS, true),
	ICEBARRAGE(SpriteID.SPELL_ICE_BARRAGE, GameTimerImageType.SPRITE, "Ice barrage", GraphicID.ICE_BARRAGE, 20, ChronoUnit.SECONDS, true),
	IMBUEDHEART(ItemID.IMBUED_HEART, GameTimerImageType.ITEM, "Imbued heart", GraphicID.IMBUED_HEART, 420, ChronoUnit.SECONDS),
	VENGEANCE(SpriteID.SPELL_VENGEANCE, GameTimerImageType.SPRITE, "Vengeance", 30, ChronoUnit.SECONDS),
	EXSUPERANTIFIRE(ItemID.EXTENDED_SUPER_ANTIFIRE4, GameTimerImageType.ITEM, "Extended Super AntiFire", 6, ChronoUnit.MINUTES),
	OVERLOAD_RAID(ItemID.OVERLOAD_4_20996, GameTimerImageType.ITEM, "Overload", 5, ChronoUnit.MINUTES, true),
	PRAYER_ENHANCE(ItemID.PRAYER_ENHANCE_4, GameTimerImageType.ITEM, "Prayer enhance", 290, ChronoUnit.SECONDS, true),
	GOD_WARS_ALTAR(SpriteID.SKILL_PRAYER, GameTimerImageType.SPRITE, "God wars altar", 10, ChronoUnit.MINUTES),
	CHARGE(SpriteID.SPELL_CHARGE, GameTimerImageType.SPRITE, "Charge", 6, ChronoUnit.MINUTES),
	STAFF_OF_THE_DEAD(ItemID.STAFF_OF_THE_DEAD, GameTimerImageType.ITEM, "Staff of the Dead", 1, ChronoUnit.MINUTES),
	ABYSSAL_SIRE_STUN(ItemID.ABYSSAL_ORPHAN, GameTimerImageType.ITEM, "Abyssal Sire Stun", 30, ChronoUnit.SECONDS, true),
	HOME_TELEPORT(SpriteID.SPELL_LUMBRIDGE_HOME_TELEPORT, GameTimerImageType.SPRITE, "Home Teleport", 30, ChronoUnit.MINUTES),
	MINIGAME_TELEPORT(SpriteID.TAB_QUESTS_RED_MINIGAMES, GameTimerImageType.SPRITE, "Minigame Teleport", 20, ChronoUnit.MINUTES),
	SKULL(SpriteID.PLAYER_KILLER_SKULL_523, GameTimerImageType.SPRITE, "Skull", 20, ChronoUnit.MINUTES),
	ANTIPOISON(ItemID.ANTIPOISON4, GameTimerImageType.ITEM, "Antipoison"),
	ANTIVENOM(ItemID.ANTIVENOM4, GameTimerImageType.ITEM, "Anti-venom");

	@Getter(AccessLevel.PACKAGE)
	private final Duration duration;
	@Getter(AccessLevel.PACKAGE)
	private final Integer graphicId;
	@Getter(AccessLevel.PACKAGE)
	private final String description;
	@Getter(AccessLevel.PACKAGE)
	private final boolean removedOnDeath;

	private final int imageId;
	private final GameTimerImageType imageType;

	GameTimer(final int imageId, final GameTimerImageType idType, final String description, final Integer graphicId, final long time, final ChronoUnit unit, final boolean removedOnDeath)
	{
		this.description = description;
		this.graphicId = graphicId;
		this.duration = Duration.of(time, unit);
		this.imageId = imageId;
		this.imageType = idType;
		this.removedOnDeath = removedOnDeath;
	}

	GameTimer(final int imageId, final GameTimerImageType idType, final String description, final long time, final ChronoUnit unit, final boolean removeOnDeath)
	{
		this(imageId, idType, description, null, time, unit, removeOnDeath);
	}

	GameTimer(final int imageId, final GameTimerImageType idType, final String description, final Integer graphicId, final long time, final ChronoUnit unit)
	{
		this(imageId, idType, description, graphicId, time, unit, false);
	}

	GameTimer(final int imageId, final GameTimerImageType idType, final String description, final long time, final ChronoUnit unit)
	{
		this(imageId, idType, description, null, time, unit, false);
	}

	GameTimer(final int imageId, final GameTimerImageType idType, final String description)
	{
		this(imageId, idType, description, null, 1, ChronoUnit.MILLIS, false);
	}

	BufferedImage getImage(ItemManager itemManager, SpriteManager spriteManager)
	{
		switch (imageType)
		{
			case ITEM:
				return itemManager.getImage(imageId);
			case SPRITE:
				return spriteManager.getSprite(imageId, 0);
			default:
				return null;
		}
	}
}
