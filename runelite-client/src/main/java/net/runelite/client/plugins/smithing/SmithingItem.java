/*
 * Copyright (c) 2020, Macweese <https://github.com/Macweese>
 *  Macweese#1169, macweese@pm.me
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
package net.runelite.client.plugins.smithing;

import net.runelite.api.widgets.WidgetInfo;

public enum SmithingItem
{
	/*
	 * Currently    WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1 and
	 *              WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1
	 * serve as functions for all unspecified smithing items
	 * E.g. javelins/hastae/spears/lanterns/bronze wire/etc
	 *
	 * @TODO : add
	 *      Create fields for each individual item and filter which fall within
	 *      WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1 and WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2
	 *      in order to select those instead of the ambigious categories of 'exclusive 1/2'
	 *      - Would need a check to control type of bar which is going to be smithed
	 */
	DAGGER("Dagger", WidgetInfo.SMITHING_ANVIL_DAGGER, WidgetInfo.SMITHING_ANVIL_DAGGER.getId(), 10, 36, 55, 80),
	AXE("Axe", WidgetInfo.SMITHING_ANVIL_AXE, WidgetInfo.SMITHING_ANVIL_AXE.getId(), 90, 36, 55, 80),
	MACE("Mace", WidgetInfo.SMITHING_ANVIL_MACE, WidgetInfo.SMITHING_ANVIL_MACE.getId(), 90, 91, 55, 80),
	MED_HELM("Med helm", WidgetInfo.SMITHING_ANVIL_MED_HELM, WidgetInfo.SMITHING_ANVIL_MED_HELM.getId(), 250, 36, 55, 80),
	BOLT("Bolt", WidgetInfo.SMITHING_ANVIL_BOLTS, WidgetInfo.SMITHING_ANVIL_BOLTS.getId(), 410, 36, 55, 55),
	SHORT_SWORD("Short-sword", WidgetInfo.SMITHING_ANVIL_SWORD, WidgetInfo.SMITHING_ANVIL_SWORD.getId(), 10, 91, 55, 80),
	DART("Dart tip", WidgetInfo.SMITHING_ANVIL_DART_TIPS, WidgetInfo.SMITHING_ANVIL_DART_TIPS.getId(), 330, 36, 55, 65),
	NAIL("Nails", WidgetInfo.SMITHING_ANVIL_NAILS, WidgetInfo.SMITHING_ANVIL_NAILS.getId(), 170, 256, 55, 80),
	SCIM("Scimitar", WidgetInfo.SMITHING_ANVIL_SCIMITAR, WidgetInfo.SMITHING_ANVIL_SCIMITAR.getId(), 10, 146, 55, 80),
	SPEAR("Spear", WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1, WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1.getId(), 250, 256, 55, 80),
	HASTAE("Hastae", WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2, WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2.getId(), 330, 201, 55, 80),
	ARROWHEAD("Arrowtip", WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, WidgetInfo.SMITHING_ANVIL_ARROW_HEADS.getId(), 330, 91, 55, 65),
	CROSSBOW("Crossbow limbs", WidgetInfo.SMITHING_ANVIL_LIMBS, WidgetInfo.SMITHING_ANVIL_LIMBS.getId(), 395, 91, 55, 55),
	SPECIAL_1("Special - 1", WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1, WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1.getId(), 250, 256, 55, 80),
	SPECIAL_2("Special - 2", WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2, WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2.getId(), 330, 201, 55, 80),
	//JAVELIN("Javelin head", WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS.getId()),
	LONGSWORD("Long-sword", WidgetInfo.SMITHING_ANVIL_LONG_SWORD, WidgetInfo.SMITHING_ANVIL_LONG_SWORD.getId(), 10, 201, 55, 80),
	FULL_HELM("Full helm", WidgetInfo.SMITHING_ANVIL_FULL_HELM, WidgetInfo.SMITHING_ANVIL_FULL_HELM.getId(), 250, 91, 55, 80),
	KNIFE("Knife", WidgetInfo.SMITHING_ANVIL_KNIVES, WidgetInfo.SMITHING_ANVIL_KNIVES.getId(), 330, 146, 55, 80),
	SQUARE_SHIELD("SQ Shield", WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, WidgetInfo.SMITHING_ANVIL_SQ_SHIELD.getId(), 250, 146, 55, 80),
	WARHAMMER("Warhammer", WidgetInfo.SMITHING_ANVIL_WARHAMMER, WidgetInfo.SMITHING_ANVIL_WARHAMMER.getId(), 90, 146, 55, 80),
	BATTLE_AXE("Battleaxe", WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, WidgetInfo.SMITHING_ANVIL_BATTLE_AXE.getId(), 90, 201, 55, 80),
	CHAINBODY("Chainbody", WidgetInfo.SMITHING_ANVIL_CHAIN_BODY,  WidgetInfo.SMITHING_ANVIL_CHAIN_BODY.getId(), 170, 36, 55, 80),
	KITE_SHIELD("Kiteshield", WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, WidgetInfo.SMITHING_ANVIL_KITE_SHIELD.getId(), 250, 201, 55, 80),
	TWO_HANDED_SWORD("2H Sword", WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD.getId(), 10, 256, 55, 80),
	PLATELEGS("Platelegs", WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, WidgetInfo.SMITHING_ANVIL_PLATE_LEGS.getId(), 170, 91, 55, 80),
	PLATESKIRT("Plateskirt", WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT.getId(), 170, 146, 55, 80),
	PLATEBODY("Platebody", WidgetInfo.SMITHING_ANVIL_PLATE_BODY, WidgetInfo.SMITHING_ANVIL_PLATE_BODY.getId(), 170, 201, 55, 80);

	private final String name;
	private final WidgetInfo widgetInfo;
	private final int id;
	private final int x;
	private final int y;
	private final int h;
	private final int w;

	SmithingItem(String name, WidgetInfo widgetInfo, int id, int x, int y, int h, int w)
	{
		this.name = name;
		this.widgetInfo = widgetInfo;
		this.id = id;
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
	}

	/**
	 * Get the name of the Item(Widget)
	 * @return String
	 */
	@Override
	public String toString()
	{
		return name;
	}

	/**
	 * Get the WidgetInfo related to this Item(Widget)
	 * @return WidgetInfo
	 */
	public WidgetInfo getWidgetInfo()
	{
		return widgetInfo;
	}

	/**
	 * Get the WidgetID related to this Widget
	 * @return Integer
	 */
	public int getWidgetID()
	{
		return id;
	}

	/**
	 * Get the X position related to this Widget
	 * @return Integer
	 */
	public int getOriginalX()
	{
		return x;
	}

	/**
	 * Get the Y position related to this Widget
	 * @return Integer
	 */
	public int getOriginalY()
	{
		return y;
	}

	/**
	 * Get the height related to this Widget
	 * @return Integer
	 */
	public int getOriginalHeight()
	{
		return h;
	}

	/**
	 * Get the width related to this Widget
	 * @return Integer
	 */
	public int getOriginalWidth()
	{
		return w;
	}
}