/*
 * Copyright (c) 2020 Dutta64 <https://github.com/Dutta64>
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
package net.runelite.client.plugins.hallowedsepulchre;

import com.google.inject.Provides;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.LocatableQueryResults;
import net.runelite.api.NPC;
import net.runelite.api.NullNpcID;
import net.runelite.api.ObjectID;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.queries.GameObjectQuery;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Hallowed Sepulchre",
	enabledByDefault = false,
	description = "A plugin for the Hallowed Sepulchre agility minigame.",
	tags = {"sepulchre", "hallowed", "darkmeyer", "agility", "course", "minigame"}
)
public class HallowedSepulchrePlugin extends Plugin
{
	private static final String GAME_MESSAGE_ENTER_LOBBY1 = "You make your way back to the lobby of the Hallowed Sepulchre.";
	private static final String GAME_MESSAGE_ENTER_LOBBY2 = "The obelisk teleports you back to the lobby of the Hallowed Sepulchre.";
	private static final String GAME_MESSAGE_ENTER_SEPULCHRE = "You venture further down into the Hallowed Sepulchre.";

	private static final int ANIM_TICK_SPEED_2 = 2;
	private static final int ANIM_TICK_SPEED_3 = 3;

	private static final int WIZARD_STATUE_ANIM_FIRE = 8658;

	private static final Set<Integer> ARROW_IDS = Set.of(
		NullNpcID.NULL_9672,
		NullNpcID.NULL_9673,
		NullNpcID.NULL_9674
	);

	private static final Set<Integer> SWORD_IDS = Set.of(
		NullNpcID.NULL_9669,
		NullNpcID.NULL_9670,
		NullNpcID.NULL_9671
	);

	private static final Set<Integer> CROSSBOWMAN_STATUE_IDS = Set.of(
		ObjectID.CROSSBOWMAN_STATUE,
		ObjectID.CROSSBOWMAN_STATUE_38445,
		ObjectID.CROSSBOWMAN_STATUE_38446
	);

	private static final Set<Integer> WIZARD_STATUE_2TICK_IDS = Set.of(
		ObjectID.WIZARD_STATUE_38421,
		ObjectID.WIZARD_STATUE_38422,
		ObjectID.WIZARD_STATUE_38423,
		ObjectID.WIZARD_STATUE_38424,
		ObjectID.WIZARD_STATUE_38425
	);

	private static final Set<Integer> WIZARD_STATUE_3TICK_IDS = Set.of(
		ObjectID.WIZARD_STATUE,
		ObjectID.WIZARD_STATUE_38410,
		ObjectID.WIZARD_STATUE_38411,
		ObjectID.WIZARD_STATUE_38412,
		ObjectID.WIZARD_STATUE_38416,
		ObjectID.WIZARD_STATUE_38417,
		ObjectID.WIZARD_STATUE_38418,
		ObjectID.WIZARD_STATUE_38419,
		ObjectID.WIZARD_STATUE_38420
	);

	private static final Set<Integer> REGION_IDS = Set.of(
		8794, 8795, 8796, 8797, 8798,
		9050, 9051, 9052, 9053, 9054,
		9306, 9307, 9308, 9309, 9310,
		9562, 9563, 9564, 9565, 9566,
		9818, 9819, 9820, 9821, 9822,
		10074, 10075, 10076, 10077, 10078,
		10330, 10331, 10332, 10333, 10334
	);

	@Inject
	private Client client;

	@Inject
	private HallowedSepulchreConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private HallowedSepulchreOverlay hallowedSepulchreOverlay;

	@Getter(AccessLevel.PACKAGE)
	private final Set<GameObject> crossbowStatues = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<HallowedSepulchreWizardStatue> wizardStatues = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> arrows = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> swords = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private boolean playerInSepulchre = false;

	@Provides
	HallowedSepulchreConfig getConfig(final ConfigManager configManager)
	{
		return configManager.getConfig(HallowedSepulchreConfig.class);
	}

	@Override
	protected void startUp()
	{
		if (client.getGameState() != GameState.LOGGED_IN || !isInSepulchreRegion())
		{
			return;
		}

		locateSepulchreGameObjects();
		overlayManager.add(hallowedSepulchreOverlay);
		playerInSepulchre = true;
	}

	@Override
	protected void shutDown()
	{
		playerInSepulchre = false;
		overlayManager.remove(hallowedSepulchreOverlay);
		clearSepulchreGameObjects();
	}

	@Subscribe
	private void onGameTick(final GameTick event)
	{
		if (!playerInSepulchre)
		{
			return;
		}

		updateWizardStatues();
	}

	@Subscribe
	private void onNpcSpawned(final NpcSpawned event)
	{
		if (!playerInSepulchre)
		{
			return;
		}

		addNpc(event.getNpc());
	}

	@Subscribe
	private void onNpcDespawned(final NpcDespawned event)
	{
		if (!playerInSepulchre)
		{
			return;
		}

		removeNpc(event.getNpc());
	}

	@Subscribe
	private void onGameObjectSpawned(final GameObjectSpawned event)
	{
		if (!playerInSepulchre)
		{
			return;
		}

		addGameObject(event.getGameObject());
	}

	@Subscribe
	private void onGameStateChanged(final GameStateChanged event)
	{
		final GameState gameState = event.getGameState();

		switch (gameState)
		{
			case LOGGED_IN:
				if (isInSepulchreRegion())
				{
					playerInSepulchre = true;
				}
				else if (playerInSepulchre)
				{
					shutDown();
				}
				break;
			case LOGIN_SCREEN:
				if (playerInSepulchre)
				{
					shutDown();
				}
				break;
			default:
				if (playerInSepulchre)
				{
					clearSepulchreGameObjects();
				}
				break;
		}
	}

	@Subscribe
	private void onChatMessage(final ChatMessage message)
	{
		if (!playerInSepulchre || message.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		switch (message.getMessage())
		{
			case GAME_MESSAGE_ENTER_LOBBY1:
			case GAME_MESSAGE_ENTER_LOBBY2:
				clearSepulchreGameObjects();
				break;
			case GAME_MESSAGE_ENTER_SEPULCHRE:
				if (!overlayManager.anyMatch(o -> o instanceof HallowedSepulchreOverlay))
				{
					overlayManager.add(hallowedSepulchreOverlay);
				}
				break;
			default:
				break;
		}
	}

	private void updateWizardStatues()
	{
		if (!config.highlightWizardStatues() || wizardStatues.isEmpty())
		{
			return;
		}

		for (final HallowedSepulchreWizardStatue wizardStatue : wizardStatues)
		{
			wizardStatue.updateTicksUntilNextAnimation();
		}
	}

	private void addNpc(final NPC npc)
	{
		final int id = npc.getId();

		if (ARROW_IDS.contains(id))
		{
			arrows.add(npc);
		}
		else if (SWORD_IDS.contains(id))
		{
			swords.add(npc);
		}
	}

	private void removeNpc(final NPC npc)
	{
		final int id = npc.getId();

		if (ARROW_IDS.contains(id))
		{
			arrows.remove(npc);
		}
		else if (SWORD_IDS.contains(id))
		{
			swords.remove(npc);
		}
	}

	private void addGameObject(final GameObject gameObject)
	{
		final int id = gameObject.getId();

		if (CROSSBOWMAN_STATUE_IDS.contains(id))
		{
			crossbowStatues.add(gameObject);
		}
		else if (WIZARD_STATUE_2TICK_IDS.contains(id))
		{
			wizardStatues.add(new HallowedSepulchreWizardStatue(gameObject, WIZARD_STATUE_ANIM_FIRE, ANIM_TICK_SPEED_2));
		}
		else if (WIZARD_STATUE_3TICK_IDS.contains(id))
		{
			wizardStatues.add(new HallowedSepulchreWizardStatue(gameObject, WIZARD_STATUE_ANIM_FIRE, ANIM_TICK_SPEED_3));
		}
	}

	private void clearSepulchreGameObjects()
	{
		crossbowStatues.clear();
		wizardStatues.clear();
		arrows.clear();
		swords.clear();
	}

	private boolean isInSepulchreRegion()
	{
		return REGION_IDS.contains(client.getMapRegions()[0]);
	}

	private void locateSepulchreGameObjects()
	{
		final LocatableQueryResults<GameObject> locatableQueryResults = new GameObjectQuery().result(client);

		for (final GameObject gameObject : locatableQueryResults)
		{
			addGameObject(gameObject);
		}

		for (final NPC npc : client.getNpcs())
		{
			addNpc(npc);
		}
	}
}
