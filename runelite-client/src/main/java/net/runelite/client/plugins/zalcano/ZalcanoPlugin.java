/*
 *
 *  * Copyright (c) 2019, gazivodag <https://github.com/gazivodag>
 *  * All rights reserved.
 *  *
 *  * Redistribution and use in source and binary forms, with or without
 *  * modification, are permitted provided that the following conditions are met:
 *  *
 *  * 1. Redistributions of source code must retain the above copyright notice, this
 *  *    list of conditions and the following disclaimer.
 *  * 2. Redistributions in binary form must reproduce the above copyright notice,
 *  *    this list of conditions and the following disclaimer in the documentation
 *  *    and/or other materials provided with the distribution.
 *  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package net.runelite.client.plugins.zalcano;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Zalcano",
	description = "Highlights Zalcano AOEs and useful stuff",
	tags = {"zalcano", "aoe", "prifddinas", "elf", "boss"},
	type = PluginType.PVM
)
@Slf4j
public class ZalcanoPlugin extends Plugin
{

	@Inject
	private Client client;

	@Inject
	private ZalcanoConfig config;

	@Inject
	ZalcanoUtil util;

	@Inject
	private ZalcanoOverlay overlay;

	@Inject
	ZalcanoStepsOverlay stepsOverlay;

	@Inject
	OverlayManager overlayManager;

	@Inject
	private EventBus eventBus;

	protected static final String mine = "MINE";
	protected static final String warning = "GET BACK";

	@Setter
	@Getter
	private NPC zalcano;

	@Getter
	private NPC golem;

	@Getter
	@Setter
	private Step step;

	private int ores = 0;

	@Provides
	ZalcanoConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ZalcanoConfig.class);
	}

	@Override
	protected void startUp()
	{
		eventBus.subscribe(GameTick.class, "regionchecker", this::onGameTickCheckRegion);
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
		overlayManager.remove(overlay);
		overlayManager.remove(stepsOverlay);
	}

	@Override
	public void configure(Binder binder)
	{
	}

	public void onGameTickCheckRegion(GameTick gameTick)
	{
		if (client.getLocalPlayer().getWorldLocation().getRegionID() == 12126) //if player is in zalcanos region load the other events
		{
			log.debug("region check complete loading other events");
			eventBus.subscribe(NpcSpawned.class, this, this::onNpcSpawned);
			eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
			eventBus.subscribe(GameTick.class, this, this::gameTickStepMachine);
			eventBus.subscribe(GameTick.class, this, this::gameTickOreListener);

			util.manuallyFindZalcano(); //this is here because the new subscribed npcspawn doesn't catch a pre existing zalcano

			overlayManager.add(overlay);
			overlayManager.add(stepsOverlay);

			eventBus.unregister("regionchecker");
		}
	}

	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		switch (npcSpawned.getNpc().getId())
		{
			case 9049: //zalcano
				log.debug("zalcano spawned");
				zalcano = npcSpawned.getNpc();
				break;
			case 9051: //golem
				log.debug("golem spawned");
				golem = npcSpawned.getNpc();
				break;
		}
	}

	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		switch (npcDespawned.getNpc().getId())
		{
			case 9049: //zalcano
				zalcano = null;
				break;
			case 9051: //golem
				golem = null;
				break;
		}
	}

	//23905 //ore
	//23906 //smelted
	//23907 //runecrafted ore

	/**
	 * This event switches steps based on different conditions (inaccurate)
	 * TODO: improve this. until then its option is disabled in the config
	 *
	 * @param gameTick
	 */
	public void gameTickStepMachine(GameTick gameTick)
	{
		if (!config.showSteps())
		{
			return;
		}

		if (getZalcano() != null)
		{
			if (getZalcano().getAnimation() == 8437) //zalcano got knocked down
			{
				setStep(Step.MINE_ZALCANO);
				return;
			}
		}
		if (util.countItemInInventory(23905) < 3 && util.countItemInInventory(23906) < 3 && util.countStackInInventory(23907) < 3)
		{
			if (client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON) == 23907)
			{
				setStep(Step.THROW);
				return;
			}
			if (getZalcano() != null && util.countItemInInventory(23906) == 0 && util.countItemInInventory(23907) == 0)
			{
				setStep(Step.MINE);
				return;
			}
		}
		if (util.countItemInInventory(23905) >= 3)
		{
			setStep(Step.SMELT);
			return;
		}
		if (util.countItemInInventory(23906) >= 3 && ores == 0)
		{
			setStep(Step.RUNECRAFT);
			return;
		}
		if (util.countStackInInventory(23907) >= 3)
		{
			setStep(Step.THROW);
			return;
		}
		setStep(Step.IDLE);
	}

	public void gameTickOreListener(GameTick gameTick)
	{
		if (!config.showSteps())
		{
			return;
		}
		ores = util.countItemInInventory(23905);
		//log.debug("ores: {}", ores);
	}

}
