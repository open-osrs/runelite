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

public class ConfigEnumMap extends EnumMap implements Serializable
{
	@Getter
	private final Class<? extends Enum> keyType;
	@Getter
	private final List<? extends Enum> allEnums;

	@Override
	public String toString()
	{
		if (this.isEmpty())
		{
			return this.keyType.getCanonicalName() + "{}";
		}
		return this.keyType.getCanonicalName() + super.toString();
	}

	/**
	 *
	 * @param keyType
	 */
	public ConfigEnumMap(Class k)
	{
		super(k);
		this.keyType = k;
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
	public List<? extends Enum> getSelectedValues()
	{
		ArrayList<Enum> selectedValues = new ArrayList<>();
		this.forEach((t, value) ->
		{
			final int v = (int) value;
			if (v == 1)
			{
				selectedValues.add((Enum) t);
			}
		});
		return selectedValues;
	}

	/**
	 *
	 * @param index
	 * @return
	 */
	private Enum getEnumFromIndex(int index)
	{
		return this.getKeyType().getEnumConstants()[index];
	}
}
