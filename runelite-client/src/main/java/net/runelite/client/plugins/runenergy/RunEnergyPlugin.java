/*
 * Copyright (c) 2018, Sean Dewar <https://github.com/seandewar>
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
package net.runelite.client.plugins.runenergy;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import static net.runelite.api.ItemID.AGILITY_CAPE;
import static net.runelite.api.ItemID.AGILITY_CAPET;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_11861;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13589;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13590;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13601;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13602;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13613;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13614;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13625;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13626;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13637;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13638;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13677;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_13678;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_21076;
import static net.runelite.api.ItemID.GRACEFUL_BOOTS_21078;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_11853;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13581;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13582;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13593;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13594;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13605;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13606;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13617;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13618;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13629;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13630;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13669;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_13670;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_21064;
import static net.runelite.api.ItemID.GRACEFUL_CAPE_21066;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_11859;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13587;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13588;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13599;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13600;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13611;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13612;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13623;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13624;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13635;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13636;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13675;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_13676;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_21073;
import static net.runelite.api.ItemID.GRACEFUL_GLOVES_21075;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_11851;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13579;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13580;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13591;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13592;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13603;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13604;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13615;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13616;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13627;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13628;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13667;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_13668;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_21061;
import static net.runelite.api.ItemID.GRACEFUL_HOOD_21063;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_11857;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13585;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13586;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13597;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13598;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13609;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13610;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13621;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13622;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13633;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13634;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13673;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_13674;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_21070;
import static net.runelite.api.ItemID.GRACEFUL_LEGS_21072;
import static net.runelite.api.ItemID.GRACEFUL_TOP_11855;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13583;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13584;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13595;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13596;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13607;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13608;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13619;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13620;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13631;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13632;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13671;
import static net.runelite.api.ItemID.GRACEFUL_TOP_13672;
import static net.runelite.api.ItemID.GRACEFUL_TOP_21067;
import static net.runelite.api.ItemID.GRACEFUL_TOP_21069;
import static net.runelite.api.ItemID.MAX_CAPE;
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.StringUtils;

@PluginDescriptor(
	name = "Run Energy",
	description = "Show various information related to run energy",
	tags = {"overlay", "stamina"}
)
@Singleton
public class RunEnergyPlugin extends Plugin
{
	// TODO It would be nice if we have the IDs for just the equipped variants of the Graceful set items.
	private static final ImmutableSet<Integer> ALL_GRACEFUL_HOODS = ImmutableSet.of(
		GRACEFUL_HOOD_11851, GRACEFUL_HOOD_13579, GRACEFUL_HOOD_13580, GRACEFUL_HOOD_13591, GRACEFUL_HOOD_13592,
		GRACEFUL_HOOD_13603, GRACEFUL_HOOD_13604, GRACEFUL_HOOD_13615, GRACEFUL_HOOD_13616, GRACEFUL_HOOD_13627,
		GRACEFUL_HOOD_13628, GRACEFUL_HOOD_13667, GRACEFUL_HOOD_13668, GRACEFUL_HOOD_21061, GRACEFUL_HOOD_21063
	);

	private static final ImmutableSet<Integer> ALL_GRACEFUL_TOPS = ImmutableSet.of(
		GRACEFUL_TOP_11855, GRACEFUL_TOP_13583, GRACEFUL_TOP_13584, GRACEFUL_TOP_13595, GRACEFUL_TOP_13596,
		GRACEFUL_TOP_13607, GRACEFUL_TOP_13608, GRACEFUL_TOP_13619, GRACEFUL_TOP_13620, GRACEFUL_TOP_13631,
		GRACEFUL_TOP_13632, GRACEFUL_TOP_13671, GRACEFUL_TOP_13672, GRACEFUL_TOP_21067, GRACEFUL_TOP_21069
	);

	private static final ImmutableSet<Integer> ALL_GRACEFUL_LEGS = ImmutableSet.of(
		GRACEFUL_LEGS_11857, GRACEFUL_LEGS_13585, GRACEFUL_LEGS_13586, GRACEFUL_LEGS_13597, GRACEFUL_LEGS_13598,
		GRACEFUL_LEGS_13609, GRACEFUL_LEGS_13610, GRACEFUL_LEGS_13621, GRACEFUL_LEGS_13622, GRACEFUL_LEGS_13633,
		GRACEFUL_LEGS_13634, GRACEFUL_LEGS_13673, GRACEFUL_LEGS_13674, GRACEFUL_LEGS_21070, GRACEFUL_LEGS_21072
	);

	private static final ImmutableSet<Integer> ALL_GRACEFUL_GLOVES = ImmutableSet.of(
		GRACEFUL_GLOVES_11859, GRACEFUL_GLOVES_13587, GRACEFUL_GLOVES_13588, GRACEFUL_GLOVES_13599, GRACEFUL_GLOVES_13600,
		GRACEFUL_GLOVES_13611, GRACEFUL_GLOVES_13612, GRACEFUL_GLOVES_13623, GRACEFUL_GLOVES_13624, GRACEFUL_GLOVES_13635,
		GRACEFUL_GLOVES_13636, GRACEFUL_GLOVES_13675, GRACEFUL_GLOVES_13676, GRACEFUL_GLOVES_21073, GRACEFUL_GLOVES_21075
	);

	private static final ImmutableSet<Integer> ALL_GRACEFUL_BOOTS = ImmutableSet.of(
		GRACEFUL_BOOTS_11861, GRACEFUL_BOOTS_13589, GRACEFUL_BOOTS_13590, GRACEFUL_BOOTS_13601, GRACEFUL_BOOTS_13602,
		GRACEFUL_BOOTS_13613, GRACEFUL_BOOTS_13614, GRACEFUL_BOOTS_13625, GRACEFUL_BOOTS_13626, GRACEFUL_BOOTS_13637,
		GRACEFUL_BOOTS_13638, GRACEFUL_BOOTS_13677, GRACEFUL_BOOTS_13678, GRACEFUL_BOOTS_21076, GRACEFUL_BOOTS_21078
	);

	// Agility skill capes and the non-cosmetic Max capes also count for the Graceful set effect
	private static final ImmutableSet<Integer> ALL_GRACEFUL_CAPES = ImmutableSet.of(
		GRACEFUL_CAPE_11853, GRACEFUL_CAPE_13581, GRACEFUL_CAPE_13582, GRACEFUL_CAPE_13593, GRACEFUL_CAPE_13594,
		GRACEFUL_CAPE_13605, GRACEFUL_CAPE_13606, GRACEFUL_CAPE_13617, GRACEFUL_CAPE_13618, GRACEFUL_CAPE_13629,
		GRACEFUL_CAPE_13630, GRACEFUL_CAPE_13669, GRACEFUL_CAPE_13670, GRACEFUL_CAPE_21064, GRACEFUL_CAPE_21066,
		AGILITY_CAPE, AGILITY_CAPET, MAX_CAPE
	);

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private RunEnergyOverlay energyOverlay;

	@Inject
	private RunEnergyConfig energyConfig;

	private boolean localPlayerRunningToDestination;
	private WorldPoint prevLocalPlayerLocation;

	@Provides
	RunEnergyConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RunEnergyConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(energyOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(energyOverlay);
		localPlayerRunningToDestination = false;
		prevLocalPlayerLocation = null;
		resetRunOrbText();
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		localPlayerRunningToDestination =
			prevLocalPlayerLocation != null &&
				client.getLocalDestinationLocation() != null &&
				prevLocalPlayerLocation.distanceTo(client.getLocalPlayer().getWorldLocation()) > 1;

		prevLocalPlayerLocation = client.getLocalPlayer().getWorldLocation();

		if (energyConfig.replaceOrbText())
		{
			setRunOrbText(getEstimatedRunTimeRemaining(true));
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("runenergy") && !energyConfig.replaceOrbText())
		{
			resetRunOrbText();
		}
	}

	private void setRunOrbText(String text)
	{
		Widget runOrbText = client.getWidget(WidgetInfo.MINIMAP_RUN_ORB_TEXT);

		if (runOrbText != null)
		{
			runOrbText.setText(text);
		}
	}

	private void resetRunOrbText()
	{
		setRunOrbText(Integer.toString(client.getEnergy()));
	}

	String getEstimatedRunTimeRemaining(boolean inSeconds)
	{
		// Calculate the amount of energy lost every tick.
		// Negative weight has the same depletion effect as 0 kg.
		final int effectiveWeight = Math.max(client.getWeight(), 0);
		double lossRate = (Math.min(effectiveWeight, 64) / 100.0) + 0.64;

		if (client.getVar(Varbits.RUN_SLOWED_DEPLETION_ACTIVE) != 0)
		{
			lossRate *= 0.3; // Stamina effect reduces energy depletion to 30%
		}

		// Calculate the number of seconds left
		final double secondsLeft = (client.getEnergy() * Constants.GAME_TICK_LENGTH) / (lossRate * 1000.0);

		// Return the text
		if (inSeconds)
		{
			return (int) Math.floor(secondsLeft) + "s";
		}
		else
		{
			final int minutes = (int) Math.floor(secondsLeft / 60.0);
			final int seconds = (int) Math.floor(secondsLeft - (minutes * 60.0));

			return minutes + ":" + StringUtils.leftPad(Integer.toString(seconds), 2, "0");
		}
	}

	private boolean isLocalPlayerWearingFullGraceful()
	{
		final ItemContainer equipment = client.getItemContainer(InventoryID.EQUIPMENT);

		if (equipment == null)
		{
			return false;
		}

		final Item[] items = equipment.getItems();

		// Check that the local player is wearing enough items to be using full Graceful
		// (the Graceful boots will have the highest slot index in the worn set).
		if (items == null || items.length <= EquipmentInventorySlot.BOOTS.getSlotIdx())
		{
			return false;
		}

		return (ALL_GRACEFUL_HOODS.contains(items[EquipmentInventorySlot.HEAD.getSlotIdx()].getId()) &&
			ALL_GRACEFUL_TOPS.contains(items[EquipmentInventorySlot.BODY.getSlotIdx()].getId()) &&
			ALL_GRACEFUL_LEGS.contains(items[EquipmentInventorySlot.LEGS.getSlotIdx()].getId()) &&
			ALL_GRACEFUL_GLOVES.contains(items[EquipmentInventorySlot.GLOVES.getSlotIdx()].getId()) &&
			ALL_GRACEFUL_BOOTS.contains(items[EquipmentInventorySlot.BOOTS.getSlotIdx()].getId()) &&
			ALL_GRACEFUL_CAPES.contains(items[EquipmentInventorySlot.CAPE.getSlotIdx()].getId()));
	}

	int getEstimatedRecoverTimeRemaining()
	{
		if (localPlayerRunningToDestination)
		{
			return -1;
		}

		// Calculate the amount of energy recovered every second
		double recoverRate = (48 + client.getBoostedSkillLevel(Skill.AGILITY)) / 360.0;

		if (isLocalPlayerWearingFullGraceful())
		{
			recoverRate *= 1.3; // 30% recover rate increase from Graceful set effect
		}

		// Calculate the number of seconds left
		final double secondsLeft = (100 - client.getEnergy()) / recoverRate;
		return (int) secondsLeft;
	}
}
