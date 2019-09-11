/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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
package net.runelite.client.plugins.statustimers;

import com.google.inject.Provides;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.LocalPlayerDeath;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.events.SpotAnimationChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.multiindicators.MapLocations;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.PvPUtil;
import org.apache.commons.lang3.ArrayUtils;

@PluginDescriptor(
	name = "Status Timers",
	description = "Shows status timers on players",
	tags = {"freeze", "timers", "barrage", "teleblock", "status"},
	type = PluginType.PVP,
	enabledByDefault = false
)
@Singleton
@Getter(AccessLevel.PACKAGE)
public class StatusTimers extends Plugin
{
	private static final int VORKATH_REGION = 9023;

	private final Map<Integer, Victim> victimMap = new ConcurrentHashMap<>();
	private final Map<Integer, Victim> victimMapCache = new ConcurrentHashMap<>();

	@Inject
	private Client client;
	@Inject
	private StatusTimersConfig config;
	@Inject
	private StatusTimersOverlay overlay;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private EventBus eventBus;

	private FontStyle fontStyle;
	private boolean freezeTimers;
	private boolean noImage;
	private boolean showNpcs;
	private boolean showPlayers;
	private boolean tb;
	private boolean veng;
	private int offset;
	private int textSize;

	@Provides
	private StatusTimersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(StatusTimersConfig.class);
	}

	@Override
	protected void startUp()
	{
		addSubscriptions();
		updateConfig();
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
		overlayManager.remove(overlay);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(ChatMessage.class, this, this::onChatMessage);
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(LocalPlayerDeath.class, this, this::onLocalPlayerDeath);
		eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
		eventBus.subscribe(NpcSpawned.class, this, this::onNpcSpawned);
		eventBus.subscribe(PlayerDespawned.class, this, this::onPlayerDespawned);
		eventBus.subscribe(PlayerSpawned.class, this, this::onPlayerSpawned);
		eventBus.subscribe(SpotAnimationChanged.class, this, this::onSpotAnimationChanged);
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("statusTimers"))
		{
			updateConfig();
		}
	}

	private void onLocalPlayerDeath(LocalPlayerDeath event)
	{
		final Player localPlayer = client.getLocalPlayer();

		if (localPlayer == null)
		{
			return;
		}

		victimMap.get(localPlayer.getPlayerId()).setTimerMap(new HashMap<>());
	}

	private void onNpcSpawned(NpcSpawned event)
	{
		final int index = event.getNpc().getIndex();
		if (victimMapCache.containsKey(index))
		{
			final Victim vic = victimMapCache.get(index);
			victimMap.put(index, vic);
			victimMapCache.remove(index);
		}
		else
		{
			victimMap.put(index, new Victim(event.getActor()));
		}
	}

	private void onNpcDespawned(NpcDespawned event)
	{
		final int index = event.getNpc().getIndex();

		if (victimMap.containsKey(index) && isNotVorkath())
		{
			final Victim vic = victimMap.get(index);
			victimMapCache.put(index, vic);
			victimMap.remove(index);
		}

		if (isNotVorkath())
		{
			return;
		}

		final NPC npc = event.getNpc();

		victimMap.remove(npc.getIndex());
	}

	private void onPlayerDespawned(PlayerDespawned event)
	{
		final int id = event.getPlayer().getPlayerId();
		if (victimMap.containsKey(id))
		{
			final Victim vic = victimMap.get(id);
			victimMapCache.put(id, vic);
			victimMap.remove(id);
		}
	}

	private void onPlayerSpawned(PlayerSpawned event)
	{
		final int id = event.getPlayer().getPlayerId();
		if (victimMapCache.containsKey(id))
		{
			final Victim vic = victimMapCache.get(id);
			victimMap.put(id, vic);
			victimMapCache.remove(id);
		}
		else
		{
			victimMap.put(id, new Victim(event.getActor()));
		}
	}

	private void onChatMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE
			|| !event.getMessage().contains("Your Tele Block has been removed")
			|| client.getLocalPlayer() == null)
		{
			return;
		}

		final Victim victim = victimMap.get(client.getLocalPlayer().getPlayerId());
		victim.getTimerMap().remove(TimerType.TELEBLOCK);
		victim.getImmunityMap().put(TimerType.TELEBLOCK, TimerType.TELEBLOCK.getImmunityTime());
	}

	private void onGameTick(GameTick tickEvent)
	{
		victimMap.values().forEach(this::update);
	}

	private void onSpotAnimationChanged(SpotAnimationChanged event)
	{
		final Actor actor = event.getActor();

		if (actor == null)
		{
			return;
		}

		final Victim victim;

		if (actor instanceof Player)
		{
			victim = victimMap.getOrDefault(((Player) actor).getPlayerId(), null);
		}
		else if (actor instanceof NPC)
		{
			victim = victimMap.getOrDefault(((NPC) actor).getIndex(), null);
		}
		else
		{
			return;
		}

		if (victim == null)
		{
			return;
		}

		final int oldGraphic = victim.getSpotAnimLastTick();
		final int newGraphic = actor.getSpotAnimation();

		if (oldGraphic == newGraphic)
		{
			return;
		}

		final PlayerSpellEffect effect = PlayerSpellEffect.getFromSpotAnim(newGraphic);

		if (effect == PlayerSpellEffect.NONE)
		{
			return;
		}

		final int currentTick = client.getTickCount();

		if (victim.getTimerMap().containsKey(effect.getType()) || victim.getImmunityMap().containsKey(effect.getType()))
		{
			return;
		}

		int length = effect.getTimerLengthTicks();

		if (effect.isHalvable() && (victim.getLastPrayer() != null && victim.getLastPrayer() == Prayer.PROTECT_FROM_MAGIC))
		{
			length /= 2;
		}

		victim.getTimerMap().put(effect.getType(), currentTick + length);
	}

	private void update(Victim victim)
	{
		if (victim.getActor() == null)
		{
			return;
		}
		victim.timerToImmunity(client.getTickCount());
		victim.update();
		if (victim.getTimerMap().containsKey(TimerType.TELEBLOCK))
		{
			final WorldPoint actorLoc = victim.getActor().getWorldLocation();
			final EnumSet<WorldType> worldTypes = client.getWorldType();

			if (!WorldType.isAllPvpWorld(worldTypes) && (actorLoc.getY() < 3525 || PvPUtil.getWildernessLevelFrom(actorLoc) <= 0))
			{
				victim.getTimerMap().remove(TimerType.TELEBLOCK);
				victim.getImmunityMap().put(TimerType.TELEBLOCK, TimerType.TELEBLOCK.getImmunityTime());
			}
			else if (WorldType.isPvpWorld(worldTypes) &&
				MapLocations.getPvpSafeZones(actorLoc.getPlane()).contains(actorLoc.getX(), actorLoc.getY()))
			{
				victim.getTimerMap().remove(TimerType.TELEBLOCK);
				victim.getImmunityMap().put(TimerType.TELEBLOCK, TimerType.TELEBLOCK.getImmunityTime());
			}
			else if (WorldType.isDeadmanWorld(worldTypes) &&
				MapLocations.getDeadmanSafeZones(actorLoc.getPlane()).contains(actorLoc.getX(), actorLoc.getY()))
			{
				victim.getTimerMap().remove(TimerType.TELEBLOCK);
				victim.getImmunityMap().put(TimerType.TELEBLOCK, TimerType.TELEBLOCK.getImmunityTime());
			}
		}
	}

	private void updateConfig()
	{
		this.showPlayers = config.showPlayers();
		this.showNpcs = config.showNpcs();
		this.freezeTimers = config.FreezeTimers();
		this.tb = config.TB();
		this.veng = config.Veng();
		this.offset = config.offset();
		this.noImage = config.noImage();
		this.fontStyle = config.fontStyle();
		this.textSize = config.textSize();
	}

	private boolean isNotVorkath()
	{
		return !ArrayUtils.contains(client.getMapRegions(), VORKATH_REGION);
	}
}
