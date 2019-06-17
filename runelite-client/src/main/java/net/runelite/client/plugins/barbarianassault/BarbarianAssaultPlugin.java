/*
 * Copyright (c) 2018, https://runelitepl.us
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
package net.runelite.client.plugins.barbarianassault;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Provides;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemID;
import net.runelite.api.MenuEntry;
import net.runelite.api.MessageNode;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.SoundEffectID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.BeforeRender;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.StringUtils;

import static net.runelite.api.widgets.WidgetInfo.*;


@Slf4j


@PluginDescriptor(
		name = "Barbarian Assault+",
		description = "Custom barbarian assault plugin, use along with BA Tools",
		tags = {"minigame", "overlay", "timer"},
		type = PluginType.PVM // don't remove this, added this because our barbarian assault plugin is big time modified
)
public class BarbarianAssaultPlugin extends Plugin implements KeyListener
{
	private static final String ENDGAME_REWARD_NEEDLE_TEXT = "<br>5";

	private static final WorldPoint healerSpawnPoint = new WorldPoint(1898, 1586, 0);

	private static final List REGIONS = ImmutableList.of(10322, 7509, 7508);

	private static final String[] STYLES = {"Defensive", "Aggressive", "Controlled", "Accurate"};

	private static final int COLOR_CALL_UPDATED = 16316664;

	private static final int LEAVE_EARLY_WIDGET_ID = 14352385;

	private static final int BA_WAVE_NUM_INDEX = 2;

	@Inject
	private Client client;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private BarbarianAssaultConfig config;

	@Inject
	private AboveWidgetsOverlay widgetsOverlay;

	@Inject
	private AboveSceneOverlay sceneOverlay;

	@Inject
	private BarbarianAssaultMenu menu;

	@Inject
	private ItemManager itemManager;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private KeyManager keyManager;

	@Getter
	private boolean inGame = false;

	@Getter
	private Wave wave = null;

	@Getter
	private Role role = null;

	@Getter
	private Scorecard scorecard = null;

	@Getter
	private Timer gameTimer = null;

	@Getter
	private int stage = -1;

	@Getter
	private Image clockImage;

	@Getter
	private Font font;

	@Getter
	private final HashMap<WorldPoint, Integer> redEggs = new HashMap<>();

	@Getter
	private final HashMap<WorldPoint, Integer> greenEggs = new HashMap<>();

	@Getter
	private final HashMap<WorldPoint, Integer> blueEggs = new HashMap<>();

	@Getter
	private final HashMap<WorldPoint, Integer> yellowEggs = new HashMap<>();

	@Getter
	private final Map<NPC, Healer> healers = new HashMap<>();

	//private final HashMap<Integer, Instant> foodPressed = new HashMap<>();

	private String foodUsed = "";

	private ImmutableMap<WidgetInfo, Boolean> originalAttackStyles;

	private int lastCallColor = -1;

	private String lastCallText = null;

	private String lastListenText = null;

	private int tickNum;

	private boolean tickReset;

	private CycleCounter counter;

	private NPC lastInteracted;

	private int lastHealerPoisoned;

	private boolean shiftDown;

	private boolean ctrlDown;


	@Provides
	BarbarianAssaultConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BarbarianAssaultConfig.class);
	}


	@Override
	protected void startUp() throws Exception
	{
		font = FontManager.getRunescapeFont().deriveFont(Font.BOLD, 24);
		clockImage = ImageUtil.getResourceStreamFromClass(getClass(), "clock.png");
		overlayManager.add(widgetsOverlay);
		overlayManager.add(sceneOverlay);
		keyManager.registerKeyListener(this);
		validateRole();
		menu.enableSwaps();
		menu.validateHiddenMenus(getRole());
		//inGame = client.getVar(Varbits.IN_GAME_BA) == 1;
		//clientThread.invoke(() -> inGame = client.getVar(Varbits.IN_GAME_BA) == 1);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(widgetsOverlay);
		overlayManager.remove(sceneOverlay);
		menu.disableSwaps();
		menu.clearHiddenMenus();
		resetWave();
		font = null;
		clockImage = null;
		scorecard = null;
		gameTimer = null;
		shiftDown = false;
		ctrlDown = false;
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			shiftDown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			ctrlDown = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			shiftDown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			ctrlDown = false;
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (!configChanged.getGroup().equals("barbarianAssault"))
		{
			return;
		}

		switch (configChanged.getKey())
		{
			case "swapLadder":
			case "swapCollectorBag":
			case "swapDestroyEggs":
				if (Boolean.valueOf(configChanged.getNewValue()))
				{
					menu.enableSwaps();
				}
				else
				{
					menu.disableSwaps();
				}
				break;

			case "defTimer":
				if (Boolean.valueOf(configChanged.getNewValue()))
				{
					addTickTimer();
				}
				else
				{
					removeTickTimer();
				}
				break;

			case "removePenanceCave":
			case "removeUnusedMenus":
			case "removeWrongPoison":
				menu.validateHiddenMenus(getRole());
				break;
		}
	}

	@Subscribe
	public void onGameStateChanged(final GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOADING)
		{
			clearAllEggMaps();
		}
	}

	@Subscribe
	public void onWidgetLoaded(WidgetLoaded event)
	{
		switch (event.getGroupId())
		{
			case WidgetID.BA_REWARD_GROUP_ID:
			{
				announceWaveTime();

				Widget rewardWidget = client.getWidget(BA_REWARD_TEXT);
				if (rewardWidget == null)
				{
					break;
				}

				Widget pointsWidget = client.getWidget(BA_REWARD_TEXT);
				if (!rewardWidget.getText().contains(ENDGAME_REWARD_NEEDLE_TEXT))
				{
					if (config.showTotalRewards() && pointsWidget != null && wave != null)
					{
						wave.setAmounts();
						wave.setPoints();

						announce(wave.getSummary());

						//The scorecard will be null if the plugin was not enabled for any part of the entire game
						if (scorecard != null)
						{
							scorecard.addWave(wave);
						}
					}
				}
				else
				{
					announceGameTime();

					if (config.showTotalRewards() && scorecard != null)
					{
						announce(scorecard.getGameSummary());
					}
				}

				resetWave();
				break;
			}
			case WidgetID.DIALOG_MINIGAME_GROUP_ID:
			{
				Widget dialogTextWidget = client.getWidget(MINIGAME_DIALOG_TEXT);
				if (!isInGame() || dialogTextWidget == null)
				{
					break;
				}

				if (dialogTextWidget.getText().startsWith("The game ended"))
				{
					resetWave();
				}
				break;
			}
			case WidgetID.BA_ATTACKER_GROUP_ID:
			{
				startWave(Role.ATTACKER);
				menu.validateHiddenMenus(Role.ATTACKER);
				break;
			}
			case WidgetID.BA_DEFENDER_GROUP_ID:
			{
				startWave(Role.DEFENDER);
				menu.validateHiddenMenus(Role.DEFENDER);
				break;
			}
			case WidgetID.BA_HEALER_GROUP_ID:
			{
				startWave(Role.HEALER);
				menu.validateHiddenMenus(Role.HEALER);
				break;
			}
			case WidgetID.BA_COLLECTOR_GROUP_ID:
			{
				startWave(Role.COLLECTOR);
				menu.validateHiddenMenus(Role.COLLECTOR);
				break;
			}
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		if (!chatMessage.getType().equals(ChatMessageType.GAMEMESSAGE))
		{
			return;
		}

		final String message = chatMessage.getMessage();
		if (message.startsWith("---- Wave:"))
		{
			stage = Integer.parseInt(message.split(" ")[BA_WAVE_NUM_INDEX]);
			if (stage == 1)
			{
				scorecard = new Scorecard(this);
				gameTimer = new Timer();
			}
		}
		else if (message.startsWith("The game ended early"))
		{
			resetWave();
		}
		else if (isInGame())
		{
			if (message.contains("exploded") && wave != null)
			{
				wave.setWrongEggs(wave.getWrongEggs() + 1);
				wave.setPositiveEggCount(wave.getPositiveEggCount() - 1);
			}
			else if (message.contains("You healed") && wave != null)
			{
				String[] tokens = message.split(" ");
				if (Integer.parseInt(tokens[2]) > 0)
				{
					int health = Integer.parseInt(tokens[2]);
					wave.setHpHealed(wave.getHpHealed() + health);
				}
			}
			else if (message.contains("the wrong type of poisoned food to use"))
			{
				final MessageNode messageNode = chatMessage.getMessageNode();
				final String nodeValue = Text.removeTags(messageNode.getValue());
				messageNode.setValue(ColorUtil.wrapWithColorTag(nodeValue, config.wrongPoisonFoodTextColor()));
				chatMessageManager.update(messageNode);
			}
		}
	}

	@Subscribe
	public void onItemSpawned(ItemSpawned itemSpawned)
	{
		if (!isInGame())
		{
			return;
		}

		HashMap<WorldPoint, Integer> eggMap = getEggMap(itemSpawned.getItem().getId());
		if (eggMap != null)
		{
			WorldPoint worldPoint = itemSpawned.getTile().getWorldLocation();
			Integer existingQuantity = eggMap.putIfAbsent(worldPoint, 1);
			if (existingQuantity != null)
			{
				eggMap.put(worldPoint, existingQuantity + 1);
			}
		}
	}

	@Subscribe
	public void onItemDespawned(ItemDespawned itemDespawned)
	{
		if (!isInGame())
		{
			return;
		}

		int itemId = itemDespawned.getItem().getId();

		if (!isItemEgg(itemId))
		{
			return;
		}

		// If an egg despawns due to time and the collector is standing over it,
		// a point will added as if the player picked it up
		HashMap<WorldPoint, Integer> eggMap = getEggMap(itemId);
		if (eggMap != null)
		{
			WorldPoint worldPoint = itemDespawned.getTile().getWorldLocation();
			if (eggMap.containsKey(worldPoint))
			{
				int quantity = eggMap.get(worldPoint);

				if (quantity > 1)
				{
					eggMap.put(worldPoint, quantity - 1);
				}
				else
				{
					eggMap.remove(worldPoint);
				}
			}
		}

		if (getRole() == Role.COLLECTOR
				&& wave != null
				&& itemDespawned.getTile().getWorldLocation().equals(client.getLocalPlayer().getWorldLocation()))
		{
			wave.setPositiveEggCount(wave.getPositiveEggCount() + 1);

			if (wave.getPositiveEggCount() > 60)
			{
				wave.setPositiveEggCount(60);
			}

			wave.setCollectedEggCount(wave.getPositiveEggCount() - wave.getWrongEggs());
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		// Keep in mind isInGame is delayed by a tick when a wave ends
		if (!isInGame() || getRole() == null)
		{
			return;
		}

		if (tickNum > 9 || tickReset)
		{
			tickNum = 0;
			tickReset = false;
		}

		if (counter != null)
		{
			counter.setCount(tickNum);
		}

		tickNum++;

		Widget weapon = client.getWidget(WidgetInfo.COMBAT_WEAPON);

		if (config.attackStyles()
				&& isInGame()
				&& getRole() == Role.ATTACKER
				&& weapon != null
				&& (weapon.getText().contains("Crystal halberd") || weapon.getText().contains("Dragon claws")))
		{
			if (originalAttackStyles == null)
			{
				ImmutableMap.Builder<WidgetInfo, Boolean> builder = new ImmutableMap.Builder<>();

				builder.put(COMBAT_STYLE_ONE, client.getWidget(COMBAT_STYLE_ONE).isHidden());
				builder.put(COMBAT_STYLE_TWO, client.getWidget(COMBAT_STYLE_TWO).isHidden());
				builder.put(COMBAT_STYLE_THREE, client.getWidget(COMBAT_STYLE_THREE).isHidden());
				builder.put(COMBAT_STYLE_FOUR, client.getWidget(COMBAT_STYLE_FOUR).isHidden());

				originalAttackStyles = builder.build();
			}
			String style = client.getWidget(Role.ATTACKER.getListen()).getText();
			int i;
			for (i = 0; i < STYLES.length; i++)
			{
				if (style.contains(STYLES[i]))
				{
					break;
				}
			}
			switch (i)
			{
				case 0: //Defensive
					client.getWidget(COMBAT_STYLE_ONE).setHidden(true);
					client.getWidget(COMBAT_STYLE_TWO).setHidden(true);
					client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(false);
					break;
				case 1: // Aggressive
					client.getWidget(COMBAT_STYLE_ONE).setHidden(true);
					client.getWidget(COMBAT_STYLE_TWO).setHidden(false);
					client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					break;
				case 2: // Controlled
					if (weapon.getText().contains("Crystal halberd"))
					{
						client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
					}
					else
					{
						client.getWidget(COMBAT_STYLE_ONE).setHidden(true);
						client.getWidget(COMBAT_STYLE_THREE).setHidden(false);
					}
					client.getWidget(COMBAT_STYLE_TWO).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					break;
				case 3: // Accurate
					if (weapon.getText().contains("Dragon claws"))
					{
						client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(COMBAT_STYLE_TWO).setHidden(true);
						client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
						client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					}
					else
					{
						client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(COMBAT_STYLE_TWO).setHidden(false);
						client.getWidget(COMBAT_STYLE_THREE).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(false);
					}
					break;
				default:
					client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
					client.getWidget(COMBAT_STYLE_TWO).setHidden(false);
					client.getWidget(COMBAT_STYLE_THREE).setHidden(false);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(false);
					break;
			}
		}
		else if (originalAttackStyles != null)
		{
			originalAttackStyles.forEach((w, b) -> client.getWidget(w).setHidden(b));
		}

		if (config.prayerMetronome() && isAnyPrayerActive())
		{
			for (int i = 0; i < config.prayerMetronomeVolume(); i++)
			{
				client.playSoundEffect(SoundEffectID.GE_INCREMENT_PLOP);
			}
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (!isInGame())
		{
			return;
		}

		NPC npc = event.getNpc();

		if (wave != null && npc != null && npc.getName().equals("Penance Healer"))
		{
			if (!healers.containsKey(npc))
			{
				healers.put(npc, new Healer(npc, healers.size(), stage));
			}
			/*
			if (checkNewSpawn(npc) || Duration.between(wave.getWaveTimer().getStartTime(), Instant.now()).getSeconds() < 16)
			{
				int spawnNumber = healers.size();
				healers.put(npc, new Healer(npc, spawnNumber, stage));
			}*/
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (!isInGame())
		{
			return;
		}
		healers.remove(event.getNpc());
	}

	@Subscribe
	public void onBeforeRender(BeforeRender event)
	{
		// TODO add an inGame check
		Widget callWidget = getRole() == null ? null : client.getWidget(getRole().getCall());
		String newCallText = callWidget == null ? null : callWidget.getText();
		int newCallColor = callWidget == null ? -1 : callWidget.getTextColor();
		Widget listenWidget = getRole() == null ? null : client.getWidget(getRole().getListen());
		String newListenText = listenWidget == null ? null : listenWidget.getText();

		boolean rebuild = false;
		if (!Objects.equals(newCallText, lastCallText) || newCallColor != lastCallColor)
		{
			if (newCallColor == COLOR_CALL_UPDATED)
			{
				if (getWave() != null)
				{
					getWave().resetCallTimer();
				}

				tickReset = true;
				menu.setHornUpdated(false);
			}

			rebuild = true;
			lastCallText = newCallText;
			lastCallColor = newCallColor;
		}

		if (!Objects.equals(newListenText, lastListenText))
		{
			rebuild = true;
			lastListenText = newListenText;
		}

		if (rebuild || menu.isRebuildForced())
		{
			menu.setRebuildForced(false);
			menu.validateHiddenMenus(role);
		}
	}

	// onMenuEntry added is only being used for conditional entry changes, all other
	// changes use MenuManager in the BarbarianAssaultMenu/Menus classes
	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (!isInGame() || (getRole() == Role.ATTACKER))
		{
			return;
		}

		final List<MenuEntry> menu = new ArrayList<>();
		final List<MenuEntry> selected = new ArrayList<>();
		final List<MenuEntry> priority = new ArrayList<>();
		MenuEntry walk = null;
		boolean prioritizeWalk = false;

		for (MenuEntry entry : client.getMenuEntries())
		{
			String option = Text.removeTags(entry.getOption()).toLowerCase();
			String target = Text.removeTags(entry.getTarget()).toLowerCase();

			if (option.equals("walk here"))
			{
				walk = entry;
			}
			else
			{
				switch (getRole())
				{
					case COLLECTOR:
						// Take option for yellow eggs should always be the first option
						if (target.equals("yellow egg"))
						{
							priority.add(entry);
							continue;
						}
						else if (config.deprioritizeIncorrectEggs()
								&& option.equals("take")
								&& (target.equals("blue egg") || target.equals("green egg") || target.equals("red egg")))
						{
							prioritizeWalk = true;

							if (lastListenText.toLowerCase().startsWith(target))
							{
								selected.add(entry);
								continue;
							}
						}

						break;
					case DEFENDER:
						// Take option for logs and hammer should always be the first option
						if (option.equals("take")
								&& (target.equals("logs") || target.equals("hammer")))
						{
							priority.add(entry);
							continue;
						}
						else if (config.deprioritizeBait()
								&& option.equals("take")
								&& (target.equals("tofu") || target.equals("crackers") || target.equals("worms")))
						{
							prioritizeWalk = true;
						}

						break;
					case HEALER:
						int identifier = entry.getIdentifier();

						if ((target.startsWith("poisoned meat ->") || target.startsWith("poisoned tofu ->") || target.startsWith("poisoned worms ->")))
						{
							// Poison should only be used on healers
							if (config.removeUnusedMenus() && !target.endsWith("penance healer"))
							{
								continue;
							}
							else if (config.ctrlHealer() && ctrlDown && identifier == lastHealerPoisoned)
							{
								selected.add(entry);
								continue;
							}
						}

						if (config.removeUnusedMenus())
						{
							// Vials that are empty should only be used on spring
							if (target.startsWith("healing vial ->") && !target.endsWith("healer spring"))
							{
								continue;
							}
							// Vials that are full should only be used on players
							else if (target.startsWith("healing vial(4) ->"))
							{
								Player[] players = client.getCachedPlayers();

								if (!(identifier >= 0 && identifier < players.length && players[identifier] != null))
								{
									continue;
								}
							}
							// Vials that are not full or empty can be used on either players or spring
							else if (target.startsWith("healing vial(") && target.contains("->"))
							{
								Player[] players = client.getCachedPlayers();

								if ((!(identifier >= 0 && identifier < players.length && players[identifier] != null))
										&& !target.endsWith("healer spring"))
								{
									continue;
								}
							}
						}

						break;
				}
			}

			menu.add(entry);
		}

		if (prioritizeWalk && walk != null)
		{
			menu.remove(walk);
			menu.add(walk);
		}

		if (!selected.isEmpty())
		{
			menu.addAll(selected);
		}

		if (!priority.isEmpty())
		{
			menu.addAll(priority);
		}

		client.setMenuEntries(menu.toArray(new MenuEntry[0]));
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (!isInGame())
		{
			return;
		}
		else if (event.getWidgetId() == LEAVE_EARLY_WIDGET_ID)
		{
			resetWave();
			return;
		}

		String target = Text.removeTags(event.getMenuTarget()).toLowerCase();
		String option = Text.removeTags(event.getMenuTarget()).toLowerCase();

		if (getRole() == Role.ATTACKER)
		{
			if (config.tagging() && (target.contains("penance ranger") || target.contains("penance fighter")))
			{
				if (option.contains("attack"))
				{
					//TODO make new map for attacker
					//foodPressed.put(event.getId(), Instant.now());
				}
			}
		}
		else if (getRole() == Role.HEALER)
		{
			if (target.equals("poisoned meat -> penance healer")
				|| target.equals("poisoned tofu -> penance healer")
				|| target.equals("poisoned worms -> penance healer"))
			{
				lastHealerPoisoned = event.getId();
				foodUsed = StringUtils.substringBefore(target.replace("oned", "."), " ->");
			}
		}
	}

	// Not sure if this is the best way of checking if poison was used.
	// Interacting changed is delayed until after the hitsplat
	@Subscribe
	public void onInteractingChanged(InteractingChanged event)
	{
		if (!isInGame() || getRole() != Role.HEALER)
		{
			return;
		}

		Actor opponent = event.getTarget();

		if (event.getSource() != client.getLocalPlayer())
		{
			return;
		}

		if (opponent == null)
		{
			if (lastInteracted != null)
			{
				Widget listen = client.getWidget(getRole().getListen());
				if (listen != null && Objects.equals(foodUsed, listen.getText().toLowerCase()) && healers.containsKey(lastInteracted))
				{
					Healer healer = healers.get(lastInteracted);
					healer.setFoodRemaining(healer.getFoodRemaining() - 1);
					// TODO add timer for healer as well
				}
			}

			lastInteracted = null;
			foodUsed = "";
		}
		else if (Objects.equals(opponent.getName(), "Penance Healer"))
		{
			lastInteracted = (NPC)opponent;
		}
	}

	private HashMap<WorldPoint, Integer> getEggMap(int itemID)
	{
		switch (itemID)
		{
			case ItemID.RED_EGG:
				return redEggs;

			case ItemID.GREEN_EGG:
				return greenEggs;

			case ItemID.BLUE_EGG:
				return blueEggs;

			case ItemID.YELLOW_EGG:
				return yellowEggs;
		}

		return null;
	}

	private boolean isAnyPrayerActive()
	{
		for (Prayer pray : Prayer.values())
		{
			if (client.isPrayerActive(pray))
			{
				return true;
			}
		}

		return false;
	}

	private void startWave(Role role)
	{
		if (this.wave != null)
		{
			return;
		}
		inGame = true;
		this.role = role;
		wave = new Wave(client);
		tickNum = 0;
		if (config.defTimer())
		{
			addTickTimer();
		}
	}

	private void resetWave()
	{
		inGame = false;
		menu.setHornUpdated(false);
		menu.setRebuildForced(false);
		removeTickTimer();
		//foodPressed.clear();
		clearAllEggMaps();
		healers.clear();
		wave = null;
		role = null;
		lastListenText = null;
		lastCallText = null;
		lastCallColor = -1;
		lastInteracted = null;
		foodUsed = "";
	}

	private void validateRole()
	{
		if (client.getWidget(Role.ATTACKER.getCall()) != null)
		{
			role = Role.ATTACKER;
		}
		else if (client.getWidget(Role.HEALER.getCall()) != null)
		{
			role = Role.HEALER;
		}
		else if (client.getWidget(Role.DEFENDER.getCall()) != null)
		{
			role = Role.DEFENDER;
		}
		else if (client.getWidget(Role.COLLECTOR.getCall()) != null)
		{
			role = Role.COLLECTOR;
		}
		else
		{
			role = null;
		}
	}

	private void addTickTimer()
	{
		if (counter == null)
		{
			int itemSpriteId = ItemID.FIGHTER_TORSO;

			BufferedImage taskImg = itemManager.getImage(itemSpriteId);
			counter = new CycleCounter(taskImg, this, tickNum);

			infoBoxManager.addInfoBox(counter);
		}
	}

	private void removeTickTimer()
	{
		if (counter != null)
		{
			infoBoxManager.removeInfoBox(counter);
			counter = null;
		}
	}

	private void announce(final ChatMessageBuilder chatMessage)
	{
		chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.CONSOLE)
				.runeLiteFormattedMessage(chatMessage.build())
				.build());
	}

	private void announceTime(String preText, String time)
	{
		final String chatMessage = new ChatMessageBuilder()
				.append(ChatColorType.NORMAL)
				.append(preText)
				.append(ChatColorType.HIGHLIGHT)
				.append(time)
				.build();

		chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.CONSOLE)
				.runeLiteFormattedMessage(chatMessage)
				.build());
	}

	private void announceWaveTime()
	{
		if (config.waveTimes() && wave != null)
		{
			announceTime("Wave " + getStage() + " duration: ", wave.getWaveTimer().getElapsedTimeFormatted());
		}
	}

	private void announceGameTime()
	{
		if (config.waveTimes() && gameTimer != null)
		{
			announceTime("Game finished, duration: ", gameTimer.getElapsedTimeFormatted());
		}
	}

	private void clearAllEggMaps()
	{
		redEggs.clear();
		greenEggs.clear();
		blueEggs.clear();
		yellowEggs.clear();
	}

	private static boolean isItemEgg(int itemId)
	{
		return itemId == ItemID.RED_EGG ||
				itemId == ItemID.GREEN_EGG ||
				itemId == ItemID.BLUE_EGG ||
				itemId == ItemID.YELLOW_EGG;
	}
}