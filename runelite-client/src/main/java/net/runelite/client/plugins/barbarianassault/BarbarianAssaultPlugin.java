/*
 * Copyright (c) 2018, Cameron <https://github.com/noremac201>
 * Copyright (c) 2018, Jacob M <https://github.com/jacoblairm>
 * Copyright (c) 2019, 7ate9 <https://github.com/se7enAte9>
 * Copyright (c) 2019, https://runelitepl.us
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

import com.google.common.collect.ImmutableMap;
import com.google.inject.Provides;

import java.awt.Font;
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
import net.runelite.api.ItemID;
import net.runelite.api.MenuEntry;
import net.runelite.api.MessageNode;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.SoundEffectID;
import net.runelite.api.Varbits;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.BeforeRender;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.events.VarbitChanged;
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


@Slf4j
@PluginDescriptor(
		name = "Barbarian Assault",
		description = "Custom barbarian assault plugin, use along with BA Tools",
		tags = {"minigame", "overlay", "timer"},
		type = PluginType.PVM // don't remove this, added this because our barbarian assault plugin is big time modified
)
public class BarbarianAssaultPlugin extends Plugin implements KeyListener
{
	private static final String ENDGAME_REWARD_NEEDLE_TEXT = "<br>5";

	private static final String[] STYLES = {"Defensive", "Aggressive", "Controlled", "Accurate"};

	private static final int COLOR_CALL_UPDATED = 16316664;

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
	private Timer callTimer = null;

	@Getter
	private int stage = -1;

	@Getter
	private BufferedImage clockImage;

	@Getter
	private Font font = null;

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

	private ImmutableMap<WidgetInfo, Boolean> originalAttackStyles = null;

	private String poisonUsed = null;

	private int lastCallColor = -1;

	private String lastCallText = null;

	private String lastListenText = null;

	private BufferedImage fighterImage, healerImage, rangerImage, runnerImage;

	private TimerBox tickCounter;

	private HashMap<TimerBox, Boolean> deathTimes = new HashMap<>();

	private HashMap<Integer, Projectile> projectiles = new HashMap<>();

	private int tickNum = 0;

	private boolean tickReset = false;

	private NPC lastInteracted = null;

	private int lastHealerPoisoned = -1;

	private boolean shiftDown = false;

	private boolean controlDown = false;

	private int inGameBit = 0;


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
		fighterImage = ImageUtil.getResourceStreamFromClass(getClass(), "fighter.png");
		healerImage = ImageUtil.getResourceStreamFromClass(getClass(), "healer.png");
		rangerImage = ImageUtil.getResourceStreamFromClass(getClass(), "ranger.png");
		runnerImage = ImageUtil.getResourceStreamFromClass(getClass(), "runner.png");
		overlayManager.add(widgetsOverlay);
		overlayManager.add(sceneOverlay);
		keyManager.registerKeyListener(this);
		validateGame();
		menu.enableSwaps();
		menu.validateHiddenMenus(getRole());

		if (isInGame() && tickCounter != null)
		{
			tickCounter.setInSync(false);
		}
		//inGame = client.getVar(Varbits.IN_GAME_BA) == 1;
		//clientThread.invoke(() -> inGame = client.getVar(Varbits.IN_GAME_BA) == 1);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(widgetsOverlay);
		overlayManager.remove(sceneOverlay);
		keyManager.unregisterKeyListener(this);
		menu.disableSwaps(true);
		menu.clearHiddenMenus();
		showRoleSprite();
		font = null;
		clockImage = null;
		fighterImage = null;
		healerImage = null;
		rangerImage = null;
		runnerImage = null;
		shiftDown = false;
		controlDown = false;
		resetWave();
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
			controlDown = true;
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
			controlDown = false;
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
			case "showTimer":
				if (config.showTimer())
				{
					hideRoleSprite();
				}
				else
				{
					showRoleSprite();
				}
				break;

			case "swapLadder":
			case "swapCollectorBag":
			case "swapDestroyEggs":
				if (Boolean.valueOf(configChanged.getNewValue()))
				{
					menu.enableSwaps();
				}
				else
				{
					menu.disableSwaps(false);
				}
				break;

			case "showDefTimer":
				if (config.showDefTimer() && getRole() == Role.DEFENDER)
				{
					addTickTimer();
				}
				else
				{
					removeTickTimer();
				}
				break;

			case "showDeathTimes":
			case "showDeathTimesMode":
				if (config.showDeathTimes()
					&& (config.showDeathTimesMode() == DeathTimesMode.INFO_BOX
					|| config.showDeathTimesMode() == DeathTimesMode.BOTH))
				{
					addDeathTimes();
				}
				else
				{
					removeDeathTimes();
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
	public void onWidgetLoaded(WidgetLoaded event)
	{
		switch (event.getGroupId())
		{
			case WidgetID.BA_REWARD_GROUP_ID:
			{
				announceWaveTime();

				Widget rewardWidget = client.getWidget(WidgetInfo.BA_REWARD_TEXT);
				if (rewardWidget == null)
				{
					break;
				}

				Widget pointsWidget = client.getWidget(WidgetInfo.BA_REWARD_TEXT);
				if (!rewardWidget.getText().contains(ENDGAME_REWARD_NEEDLE_TEXT))
				{
					if (config.showTotalRewards() && pointsWidget != null)
					{
						// The wave will be null if the plugin is disabled mid game, but
						// the points will still be accurate if it is re-enabled
						if (wave == null)
						{
							wave = new Wave(client);
						}

						wave.setAmounts();
						wave.setPoints();

						announce(wave.getSummary());

						// The scorecard will be null if the client is restart mid game
						if (scorecard != null)
						{
							scorecard.addWave(wave);
						}
					}
				}
				else
				{
					announceGameTime();

					if (config.showTotalRewards() && scorecard != null && scorecard.getNumberOfWaves() == 9)
					{
						announce(scorecard.getGameSummary());
					}
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
			else if (message.contains("the wrong type of poisoned food to use") && config.highlightNotification())
			{
				final MessageNode messageNode = chatMessage.getMessageNode();
				final String nodeValue = Text.removeTags(messageNode.getValue());
				messageNode.setValue(ColorUtil.wrapWithColorTag(nodeValue, config.highlightNotificationColor()));
				chatMessageManager.update(messageNode);
			}
			else if (message.startsWith("All of the Penance") && wave != null)
			{
				String[] tokens = message.split(" ");

				switch (tokens[4])
				{
					case "Fighters":
						deathTimes.put(new TimerBox(fighterImage, this, (int)wave.getWaveTimer().getElapsedTime()), false);
						break;

					case "Healers":
						deathTimes.put(new TimerBox(healerImage, this, (int)wave.getWaveTimer().getElapsedTime()), false);
						break;

					case "Rangers":
						deathTimes.put(new TimerBox(rangerImage, this, (int)wave.getWaveTimer().getElapsedTime()), false);
						break;

					case "Runners":
						deathTimes.put(new TimerBox(runnerImage, this, (int)wave.getWaveTimer().getElapsedTime()), false);
						break;
				}

				if (config.showDeathTimes()
						&& (config.showDeathTimesMode() == DeathTimesMode.INFO_BOX
						|| config.showDeathTimesMode() == DeathTimesMode.BOTH))
				{
					addDeathTimes();
				}

				if (config.showDeathTimes()
						&& (config.showDeathTimesMode() == DeathTimesMode.CHAT_BOX
						|| config.showDeathTimesMode() == DeathTimesMode.BOTH))
				{
					final MessageNode node = chatMessage.getMessageNode();
					final String nodeValue = Text.removeTags(node.getValue());
					// TODO use correct chat color for last parenthesis
					System.out.println(node.getValue());
					node.setValue(nodeValue + " (<col=ff0000>" + wave.getWaveTimer().getElapsedTime() + "s<col=000000>)");
					chatMessageManager.update(node);
				}
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
			projectiles.entrySet().removeIf(projectile -> projectile.getValue().getRemainingCycles() < 1);
		}

		if (tickCounter != null)
		{
			tickCounter.setCount(tickNum);
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

				builder.put(WidgetInfo.COMBAT_STYLE_ONE, client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).isHidden());
				builder.put(WidgetInfo.COMBAT_STYLE_TWO, client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).isHidden());
				builder.put(WidgetInfo.COMBAT_STYLE_THREE, client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).isHidden());
				builder.put(WidgetInfo.COMBAT_STYLE_FOUR, client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).isHidden());

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
					client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(false);
					break;
				case 1: // Aggressive
					client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(false);
					client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					break;
				case 2: // Controlled
					if (weapon.getText().contains("Crystal halberd"))
					{
						client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(true);
					}
					else
					{
						client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(true);
						client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(false);
					}
					client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(true);
					client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					break;
				case 3: // Accurate
					if (weapon.getText().contains("Dragon claws"))
					{
						client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(true);
						client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(true);
						client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(true);
					}
					else
					{
						client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(false);
						client.getWidget(WidgetInfo.COMBAT_STYLE_FOUR).setHidden(false);
					}
					break;
				default:
					client.getWidget(WidgetInfo.COMBAT_STYLE_ONE).setHidden(false);
					client.getWidget(WidgetInfo.COMBAT_STYLE_TWO).setHidden(false);
					client.getWidget(WidgetInfo.COMBAT_STYLE_THREE).setHidden(false);
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

		if (npc == null)
		{
			return;
		}

		String name = event.getNpc().getName();

		if (wave != null && name.equals("Penance Healer"))
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
		if (!Objects.equals(newCallText, lastCallText))
		{
			rebuild = true;
			lastCallText = newCallText;
		}

		if (newCallColor != lastCallColor)
		{
			if (newCallColor == COLOR_CALL_UPDATED)
			{
				callTimer = new Timer();
				tickReset = true;
				menu.setHornUpdated(false);

				if (tickCounter != null)
				{
					tickCounter.setInSync(true);
				}
			}
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

	// onMenuEntryAdded is being used for conditional entry changes that are not
	// easily achievable using MenuManager, all other changes use MenuManager in
	// the BarbarianAssaultMenu/Menus classes
	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (!isInGame())
		{
			return;
		}

		final List<MenuEntry> menu = new ArrayList<>();
		final List<MenuEntry> selected = new ArrayList<>();
		final List<MenuEntry> priority = new ArrayList<>();
		MenuEntry walk = null;
		boolean prioritizeWalk = false;

		String listen = lastListenText != null ? StringUtils.remove(lastListenText, "Pois. ").toLowerCase() : "";

		for (MenuEntry entry : client.getMenuEntries())
		{
			String option = Text.removeTags(entry.getOption()).toLowerCase();
			String target = Text.removeTags(entry.getTarget()).toLowerCase();
			int identifier = entry.getIdentifier();

			if (option.equals("walk here"))
			{
				walk = entry;
			}
			else
			{
				switch (getRole())
				{
					case ATTACKER:
						if (config.tagging() && option.equals("attack") && (target.startsWith("penance fighter") || target.startsWith("penance ranger")))
						{
							String tag = StringUtils.substringBefore(entry.getTarget(), ")");

							NPC[] npcs = client.getCachedNPCs();

							if (identifier >= 0 && identifier < npcs.length)
							{
								NPC npc = npcs[identifier];
								if (npc != null)
								{
									Projectile projectile = projectiles.get(identifier);
									if (npc.getInteracting() == null && projectile == null)
									{
										entry.setTarget((tag + ") (" + (10 - (tickNum + 1)) + ")").replace("<col=ffff00>", "<col=2bff63>"));
										selected.add(entry);
										continue;
									}
									// TODO add check to see if other attacker is attacking fighter/ranger
									// Possibly just add it to a list when the projectile is spawned
									else if (npc.getInteracting() == client.getLocalPlayer() || (projectile != null && projectile.getInteracting() == npc))
									{
										entry.setTarget((tag + ") (" + (10 - (tickNum + 1)) + ")").replace("<col=ffff00>", "<col=0000ff>"));
									}
									else
									{
										entry.setTarget((tag + ") (" + (10 - (tickNum + 1)) + ")").replace("<col=ffff00>", "<col=ff0000>"));
									}
								}
							}
						}
						break;

					case COLLECTOR:
						// Take option for yellow eggs should always be the first option
						if (option.equals("take") && target.equals("yellow egg"))
						{
							priority.add(entry);
							continue;
						}
						else if (config.deprioritizeIncorrectEggs()
								&& option.equals("take")
								&& (target.equals("blue egg") || target.equals("green egg") || target.equals("red egg")))
						{
							prioritizeWalk = true;

							if (listen.startsWith(target))
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
						if ((target.startsWith("poisoned meat ->") || target.startsWith("poisoned tofu ->") || target.startsWith("poisoned worms ->")))
						{
							// Poison should only be used on healers
							if (config.removeUnusedMenus() && !target.endsWith("penance healer"))
							{
								continue;
							}
							else if (config.controlHealer() && controlDown && identifier == lastHealerPoisoned && target.endsWith("penance healer"))
							{
								selected.add(entry);
								continue;
							}
						}
						else if (config.shiftOverstock() && target.equals("healer item machine") && shiftDown)
						{
							if (option.contains(listen))
							{
								selected.add(entry);
								continue;
							}
						}
						else if (config.removeUnusedMenus())
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

		String target = Text.removeTags(event.getMenuTarget()).toLowerCase();

		if (getRole() == Role.HEALER)
		{
			if (target.equals("poisoned meat -> penance healer")
				|| target.equals("poisoned tofu -> penance healer")
				|| target.equals("poisoned worms -> penance healer"))
			{
				lastHealerPoisoned = event.getId();
				poisonUsed = StringUtils.substringBefore(target.replace("oned", "."), " ->");
			}
		}
	}

	// Interacting changed has a slight delay until after the hitsplat is applied
	@Subscribe
	public void onInteractingChanged(InteractingChanged event)
	{
		if (!isInGame() || (getRole() != Role.HEALER && getRole() != Role.ATTACKER))
		{
			return;
		}

		Actor source = event.getSource();
		Actor opponent = event.getTarget();

		if (getRole() == Role.HEALER || source != client.getLocalPlayer() )
		{
			if (opponent == null)
			{
				if (lastInteracted != null)
				{
					Widget listen = client.getWidget(getRole().getListen());
					if (listen != null && Objects.equals(poisonUsed, listen.getText().toLowerCase()) && healers.containsKey(lastInteracted))
					{
						Healer healer = healers.get(lastInteracted);
						healer.setFoodRemaining(healer.getFoodRemaining() - 1);
						// TODO add timer for healer as well
					}
				}

				lastInteracted = null;
				poisonUsed = null;
			}
			else if (Objects.equals(opponent.getName(), "Penance Healer"))
			{
				lastInteracted = (NPC)opponent;
			}
		}
	}

	@Subscribe
	public void onProjectileSpawned(ProjectileSpawned event)
	{
		if (!isInGame())
		{
			return;
		}

		Actor target = event.getProjectile().getInteracting();
		if (target == null)
		{
			return;
		}

		String name = target.getName();
		if ("Penance Fighter".equals(name) || "Penance Ranger".equals(name))
		{
			projectiles.put(((NPC)target).getIndex(), event.getProjectile());
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		int newInGameBit = client.getVar(Varbits.IN_GAME_BA);

		if (inGameBit != newInGameBit)
		{
			if (newInGameBit == 0)
			{
				resetWave();
			}
			else
			{
				wave = new Wave(client);
			}

			inGameBit = newInGameBit;
		}
	}

	private void resetWave()
	{
		inGame = false;
		menu.setHornUpdated(false);
		menu.setRebuildForced(false);
		removeTickTimer();
		removeDeathTimes();
		deathTimes.clear();
		projectiles.clear();
		clearAllEggMaps();
		healers.clear();
		role = null;
		wave = null;
		callTimer = null;
		lastListenText = null;
		lastCallText = null;
		lastInteracted = null;
		poisonUsed = null;
		lastCallColor = -1;
		lastHealerPoisoned = -1;
		tickNum = 0;
	}

	private void startWave(Role role)
	{
		inGame = true;
		this.role = role;
		tickNum = 0;

		validateWidgets();
	}

	private void validateGame()
	{
		Role role = null;
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

		if (role != null)
		{
			inGame = true;
			this.role = role;

			Widget callWidget = getRole() == null ? null : client.getWidget(getRole().getCall());
			Widget listenWidget = getRole() == null ? null : client.getWidget(getRole().getListen());
			lastCallText = callWidget == null ? null : callWidget.getText();
			lastCallColor = callWidget == null ? -1 : callWidget.getTextColor();
			lastCallText = listenWidget == null ? null : listenWidget.getText();
		}

		validateWidgets();
	}

	private void validateWidgets()
	{
		if (config.showTimer())
		{
			hideRoleSprite();
		}
		else
		{
			showRoleSprite();
		}

		if (config.showDefTimer() && getRole() == Role.DEFENDER)
		{
			addTickTimer();
		}
		else
		{
			removeTickTimer();
		}

		if (config.showDeathTimes()
				&& (config.showDeathTimesMode() == DeathTimesMode.INFO_BOX
				|| config.showDeathTimesMode() == DeathTimesMode.BOTH))
		{
			addDeathTimes();
		}
		else
		{
			removeDeathTimes();
		}
	}

	private void addTickTimer()
	{
		if (!isInGame() || tickCounter != null)
		{
			return;
		}

		int itemSpriteId = ItemID.FIGHTER_TORSO;

		BufferedImage taskImg = itemManager.getImage(itemSpriteId);
		tickCounter = new TimerBox(taskImg, this, tickNum);

		infoBoxManager.addInfoBox(tickCounter);
	}

	private void removeTickTimer()
	{
		if (tickCounter != null)
		{
			infoBoxManager.removeInfoBox(tickCounter);
			tickCounter = null;
		}
	}

	private void addDeathTimes()
	{
		if (!isInGame())
		{
			return;
		}

		for (Map.Entry<TimerBox, Boolean> timerBox : deathTimes.entrySet())
		{
			if (!timerBox.getValue())
			{
				infoBoxManager.addInfoBox(timerBox.getKey());
				timerBox.setValue(true);
			}
		}
	}

	private void removeDeathTimes()
	{
		for (Map.Entry<TimerBox, Boolean> timerBox : deathTimes.entrySet())
		{
			if (timerBox.getValue())
			{
				infoBoxManager.removeInfoBox(timerBox.getKey());
				timerBox.setValue(false);
			}
		}
	}

	private void hideRoleSprite()
	{
		if (getRole() == null || !isInGame())
		{
			return;
		}

		Widget roleSprite = client.getWidget(role.getRoleSprite());

		if (roleSprite != null)
		{
			roleSprite.setHidden(true);
		}
	}

	private void showRoleSprite()
	{
		if (getRole() == null || !isInGame())
		{
			return;
		}

		Widget roleText = client.getWidget(role.getRoleText());
		Widget roleSprite = client.getWidget(role.getRoleSprite());

		if (roleSprite != null)
		{
			roleSprite.setHidden(false);
		}
		if (roleText != null)
		{
			roleText.setText(getRole().name());
		}
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

	private void announce(final ChatMessageBuilder chatMessage)
	{
		chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.CONSOLE)
				.runeLiteFormattedMessage(chatMessage.build())
				.build());
	}

	long getTimeToChange()
	{
		return 30 - callTimer.getElapsedTime();
	}

	private void clearAllEggMaps()
	{
		redEggs.clear();
		greenEggs.clear();
		blueEggs.clear();
		yellowEggs.clear();
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

	private boolean isItemEgg(int itemId)
	{
		return itemId == ItemID.RED_EGG ||
				itemId == ItemID.GREEN_EGG ||
				itemId == ItemID.BLUE_EGG ||
				itemId == ItemID.YELLOW_EGG;
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
}