/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.external.adonai;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum EquipmentMap
{



	HELMET("Helmet", WidgetInfo.EQUIPMENT_HELMET),
	CAPE("Cape", WidgetInfo.EQUIPMENT_CAPE),
	AMULET("Amulet", WidgetInfo.EQUIPMENT_AMULET),
	WEAPON("Weapon", WidgetInfo.EQUIPMENT_WEAPON),
	BODY("Body", WidgetInfo.EQUIPMENT_BODY),
	SHIELD("Shield", WidgetInfo.EQUIPMENT_SHIELD),
	LEGS("Legs", WidgetInfo.EQUIPMENT_LEGS),
	GLOVES("Gloves", WidgetInfo.EQUIPMENT_GLOVES),
	BOOTS("Boots", WidgetInfo.EQUIPMENT_BOOTS),
	RING("Ring", WidgetInfo.EQUIPMENT_RING),
	AMMO("Ammo", WidgetInfo.EQUIPMENT_AMMO);
	

	private final String name;
	private final WidgetInfo info;
	private static final Map<String, WidgetInfo> map;

	static
	{
		ImmutableMap.Builder<String, WidgetInfo> builder = ImmutableMap.builder();

		for (EquipmentMap equipment : values())
		{
			builder.put(equipment.getName(), equipment.getInfo());
		}

		map = builder.build();
	}

	@Nullable
	public static WidgetInfo getWidget(String equipment)
	{
		return map.getOrDefault(equipment, null);
	}
}
