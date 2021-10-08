/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.external.adonai;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.plugins.itemstats.stats.EnergyStat;
import net.runelite.client.plugins.itemstats.stats.SkillStat;
import net.runelite.client.plugins.itemstats.stats.Stat;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum StatsMap
{

	ATTACK("ATTACK", WidgetInfo.SKILLS_CONTAINER_ATTACK),
	STRENGTH("STRENGTH", WidgetInfo.SKILLS_CONTAINER_STRENGTH),
	DEFENCE("DEFENCE", WidgetInfo.SKILLS_CONTAINER_DEFENCE),
	RANGED("RANGED", WidgetInfo.SKILLS_CONTAINER_RANGED),
	PRAYER("PRAYER", WidgetInfo.SKILLS_CONTAINER_PRAYER),
	MAGIC("MAGIC", WidgetInfo.SKILLS_CONTAINER_MAGIC),
	RUNECRAFT("RUNECRAFT", WidgetInfo.SKILLS_CONTAINER_RUNECRAFT),
	CONSTRUCTION("CONSTRUCTION", WidgetInfo.SKILLS_CONTAINER_CONSTRUCTION),
	HITPOINTS("HITPOINTS", WidgetInfo.SKILLS_CONTAINER_HITPOINTS),
	AGILITY("AGILITY", WidgetInfo.SKILLS_CONTAINER_AGILITY),
	HERBLORE("HERBLORE", WidgetInfo.SKILLS_CONTAINER_HERBLORE),
	THIEVING("THIEVING", WidgetInfo.SKILLS_CONTAINER_THIEVING),
	CRAFTING("CRAFTING", WidgetInfo.SKILLS_CONTAINER_CRAFTING),
	FLETCHING("FLETCHING", WidgetInfo.SKILLS_CONTAINER_FLETCHING),
	SLAYER("SLAYER", WidgetInfo.SKILLS_CONTAINER_SLAYER),
	HUNTER("HUNTER", WidgetInfo.SKILLS_CONTAINER_HUNTER),
	MINING("MINING", WidgetInfo.SKILLS_CONTAINER_MINING),
	SMITHING("SMITHING", WidgetInfo.SKILLS_CONTAINER_SMITHING),
	FISHING("FISHING", WidgetInfo.SKILLS_CONTAINER_FISHING),
	COOKING("COOKING", WidgetInfo.SKILLS_CONTAINER_COOKING),
	FIREMAKING("FIREMAKING", WidgetInfo.SKILLS_CONTAINER_FIREMAKING),
	WOODCUTTING("WOODCUTTING", WidgetInfo.SKILLS_CONTAINER_WOODCUTTING),
	FARMING("FARMING", WidgetInfo.SKILLS_CONTAINER_FARMING);

	private final String name;
	private final WidgetInfo info;
	private static final Map<String, WidgetInfo> map;

	static
	{
		ImmutableMap.Builder<String, WidgetInfo> builder = ImmutableMap.builder();

		for (StatsMap skills : values())
		{
			builder.put(skills.getName(), skills.getInfo());
		}

		map = builder.build();
	}

	@Nullable
	public static WidgetInfo getWidget(String skill)
	{
		return map.getOrDefault(skill, null);
	}
}
