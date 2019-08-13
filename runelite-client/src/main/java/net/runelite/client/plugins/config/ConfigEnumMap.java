/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/

package net.runelite.client.plugins.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import lombok.Getter;

public class ConfigEnumMap<K extends Enum<K>> extends EnumMap<K, Integer> implements Serializable
{
	@Getter
	private final Class<K> keyType;
	@Getter
	private final List<K> allEnums;

	@Override
	public String toString()
	{
		return this.keyType.getCanonicalName() + super.toString();
	}

	/**
	 *
	 * @param keyType
	 */
	public ConfigEnumMap(Class<K> keyType)
	{
		super(keyType);
		this.keyType = keyType;
		allEnums = Arrays.asList(this.keyType.getEnumConstants());
		Arrays.stream(this.keyType.getEnumConstants()).forEach(constant ->
		{
			super.put(constant, 0);
		});

	}

	/**
	 *
	 * @return
	 */
	public List<K> getSelectedValues()
	{
		ArrayList<K> selectedValues = new ArrayList<>();
		this.forEach((t, value) ->
		{
			final int v = value;
			if (v == 1)
			{
				selectedValues.add(t);
			}
		});
		return selectedValues;
	}

	/**
	 *
	 * @param index
	 * @return
	 */
	private K getEnumFromIndex(int index)
	{
		return this.getKeyType().getEnumConstants()[index];
	}
}
