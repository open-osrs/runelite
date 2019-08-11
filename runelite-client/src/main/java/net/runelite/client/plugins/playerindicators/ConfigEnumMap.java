/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/

package net.runelite.client.plugins.playerindicators;

import java.util.EnumMap;
import lombok.Getter;

public class ConfigEnumMap<T> extends EnumMap
{
	@Getter
	private final Class<T> keyType;

	public ConfigEnumMap(Class<T> keyType)
	{
		super(keyType);
		this.keyType = keyType;

	}
}
