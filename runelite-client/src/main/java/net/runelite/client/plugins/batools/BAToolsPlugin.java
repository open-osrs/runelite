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
package net.runelite.client.plugins.batools;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Provides;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.ItemID;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Prayer;
import net.runelite.api.SoundEffectID;
import net.runelite.api.Varbits;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import static net.runelite.api.widgets.WidgetID.BA_REWARD_GROUP_ID;
import net.runelite.api.widgets.WidgetInfo;
import static net.runelite.api.widgets.WidgetInfo.BA_ATK_CALL_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_ATK_LISTEN_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_ATK_ROLE_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_COLL_CALL_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_COLL_LISTEN_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_COLL_ROLE_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_DEF_CALL_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_DEF_ROLE_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_HEAL_CALL_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_HEAL_LISTEN_TEXT;
import static net.runelite.api.widgets.WidgetInfo.BA_REWARD_TEXT;
import static net.runelite.api.widgets.WidgetInfo.COMBAT_STYLE_FOUR;
import static net.runelite.api.widgets.WidgetInfo.COMBAT_STYLE_ONE;
import static net.runelite.api.widgets.WidgetInfo.COMBAT_STYLE_THREE;
import static net.runelite.api.widgets.WidgetInfo.COMBAT_STYLE_TWO;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import static net.runelite.client.util.MenuUtil.swap;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.ArrayUtils;

@Slf4j
@PluginDescriptor(
	name = "BA Tools",
	description = "Custom tools for Barbarian Assault",
	tags = {"minigame", "overlay", "timer"},
	type = PluginType.PVM
)
public class BAToolsPlugin extends Plugin implements KeyListener
{
	private boolean inGame;
	private int tickNum;
	private int pastCall = 0;
	private int currentWave = 1;
	private static final int BA_WAVE_NUM_INDEX = 2;
	private static final WorldPoint healerSpawnPoint = new WorldPoint(1898, 1586, 0);
	private final List<MenuEntry> entries = new ArrayList<>();
	private ImmutableMap<WidgetInfo, Boolean> originalAttackStyles;
	private HashMap<Integer, Instant> foodPressed = new HashMap<>();
	private CycleCounter counter;
	private Actor lastInteracted;

	private boolean shiftDown;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private BAToolsConfig config;

	@Inject
	private ItemManager itemManager;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private BAToolsOverlay overlay;

	@Getter
	private Map<NPC, Healer> healers;

	@Getter
	private Instant wave_start;

	@Inject
	private KeyManager keyManager;


	@Provides
	BAToolsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BAToolsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		healers = new HashMap<>();
		wave_start = Instant.now();
		lastInteracted = null;
		foodPressed.clear();
		keyManager.registerKeyListener(this);
	}

	@Override
	protected void shutDown() throws Exception
	{
		removeCounter();
		healers.clear();
		inGame = false;
		lastInteracted = null;
		overlayManager.remove(overlay);
		keyManager.unregisterKeyListener(this);
		shiftDown = false;
	}

	@Subscribe
	public void onWidgetLoaded(WidgetLoaded event)
	{
		if (event.getGroupId() == BA_REWARD_GROUP_ID)
		{
			Widget rewardWidget = client.getWidget(BA_REWARD_TEXT);
			if (rewardWidget != null && rewardWidget.getText().contains("<br>5"))
			{
				tickNum = 0;
			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		Widget callWidget = getWidget();

		if (callWidget != null)
		{
			if (callWidget.getTextColor() != pastCall && callWidget.getTextColor() == 16316664)
			{
				tickNum = 0;
			}
			pastCall = callWidget.getTextColor();
		}
		if (inGame && config.defTimer())
		{
			if (tickNum > 9)
			{
				tickNum = 0;
			}

			if (counter == null)
			{
				addCounter();
			}
			counter.setCount(tickNum);

			tickNum++;
		}

		Widget weapon = client.getWidget(593, 1);

		if (config.attackStyles()
			&& weapon != null
			&& inGame
			&& weapon.getText().contains("Crystal halberd") || weapon.getText().contains("Dragon claws")
			&& client.getWidget(BA_ATK_LISTEN_TEXT) != null)
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

			String style = client.getWidget(BA_ATK_LISTEN_TEXT).getText();

			if (style.contains("Defensive"))
			{
				client.getWidget(COMBAT_STYLE_ONE).setHidden(true);
				client.getWidget(COMBAT_STYLE_TWO).setHidden(true);
				client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
				client.getWidget(COMBAT_STYLE_FOUR).setHidden(false);
			}
			else if (style.contains("Aggressive"))
			{
				client.getWidget(COMBAT_STYLE_ONE).setHidden(true);
				client.getWidget(COMBAT_STYLE_TWO).setHidden(false);
				client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
				client.getWidget(COMBAT_STYLE_FOUR).setHidden(true);
			}
			else if (style.contains("Controlled"))
			{
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
				client.getWidget(COMBAT_STYLE_FOUR).setHidden(true);
			}
			else if (style.contains("Accurate") && weapon.getText().contains("Dragon claws"))
			{
				client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
				client.getWidget(COMBAT_STYLE_TWO).setHidden(true);
				client.getWidget(COMBAT_STYLE_THREE).setHidden(true);
				client.getWidget(COMBAT_STYLE_FOUR).setHidden(true);
			}
			else
			{
				client.getWidget(COMBAT_STYLE_ONE).setHidden(false);
				client.getWidget(COMBAT_STYLE_TWO).setHidden(false);
				client.getWidget(COMBAT_STYLE_THREE).setHidden(false);
				client.getWidget(COMBAT_STYLE_FOUR).setHidden(false);
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

	private Widget getWidget()
	{
		if (client.getWidget(BA_DEF_CALL_TEXT) != null)
		{
			return client.getWidget(BA_DEF_CALL_TEXT);
		}
		else if (client.getWidget(BA_ATK_CALL_TEXT) != null)
		{
			return client.getWidget(BA_ATK_CALL_TEXT);
		}
		else if (client.getWidget(BA_COLL_CALL_TEXT) != null)
		{
			return client.getWidget(BA_COLL_CALL_TEXT);
		}
		else if (client.getWidget(BA_HEAL_CALL_TEXT) != null)
		{
			return client.getWidget(BA_HEAL_CALL_TEXT);
		}
		return null;
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		int inGameBit = client.getVar(Varbits.IN_GAME_BA);

		if (inGameBit == 1 && !inGame ||
			inGameBit == 0 && inGame)
		{
			inGame = inGameBit == 1;

			if (!inGame)
			{
				pastCall = 0;
				removeCounter();
				foodPressed.clear();
			}
			else
			{
				addCounter();
			}
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (event.getType() == ChatMessageType.GAMEMESSAGE
			&& event.getMessage().startsWith("---- Wave:"))
		{
			String[] message = event.getMessage().split(" ");
			currentWave = Integer.parseInt(message[BA_WAVE_NUM_INDEX]);
			wave_start = Instant.now();
			healers.clear();
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		NPC npc = event.getNpc();

		if (inGame && isNpcHealer(npc.getId()))
		{
			if (checkNewSpawn(npc) || Duration.between(wave_start, Instant.now()).getSeconds() < 16)
			{
				int spawnNumber = healers.size();
				healers.put(npc, new Healer(npc, spawnNumber, currentWave));
			}
		}
	}

	@Subscribe
	public void onHitsplatApplied(HitsplatApplied hitsplatApplied)
	{
		Actor actor = hitsplatApplied.getActor();

		if (healers.isEmpty() && !(actor instanceof NPC) && lastInteracted == null)
		{
			return;
		}

		for (Healer healer : healers.values())
		{
			if (healer.getNpc() == actor && actor == lastInteracted)
			{
				healer.setFoodRemaining(healer.getFoodRemaining() - 1);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		healers.remove(event.getNpc());
	}

	@Subscribe
	public void onInteractingChanged(InteractingChanged event)
	{
		Actor opponent = event.getTarget();

		if (opponent instanceof NPC && isNpcHealer(((NPC) opponent).getId()) && event.getSource() != client.getLocalPlayer())
		{
			lastInteracted = opponent;
		}
	}

	private static boolean isNpcHealer(int npcId)
	{
		return npcId == NpcID.PENANCE_HEALER ||
			npcId == NpcID.PENANCE_HEALER_5766 ||
			npcId == NpcID.PENANCE_HEALER_5767 ||
			npcId == NpcID.PENANCE_HEALER_5768 ||
			npcId == NpcID.PENANCE_HEALER_5769 ||
			npcId == NpcID.PENANCE_HEALER_5770 ||
			npcId == NpcID.PENANCE_HEALER_5771 ||
			npcId == NpcID.PENANCE_HEALER_5772 ||
			npcId == NpcID.PENANCE_HEALER_5773 ||
			npcId == NpcID.PENANCE_HEALER_5774;
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (config.calls() && getWidget() != null && event.getTarget().endsWith("horn") && !event.getTarget().contains("Unicorn"))
		{
			MenuEntry[] menuEntries = client.getMenuEntries();
			Widget callWidget = getWidget();
			String call = Calls.getOption(callWidget.getText());
			MenuEntry correctCall = null;

			entries.clear();
			for (MenuEntry entry : menuEntries)
			{
				String option = entry.getOption();
				if (option.equals(call))
				{
					correctCall = entry;
				}
				else if (!option.startsWith("Tell-"))
				{
					entries.add(entry);
				}
			}

			if (correctCall != null) //&& callWidget.getTextColor()==16316664)
			{
				entries.add(correctCall);
				client.setMenuEntries(entries.toArray(new MenuEntry[0]));
			}
		}

		final int itemId = event.getIdentifier();
		String option = Text.removeTags(event.getOption()).toLowerCase();
		String target = Text.removeTags(event.getTarget()).toLowerCase();


		if (config.swapLadder() && option.equals("climb-down") && target.equals("ladder"))
		{
			swap(client, "quick-start", option, target);
		}
		else if (config.removeBA() && client.getVar(Varbits.IN_GAME_BA) == 1 && !option.contains("tell-"))//if in barbarian assault and menu isnt from a horn
		{
			if (itemId == ItemID.LOGS && !target.contains("healing vial"))
			{
				if (client.getWidget(BA_DEF_ROLE_TEXT) == null)
				{
					remove(new String[]{"take", "light"}, target);
				}
				else //remove "Light" option (and "Take" option if not defender).
				{
					remove("light", target);
				}
			}
			else if (option.equals("use"))
			{
				if (config.removeHealWrongFood())
				{
					Widget healer = client.getWidget(BA_HEAL_LISTEN_TEXT);
					if (healer != null)
					{
						String item = target.split("-")[0].trim();
						List<String> poison = Arrays.asList("poisoned tofu", "poisoned meat", "poisoned worms");
						List<String> vials = Arrays.asList("healing vial", "healing vial(1)", "healing vial(2)", "healing vial(3)", "healing vial(4)");//"healing vial(4)"
						if (poison.contains(item))
						{
							//if item is a poison item
							int calledPoison = 0;
							switch (healer.getText())//choose which poison to hide the use/destroy option for
							{
								case "Pois. Tofu":
									calledPoison = ItemID.POISONED_TOFU;
									break;
								case "Pois. Meat":
									calledPoison = ItemID.POISONED_MEAT;
									break;
								case "Pois. Worms":
									calledPoison = ItemID.POISONED_WORMS;
									break;
							}
							System.out.println(target.equals(item));
							if (target.equals(item))//if targeting the item itself
							{
								if (calledPoison != 0 && itemId != calledPoison)//if no call or chosen item is not the called one
								{
									remove(new String[]{"use", "destroy", "examine"}, target);//remove options
								}
							}
							else if (!target.contains("penance healer"))
							{
								remove(option, target);
							}
						}
						else if (vials.contains(item))//if item is the healer's healing vial
						{

							if (!target.equals(item))//if target is not the vial itself
							{

								if (!target.contains("level") || target.contains("penance") || target.contains("queen spawn"))//if someone has "penance" or "queen spawn" in their name, gg...
								{
									remove(option, target);
								}
							}
						}
					}
				}
			}
			else if (option.equals("attack") && client.getWidget(BA_ATK_ROLE_TEXT) == null && !target.equals("queen spawn"))//if not attacker
			{
				//remove attack option from everything but queen spawns
				remove(option, target);
			}
			else if ((option.equals("fix") || (option.equals("block") && target.equals("penance cave"))) && client.getWidget(BA_DEF_ROLE_TEXT) == null)//if not defender
			{
				//the check for option requires checking target as well because defensive attack style option is also called "block".
				remove(option, target);
			}
			else if ((option.equals("load")) && client.getWidget(BA_COLL_ROLE_TEXT) == null)//if not collector, remove hopper options
			{
				remove(new String[]{option, "look-in"}, target);
			}
			else if (config.removeWrongEggs() && option.equals("take"))
			{
				Widget eggToColl = client.getWidget(BA_COLL_LISTEN_TEXT);
				if (eggToColl != null)//if we're a collector
				{
					List<Integer> eggsToHide = new ArrayList<>();
					eggsToHide.add(ItemID.HAMMER);
					switch (eggToColl.getText())//choose which eggs to hide take option for
					{
						case "Red eggs":
							eggsToHide.add(ItemID.BLUE_EGG);
							eggsToHide.add(ItemID.GREEN_EGG);
							break;
						case "Blue eggs":
							eggsToHide.add(ItemID.RED_EGG);
							eggsToHide.add(ItemID.GREEN_EGG);
							break;
						case "Green eggs":
							eggsToHide.add(ItemID.RED_EGG);
							eggsToHide.add(ItemID.BLUE_EGG);
							break;
					}
					if (eggsToHide.contains(itemId))
					{
						remove(option, target);//hide wrong eggs
					}
				}
				else
				{
					List<Integer> defenderItems = Arrays.asList(ItemID.HAMMER, ItemID.TOFU, ItemID.CRACKERS, ItemID.WORMS);//logs are handled separately due to hiding "light" option too.
					if (client.getWidget(BA_DEF_ROLE_TEXT) == null || !defenderItems.contains(itemId))//if not defender, or item is not a defenderItem
					{
						remove(option, target);//hide everything except hammer/logs and bait if Defender
					}
				}
			}
		}


		if (inGame && config.healerMenuOption() && event.getTarget().contains("Penance Healer"))
		{

			MenuEntry[] menuEntries = client.getMenuEntries();
			MenuEntry lastEntry = menuEntries[menuEntries.length - 1];
			String targett = lastEntry.getTarget();

			if (foodPressed.containsKey(lastEntry.getIdentifier()))
			{
				lastEntry.setTarget(lastEntry.getTarget().split("\\(")[0] + "(" + Duration.between(foodPressed.get(lastEntry.getIdentifier()), Instant.now()).getSeconds() + ")");
				if (Duration.between(foodPressed.get(lastEntry.getIdentifier()), Instant.now()).getSeconds() > 20)
				{
					lastEntry.setTarget(lastEntry.getTarget().replace("<col=ffff00>", "<col=2bff63>"));
				}
			}
			else
			{
				lastEntry.setTarget(targett.replace("<col=ffff00>", "<col=2bff63>"));

			}

			client.setMenuEntries(menuEntries);
		}

		if (client.getWidget(BA_COLL_LISTEN_TEXT) != null && inGame && config.eggBoi() && event.getTarget().endsWith("egg") && shiftDown)
		{
			String[] currentCall = client.getWidget(BA_COLL_LISTEN_TEXT).getText().split(" ");

			MenuEntry[] menuEntries = client.getMenuEntries();
			MenuEntry correctEgg = null;
			entries.clear();

			for (MenuEntry entry : menuEntries)
			{
				if (entry.getTarget().contains(currentCall[0]) && entry.getOption().equals("Take"))
				{
					correctEgg = entry;
				}
				else if (!entry.getOption().startsWith("Take"))
				{
					entries.add(entry);
				}
			}
			if (correctEgg != null)
			{
				entries.add(correctEgg);
			}
			client.setMenuEntries(entries.toArray(new MenuEntry[0]));
		}

		if (client.getWidget(BA_HEAL_LISTEN_TEXT) != null && inGame && config.osHelp() && event.getTarget().equals("<col=ffff>Healer item machine") && shiftDown)
		{
			String[] currentCall = client.getWidget(BA_HEAL_LISTEN_TEXT).getText().split(" ");

			if (!currentCall[0].contains("Pois."))
			{
				return;
			}

			MenuEntry[] menuEntries = client.getMenuEntries();
			MenuEntry correctEgg = null;
			entries.clear();

			for (MenuEntry entry : menuEntries)
			{
				if (entry.getOption().equals("Take-" + currentCall[1]))
				{
					correctEgg = entry;
				}
			}
			if (correctEgg != null)
			{
				entries.add(correctEgg);
				client.setMenuEntries(entries.toArray(new MenuEntry[0]));
			}
		}

	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (!config.healerMenuOption() || !event.getMenuTarget().contains("Penance Healer") || client.getWidget(BA_HEAL_CALL_TEXT) == null)
		{
			return;
		}

		String currentCall = client.getWidget(BA_HEAL_CALL_TEXT).getText();
		String target = event.getMenuTarget();

		if ((currentCall.equals("Pois. Worms") && (target.contains("Poisoned worms") && target.contains("->") && target.contains("Penance Healer")))
			|| (currentCall.equals("Pois. Meat") && (target.contains("Poisoned meat") && target.contains("->") && target.contains("Penance Healer")))
			|| (currentCall.equals("Pois. Tofu") && (target.contains("Poisoned tofu") && target.contains("->") && target.contains("Penance Healer"))))
		{
			foodPressed.put(event.getId(), Instant.now());
		}

		if (target.contains("->") && target.contains("Penance Healer"))
		{
			foodPressed.put(event.getId(), Instant.now());
		}
	}

	public void onConfigChanged(ConfigChanged event)
	{
		if (counter != null && !config.defTimer())
		{
			removeCounter();
		}
	}

	private void addCounter()
	{
		if (!config.defTimer() || counter != null)
		{
			return;
		}

		int itemSpriteId = ItemID.FIGHTER_TORSO;

		BufferedImage taskImg = itemManager.getImage(itemSpriteId);
		counter = new CycleCounter(taskImg, this, tickNum);

		infoBoxManager.addInfoBox(counter);
	}

	private void removeCounter()
	{
		if (counter == null)
		{
			return;
		}

		infoBoxManager.removeInfoBox(counter);
		counter = null;
	}

	private void remove(String option, String target)
	{
		MenuEntry[] entries = client.getMenuEntries();
		int idx = searchIndex(entries, option, target);
		if (idx >= 0 && entries[idx] != null)
		{
			entries = ArrayUtils.removeElement(entries, entries[idx]);
			client.setMenuEntries(entries);
		}
	}

	private void remove(String[] options, String target)
	{
		MenuEntry[] entries = client.getMenuEntries();
		for (String option : options)
		{
			int idx = searchIndex(entries, option, target);
			if (idx >= 0 && entries[idx] != null)
			{
				entries = ArrayUtils.removeElement(entries, entries[idx]);
			}
		}

		client.setMenuEntries(entries);
	}

	private int searchIndex(MenuEntry[] entries, String option, String target)
	{
		for (int i = entries.length - 1; i >= 0; i--)
		{
			MenuEntry entry = entries[i];
			String entryOption = Text.removeTags(entry.getOption()).toLowerCase();
			String entryTarget = Text.removeTags(entry.getTarget()).toLowerCase();

			if (entryOption.equals(option) && entryTarget.equals(target))
			{
				return i;
			}
		}

		return -1;
	}

	private boolean checkNewSpawn(NPC npc)
	{
		for (WorldPoint p : WorldPoint.toLocalInstance(client, healerSpawnPoint))
		{
			if (p.distanceTo(npc.getWorldLocation()) < 5)
			{
				return true;
			}
		}
		return false;
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
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			shiftDown = false;
		}
	}

	private boolean isAnyPrayerActive()
	{
		for (Prayer pray : Prayer.values())//Check if any prayers are active
		{
			if (client.isPrayerActive(pray))
			{
				return true;
			}
		}

		return false;
	}
}