/*
 * Copyright (c) 2018, Kamiel
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
package net.runelite.client.plugins.raids;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.inject.Binder;
import com.google.inject.Provides;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import static net.runelite.api.Perspective.SCENE_SIZE;
import static net.runelite.api.SpriteID.TAB_QUESTS_BROWN_RAIDING_PARTY;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InstanceTemplates;
import net.runelite.api.ItemID;
import net.runelite.api.MenuOpcode;
import net.runelite.api.MessageNode;
import net.runelite.api.NullObjectID;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.SpriteID;
import net.runelite.api.Tile;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatCommandManager;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ChatInput;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.raids.solver.Layout;
import net.runelite.client.plugins.raids.solver.LayoutSolver;
import net.runelite.client.plugins.raids.solver.RotationSolver;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.WidgetOverlay;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.ws.PartyMember;
import net.runelite.client.ws.PartyService;
import net.runelite.client.ws.WSClient;
import net.runelite.http.api.chat.ChatClient;
import net.runelite.http.api.chat.LayoutRoom;
import net.runelite.http.api.ws.messages.party.PartyChatMessage;
import org.apache.commons.lang3.StringUtils;
import static net.runelite.api.util.Text.sanitize;
import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

@PluginDescriptor(
	name = "CoX Scouter",
	description = "Show helpful information for the Chambers of Xeric raid",
	tags = {"combat", "raid", "overlay", "pve", "pvm", "bosses", "cox", "olm", "scout"},
	type = PluginType.PVM,
	enabledByDefault = false
)
@Singleton
@Slf4j
@Getter(AccessLevel.PACKAGE)
public class RaidsPlugin extends Plugin
{
	static final DecimalFormat POINTS_FORMAT = new DecimalFormat("#,###");
	private static final int LOBBY_PLANE = 3;
	private static final String RAID_START_MESSAGE = "The raid has begun!";
	private static final String LEVEL_COMPLETE_MESSAGE = "level complete!";
	private static final String RAID_COMPLETE_MESSAGE = "Congratulations - your raid is complete!";
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###.##");
	private static final Pattern ROTATION_REGEX = Pattern.compile("\\[(.*?)]");
	private static final String LAYOUT_COMMAND = "!layout";
	private static final Pattern RAID_COMPLETE_REGEX = Pattern.compile("Congratulations - your raid is complete! Duration: ([0-9:]+)");
	private static final ImmutableSet<String> GOOD_CRABS_FIRST = ImmutableSet.of(
		"FSCCP.PCSCF - #WNWSWN#ESEENW", //both good crabs
		"SCSPF.CCSPF - #ESWWNW#ESENES", //both good crabs
		"SPCFC.CSPCF - #WWNEEE#WSWNWS", //both good crabs
		"SCFCP.CSCFS - #ENEESW#ENWWSW", //good crabs
		"SCPFC.CCSSF - #NEESEN#WSWWNE", //good crabs
		"SCFPC.CSPCF - #WSWWNE#WSEENE" //good crabs first rare crabs second
	);
	private static final ImmutableSet<String> GOOD_CRABS_SECOND = ImmutableSet.of(
		"FSCCP.PCSCF - #WNWSWN#ESEENW", //both good crabs
		"SCSPF.CCSPF - #ESWWNW#ESENES", //both good crabs
		"SPCFC.CSPCF - #WWNEEE#WSWNWS", //both good crabs
		"SCPFC.CSPCF - #NEEESW#WWNEEE", //rare crabs first good crabs second
		"SCFCP.CCSPF - #ESEENW#ESWWNW", //bad crabs first good crabs second
		"SCPFC.CSPSF - #WWSEEE#NWSWWN", //bad crabs first good crabs second
		"SFCCS.PCPSF - #ENWWSW#ENESEN", //bad crabs first good crabs second
		"SPCFC.SCCPF - #ESENES#WWWNEE", //bad crabs first good crabs second
		"SPSFP.CCCSF - #NWSWWN#ESEENW", //bad crabs first good crabs second
		"FSCCP.PCSCF - #ENWWWS#NEESEN", //bad crabs first good crabs second
		"FSCCS.PCPSF - #WSEEEN#WSWNWS" //bad crabs first good crabs second
	);
	private static final ImmutableSet<String> RARE_CRABS_FIRST = ImmutableSet.of(
		"SCPFC.CSPCF - #NEEESW#WWNEEE", //rare crabs first good crabs second
		"SCPFC.PCSCF - #WNEEES#NWSWNW", //rare crabs first bad crabs second
		"SCPFC.CCPSF - #NWWWSE#WNEESE" //both rare crabs
	);
	private static final ImmutableSet<String> RARE_CRABS_SECOND = ImmutableSet.of(
		"SCPFC.CCPSF - #NWWWSE#WNEESE", //both rare crabs
		"FSCPC.CSCPF - #WNWWSE#EENWWW", //bad crabs first rare crabs second
		"SCFPC.PCCSF - #WSEENE#WWWSEE", //bad crabs first rare crabs second
		"SCFPC.SCPCF - #NESENE#WSWWNE", //bad crabs first rare crabs second
		"SFCCP.CSCPF - #WNEESE#NWSWWN", //bad crabs first rare crabs second
		"SCFPC.CSPCF - #WSWWNE#WSEENE" //good crabs first rare crabs second
	);
	private static final Pattern PUZZLES = Pattern.compile("Puzzle - (\\w+)");

	@Getter(AccessLevel.NONE)
	@Inject
	private ChatMessageManager chatMessageManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private InfoBoxManager infoBoxManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private Client client;

	@Getter(AccessLevel.NONE)
	@Inject
	private RaidsConfig config;

	@Getter(AccessLevel.NONE)
	@Inject
	private OverlayManager overlayManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private RaidsOverlay overlay;

	@Getter(AccessLevel.NONE)
	@Inject
	private RaidsPointsOverlay pointsOverlay;

	@Getter(AccessLevel.NONE)
	@Inject
	private RaidsPartyOverlay partyOverlay;

	@Getter(AccessLevel.NONE)
	@Inject
	private LayoutSolver layoutSolver;

	@Getter(AccessLevel.NONE)
	@Inject
	private SpriteManager spriteManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private ClientThread clientThread;

	@Getter(AccessLevel.NONE)
	@Inject
	private TooltipManager tooltipManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private ClientToolbar clientToolbar;

	@Getter(AccessLevel.NONE)
	@Inject
	private ItemManager itemManager;

	@Getter(AccessLevel.NONE)
	@Inject
	private EventBus eventBus;

	private boolean raidStarted;

	@Inject
	private PartyService party;

	@Inject
	private WSClient ws;

	@Inject
	private ChatCommandManager chatCommandManager;

	@Inject
	private ChatClient chatClient;

	@Inject
	private ScheduledExecutorService scheduledExecutorService;

	@Getter
	private final List<String> roomWhitelist = new ArrayList<>();

	@Getter
	private final List<String> roomBlacklist = new ArrayList<>();

	@Getter
	private final List<String> rotationWhitelist = new ArrayList<>();

	@Getter
	private final List<String> layoutWhitelist = new ArrayList<>();

	@Getter
	private Raid raid;

	private boolean inRaidChambers;
	private boolean enhanceScouterTitle;
	private boolean hideBackground;
	private boolean raidsTimer;
	private boolean pointsMessage;
	private boolean ptsHr;
	private boolean scoutOverlay;
	private boolean scoutOverlayAtBank;
	private boolean scoutOverlayInRaid;
	private boolean displayFloorBreak;
	private boolean showRecommendedItems;
	private boolean alwaysShowWorldAndCC;
	private boolean colorTightrope;
	private boolean crabHandler;
	private boolean enableRotationWhitelist;
	private boolean enableLayoutWhitelist;
	private boolean showScavsFarms;
	private boolean scavsBeforeIce;
	private boolean scavsBeforeOlm;
	private boolean hideRopeless;
	private boolean hideVanguards;
	private boolean hideUnknownCombat;
	private boolean partyDisplay;
	private int startPlayerCount;
	private int upperTime = -1;
	private int middleTime = -1;
	private int lowerTime = -1;
	private int raidTime = -1;
	private Color goodCrabColor;
	private Color rareCrabColor;
	private Color scavPrepColor;
	private Color tightropeColor;
	private boolean displayLayoutMessage;
	private String layoutMessage;
	private RaidsTimer timer;
	private WidgetOverlay widgetOverlay;
	private NavigationButton navButton;
	private String recommendedItems;
	private String whitelistedRooms;
	private String whitelistedRotations;
	private String whitelistedLayouts;
	private String blacklistedRooms;
	private String tooltip;
	private String goodCrabs;
	private String layoutFullCode;
	private List<String> partyMembers = new ArrayList<>();
	private List<String> startingPartyMembers = new ArrayList<>();
	private Map<String, List<Integer>> recommendedItemsList = new HashMap<>();
	private Set<String> missingPartyMembers = new HashSet<>();

	@Provides
	RaidsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RaidsConfig.class);
	}

	@Override
	public void configure(Binder binder)
	{
		binder.bind(RaidsOverlay.class);
	}

	@Override
	protected void startUp()
	{
		updateConfig();

		overlayManager.add(overlay);
		overlayManager.add(pointsOverlay);
		if (this.partyDisplay)
		{
			overlayManager.add(partyOverlay);
		}
		updateLists();
		clientThread.invokeLater(() -> checkRaidPresence(true));
		chatCommandManager.registerCommandAsync(LAYOUT_COMMAND, this::lookupRaid, this::submitRaid);
		widgetOverlay = overlayManager.getWidgetOverlay(WidgetInfo.RAIDS_POINTS_INFOBOX);
		RaidsPanel panel = injector.getInstance(RaidsPanel.class);
		panel.init();
		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(this.getClass(), "instancereloadhelper.png");
		navButton = NavigationButton.builder()
			.tooltip("Raids Reload")
			.icon(icon)
			.priority(8)
			.panel(panel)
			.build();
		clientToolbar.addNavigation(navButton);
	}

	private void lookupRaid(ChatMessage chatMessage, String s)
	{
		ChatMessageType type = chatMessage.getType();

		final String player;
		if (type.equals(ChatMessageType.PRIVATECHATOUT))
		{
			player = client.getLocalPlayer().getName();
		}
		else
		{
			player = sanitize(chatMessage.getName());
		}

		LayoutRoom[] layout;
		try
		{
			layout = chatClient.getLayout(player);
		}
		catch (IOException ex)
		{
			log.debug("unable to lookup layout", ex);
			return;
		}

		if (layout == null || layout.length == 0)
		{
			return;
		}

		String layoutMessage = Joiner.on(", ").join(Arrays.stream(layout)
				.map(l -> RaidRoom.valueOf(l.name()))
				.filter(room -> room.getType() == RoomType.COMBAT || room.getType() == RoomType.PUZZLE)
				.map(RaidRoom::getName)
				.toArray());

		String response = new ChatMessageBuilder()
				.append(ChatColorType.HIGHLIGHT)
				.append("Layout: ")
				.append(ChatColorType.NORMAL)
				.append(layoutMessage)
				.build();

		log.debug("Setting response {}", response);
		final MessageNode messageNode = chatMessage.getMessageNode();
		messageNode.setRuneLiteFormatMessage(response);
		chatMessageManager.update(messageNode);
		client.refreshChat();
	}

	private boolean submitRaid(ChatInput chatInput, String s)
	{
		if (raid == null)
		{
			return false;
		}

		final String playerName = client.getLocalPlayer().getName();
		List<RaidRoom> orderedRooms = raid.getOrderedRooms();

		LayoutRoom[] layoutRooms = orderedRooms.stream()
				.map(room -> LayoutRoom.valueOf(room.name()))
				.toArray(LayoutRoom[]::new);

		scheduledExecutorService.execute(() ->
		{
			try
			{
				chatClient.submitLayout(playerName, layoutRooms);
			}
			catch (Exception ex)
			{
				log.warn("unable to submit layout", ex);
			}
			finally
			{
				chatInput.resume();
			}
		});

		return true;
	}

	@Override
	protected void shutDown()
	{
		chatCommandManager.unregisterCommand(LAYOUT_COMMAND);
		overlayManager.remove(overlay);
		overlayManager.remove(pointsOverlay);
		clientToolbar.removeNavigation(navButton);
		if (this.partyDisplay)
		{
			overlayManager.remove(partyOverlay);
		}
		infoBoxManager.removeInfoBox(timer);
		final Widget widget = client.getWidget(WidgetInfo.RAIDS_POINTS_INFOBOX);
		if (widget != null)
		{
			widget.setHidden(false);
		}
		reset();
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("raids"))
		{
			return;
		}

		updateConfig();
		updateLists();

		if (event.getKey().equals("raidsTimer"))
		{
			updateInfoBoxState();
			return;
		}

		if (event.getKey().equals("partyDisplay"))
		{
			if (this.partyDisplay)
			{
				overlayManager.add(partyOverlay);
			}
			else
			{
				overlayManager.remove(partyOverlay);
			}
		}

		clientThread.invokeLater(() -> checkRaidPresence(true));
	}

	@Subscribe
	private void onWidgetHiddenChanged(WidgetHiddenChanged event)
	{
		if (!inRaidChambers || event.isHidden())
		{
			return;
		}

		Widget widget = event.getWidget();

		if (widget == client.getWidget(WidgetInfo.RAIDS_POINTS_INFOBOX))
		{
			widget.setHidden(true);
		}
	}

	@Subscribe
	private void onVarbitChanged(VarbitChanged event)
	{
		checkRaidPresence(false);
		if (this.partyDisplay)
		{
			updatePartyMembers(false);
		}
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		if (inRaidChambers && event.getType() == ChatMessageType.FRIENDSCHATNOTIFICATION)
		{
			String message = Text.removeTags(event.getMessage());
			Matcher matcher;

			if (message.startsWith(RAID_START_MESSAGE))
			{
				if (this.raidsTimer)
				{
					timer = new RaidsTimer(this, Instant.now());
					spriteManager.getSpriteAsync(TAB_QUESTS_BROWN_RAIDING_PARTY, 0, timer);
					infoBoxManager.addInfoBox(timer);
				}
				if (this.partyDisplay)
				{
					// Base this on visible players since party size shows people outside the lobby
					// and they did not get to come on the raid
					List<Player> players = client.getPlayers();
					startPlayerCount = players.size();

					partyMembers.clear();
					startingPartyMembers.clear();
					missingPartyMembers.clear();

					startingPartyMembers.addAll(Lists.transform(players, Player::getName));
					partyMembers.addAll(startingPartyMembers);
				}
			}

			if (timer != null && message.contains(LEVEL_COMPLETE_MESSAGE))
			{
				timer.timeFloor();
			}

			if (message.startsWith(RAID_COMPLETE_MESSAGE))
			{
				if (timer != null)
				{
					timer.timeOlm();
					timer.setStopped(true);
				}
				updateTooltip();
			}
			matcher = RAID_COMPLETE_REGEX.matcher(message);
			if (matcher.find())
			{
				raidTime = timeToSeconds(matcher.group(1));
				int timesec = timeToSeconds(matcher.group(1));
				updateTooltip();

				if (this.pointsMessage)
				{
					int totalPoints = client.getVar(Varbits.TOTAL_POINTS);
					int personalPoints = client.getVar(Varbits.PERSONAL_POINTS);
					int partySize = client.getVar(Varbits.RAID_PARTY_SIZE);

					double percentage = personalPoints / (totalPoints / 100.0);

					String chatMessage = new ChatMessageBuilder()
						.append(ChatColorType.NORMAL)
						.append("Total points: ")
						.append(ChatColorType.HIGHLIGHT)
						.append(POINTS_FORMAT.format(totalPoints))
						.append(ChatColorType.NORMAL)
						.append(", Personal points: ")
						.append(ChatColorType.HIGHLIGHT)
						.append(POINTS_FORMAT.format(personalPoints))
						.append(ChatColorType.NORMAL)
						.append(" (")
						.append(ChatColorType.HIGHLIGHT)
						.append(DECIMAL_FORMAT.format(percentage))
						.append(ChatColorType.NORMAL)
						.append("%)")
						.build();

					chatMessageManager.queue(QueuedMessage.builder()
						.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
						.runeLiteFormattedMessage(chatMessage)
						.build());
					if (this.ptsHr)
					{
						String ptssolo;
						{
							ptssolo = POINTS_FORMAT.format(((float) personalPoints / (float) timesec) * 3600);
						}

						String ptsteam;
						{
							ptsteam = POINTS_FORMAT.format(((float) totalPoints / (float) timesec) * 3600);
						}

						String ptssplit;
						{
							ptssplit = POINTS_FORMAT.format(((totalPoints / (float) timesec) * 3600) / (partySize));
						}


						String chatMessage2 = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("Solo Pts/Hr: ")
							.append(ChatColorType.HIGHLIGHT)
							.append(ptssolo)
							.append(ChatColorType.NORMAL)
							.append("Team Pts/Hr: ")
							.append(ChatColorType.HIGHLIGHT)
							.append(ptsteam)
							.build();

						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(chatMessage2)
							.build());

						String chatMessage3 = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("Split Pts/Hr: ")
							.append(ChatColorType.HIGHLIGHT)
							.append(ptssplit)
							.build();

						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(chatMessage3)
							.build());
					}
				}
			}
		}
	}

	@Subscribe
	private void onClientTick(ClientTick event)
	{
		if (!this.raidsTimer
			|| !client.getGameState().equals(GameState.LOGGED_IN)
			|| tooltip == null)
		{
			return;
		}

		final Point mousePosition = client.getMouseCanvasPosition();
		if (widgetOverlay.getBounds().contains(mousePosition.getX(), mousePosition.getY()))
		{
			tooltipManager.add(new Tooltip(tooltip));
		}
	}

	@Subscribe
	private void onOverlayMenuClicked(OverlayMenuClicked event)
	{
		OverlayMenuEntry entry = event.getEntry();
		if (entry.getMenuOpcode() == MenuOpcode.RUNELITE_OVERLAY)
		{
			if (entry.getTarget().equals("Raids party overlay"))
			{
				switch (entry.getOption())
				{
					case RaidsPartyOverlay.PARTY_OVERLAY_RESET:
						startingPartyMembers.clear();
						updatePartyMembers(true);
						missingPartyMembers.clear();
						break;
					case RaidsPartyOverlay.PARTY_OVERLAY_REFRESH:
						updatePartyMembers(true);
						break;
					default:
						break;
				}
			}
			else if (entry.getOption().equals(RaidsOverlay.BROADCAST_ACTION) && event.getOverlay() == overlay)
			{
				sendRaidLayoutMessage();
			}
		}
	}

	private void updatePartyMembers(boolean force)
	{
		int partySize = client.getVar(Varbits.RAID_PARTY_SIZE);
		if (partySize <= 0)
		{
			return;
		}

		if (startingPartyMembers.size() == partySize && !force)
		{
			// Skip update if the part is as big as when we started
			missingPartyMembers.clear(); // Clear missing members in case someone came back
			return;
		}

		// Only update while in raid
		if (client.getVar(VarPlayer.IN_RAID_PARTY) == -1 || force)
		{
			Widget[] widgets;
			try
			{
				widgets = client.getWidget(WidgetInfo.RAIDING_PARTY).getStaticChildren()[2].getStaticChildren()[3].getDynamicChildren();
			}
			catch (NullPointerException e)
			{
				return; // Raid widget not loaded
			}

			partyMembers.clear();
			for (Widget widget : widgets)
			{
				if (widget == null || widget.getText() == null)
				{
					continue;
				}

				String name = widget.getName();

				if (name.length() > 1)
				{
					partyMembers.add(name.substring(name.indexOf('>') + 1, name.indexOf('<', 1)));
				}
			}

			// If we don't have any starting members, update starting members
			if (startingPartyMembers.size() == 0 || force)
			{
				missingPartyMembers.clear();
				startingPartyMembers.clear();
				startingPartyMembers.addAll(partyMembers);
			}
			else
			{

				// Check if anyone left
				if (startingPartyMembers.size() > partyMembers.size())
				{
					missingPartyMembers.clear();
					missingPartyMembers.addAll(startingPartyMembers);
					missingPartyMembers.removeAll(partyMembers);
				}
			}
		}
	}

	void checkRaidPresence(boolean force)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		boolean setting = client.getVar(Varbits.IN_RAID) == 1;

		if (force || inRaidChambers != setting)
		{
			inRaidChambers = setting;
			updateInfoBoxState();

			if (inRaidChambers)
			{
				raid = buildRaid();

				if (raid == null)
				{
					log.debug("Failed to build raid");
					return;
				}

				Layout layout = layoutSolver.findLayout(raid.toCode());

				if (layout == null)
				{
					log.debug("Could not find layout match");
					return;
				}

				layoutFullCode = layout.getCode();
				raid.updateLayout(layout);
				RaidRoom[] rooms = raid.getCombatRooms();
				RotationSolver.solve(rooms);
				raid.setCombatRooms(rooms);
				setOverlayStatus(true);
				if (this.displayLayoutMessage)
				{
					sendRaidLayoutMessage();
				}
				Matcher puzzleMatch = PUZZLES.matcher(raid.getFullRotationString());
				final List<String> puzzles = new ArrayList<>();
				while (puzzleMatch.find())
				{
					puzzles.add(puzzleMatch.group());
				}
				if (raid.getFullRotationString().contains("Crabs"))
				{
					switch (puzzles.size())
					{
						case 1:
							goodCrabs = handleCrabs(puzzles.get(0));
							break;
						case 2:
							goodCrabs = handleCrabs(puzzles.get(0), puzzles.get(1));
							break;
						case 3:
							goodCrabs = handleCrabs(puzzles.get(0), puzzles.get(1), puzzles.get(2));
							break;
					}
				}
			}
			else if (!this.scoutOverlayAtBank)
			{
				setOverlayStatus(false);
			}
		}

		// If we left party raid was started or we left raid
		if (client.getVar(VarPlayer.IN_RAID_PARTY) == -1 && (!inRaidChambers || !this.scoutOverlayInRaid))
		{
			setOverlayStatus(false);
			raidStarted = false;
		}
	}

	private void sendRaidLayoutMessage()
	{
		final String layout = getRaid().getLayout().toCodeString();
		final String rooms = getRaid().toRoomString();
		final String raidData = "[" + layout + "]: " + rooms;
		layoutMessage = new ChatMessageBuilder()
			.append(ChatColorType.HIGHLIGHT)
			.append("Layout: ")
			.append(ChatColorType.NORMAL)
			.append(raidData)
			.build();

		final PartyMember localMember = party.getLocalMember();
		if (party.getMembers().isEmpty() || localMember == null)
		{
			chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
				.runeLiteFormattedMessage(layoutMessage)
				.build());
		}
		else
		{
			final PartyChatMessage message = new PartyChatMessage(layoutMessage);
			message.setMemberId(localMember.getMemberId());
			ws.send(message);
		}

		if (recordRaid() != null)
		{
			chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
				.runeLiteFormattedMessage(new ChatMessageBuilder()
					.append(ChatColorType.HIGHLIGHT)
					.append("You have scouted a record raid, whilst this is a very good raid to do you will probably end up profiting more by selling this raid to a team looking for it.")
					.build())
				.build());

			chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
				.runeLiteFormattedMessage(new ChatMessageBuilder()
					.append(ChatColorType.HIGHLIGHT)
					.append("The following are some places you can sell this raid: Scout Trading in We do Raids discord, and Buying Cox Rotations in Oblivion discord.")
					.build())
				.build());
		}
	}

	private void updateInfoBoxState()
	{
		if (timer == null)
		{
			return;
		}

		if (inRaidChambers && this.raidsTimer)
		{
			if (!infoBoxManager.getInfoBoxes().contains(timer))
			{
				infoBoxManager.addInfoBox(timer);
			}
		}
		else
		{
			infoBoxManager.removeInfoBox(timer);
		}

		if (!inRaidChambers)
		{
			timer = null;
		}
	}

	private void updateLists()
	{
		updateList(roomWhitelist, this.whitelistedRooms);
		updateList(roomBlacklist, this.blacklistedRooms);
		updateList(rotationWhitelist, this.whitelistedRotations);
		updateList(layoutWhitelist, this.whitelistedLayouts);
		updateMap(recommendedItemsList, this.recommendedItems);
	}

	private void updateMap(Map<String, List<Integer>> map, String input)
	{
		map.clear();

		Matcher m = ROTATION_REGEX.matcher(input);
		while (m.find())
		{
			String everything = m.group(1).toLowerCase();
			int split = everything.indexOf(',');
			if (split < 0)
			{
				continue;
			}
			String key = everything.substring(0, split);
			if (key.length() < 1)
			{
				continue;
			}
			List<String> itemNames = Text.fromCSV(everything.substring(split));

			map.computeIfAbsent(key, k -> new ArrayList<>());

			for (String itemName : itemNames)
			{
				if (itemName.equals(""))
				{
					continue;
				}
				if (itemName.equals("ice barrage"))
				{
					map.get(key).add(SpriteID.SPELL_ICE_BARRAGE);
				}
				else if (itemName.startsWith("salve"))
				{
					map.get(key).add(ItemID.SALVE_AMULETEI);
				}
				else if (itemManager.search(itemName).size() > 0)
				{
					map.get(key).add(itemManager.search(itemName).get(0).getId());
				}
				else
				{
					log.info("RaidsPlugin: Could not find an item ID for item: " + itemName);
				}
			}
		}
	}

	private void updateList(List<String> list, String input)
	{
		list.clear();

		if (list == this.rotationWhitelist)
		{
			Matcher m = ROTATION_REGEX.matcher(input);
			while (m.find())
			{
				String rotation = m.group(1).toLowerCase();

				if (!list.contains(rotation))
				{
					list.add(rotation);
				}
			}
		}
		else
		{
			list.addAll(Text.fromCSV(input.toLowerCase()));
		}
	}

	int getRotationMatches()
	{
		String rotation = raid.getRotationString().toLowerCase();
		List<String> bosses = Text.fromCSV(rotation);

		if (rotationWhitelist.contains(rotation))
		{
			return bosses.size();
		}

		for (String whitelisted : rotationWhitelist)
		{
			int matches = 0;
			List<String> whitelistedBosses = Text.fromCSV(whitelisted);

			for (int i = 0; i < whitelistedBosses.size(); i++)
			{
				if (i < bosses.size() && whitelistedBosses.get(i).equals(bosses.get(i)))
				{
					matches++;
				}
				else
				{
					matches = 0;
					break;
				}
			}

			if (matches >= 2)
			{
				return matches;
			}
		}

		return 0;
	}

	private Point findLobbyBase()
	{
		Tile[][] tiles = client.getScene().getTiles()[LOBBY_PLANE];

		for (int x = 0; x < SCENE_SIZE; x++)
		{
			for (int y = 0; y < SCENE_SIZE; y++)
			{
				if (tiles[x][y] == null || tiles[x][y].getWallObject() == null)
				{
					continue;
				}

				if (tiles[x][y].getWallObject().getId() == NullObjectID.NULL_12231)
				{
					return tiles[x][y].getSceneLocation();
				}
			}
		}

		return null;
	}

	private Raid buildRaid()
	{
		Point gridBase = findLobbyBase();

		if (gridBase == null)
		{
			return null;
		}

		Raid raid = new Raid();
		Tile[][] tiles;
		int position, x, y, offsetX;
		int startX = -2;

		for (int plane = 3; plane > 1; plane--)
		{
			tiles = client.getScene().getTiles()[plane];

			if (tiles[gridBase.getX() + RaidRoom.ROOM_MAX_SIZE][gridBase.getY()] == null)
			{
				position = 1;
			}
			else
			{
				position = 0;
			}

			for (int i = 1; i > -2; i--)
			{
				y = gridBase.getY() + (i * RaidRoom.ROOM_MAX_SIZE);

				for (int j = startX; j < 4; j++)
				{
					x = gridBase.getX() + (j * RaidRoom.ROOM_MAX_SIZE);
					offsetX = 0;

					if (x > SCENE_SIZE && position > 1 && position < 4)
					{
						position++;
					}

					if (x < 0)
					{
						offsetX = Math.abs(x) + 1; //add 1 because the tile at x=0 will always be null
					}

					if (x < SCENE_SIZE && y >= 0 && y < SCENE_SIZE)
					{
						if (tiles[x + offsetX][y] == null)
						{
							if (position == 4)
							{
								position++;
								break;
							}

							continue;
						}

						if (position == 0 && startX != j)
						{
							startX = j;
						}

						Tile base = tiles[offsetX > 0 ? 1 : x][y];
						RaidRoom room = determineRoom(base);
						raid.setRoom(room, position + Math.abs((plane - 3) * 8));
						position++;
					}
				}
			}
		}

		return raid;
	}

	private RaidRoom determineRoom(Tile base)
	{
		int chunkData = client.getInstanceTemplateChunks()[base.getPlane()][(base.getSceneLocation().getX()) / 8][base.getSceneLocation().getY() / 8];
		InstanceTemplates template = InstanceTemplates.findMatch(chunkData);

		if (template == null)
		{
			return RaidRoom.EMPTY;
		}

		switch (template)
		{
			case RAIDS_LOBBY:
			case RAIDS_START:
				return RaidRoom.START;

			case RAIDS_END:
				return RaidRoom.END;

			case RAIDS_SCAVENGERS:
			case RAIDS_SCAVENGERS2:
				return RaidRoom.SCAVENGERS;

			case RAIDS_SHAMANS:
				return RaidRoom.SHAMANS;

			case RAIDS_VASA:
				return RaidRoom.VASA;

			case RAIDS_VANGUARDS:
				return RaidRoom.VANGUARDS;

			case RAIDS_ICE_DEMON:
				return RaidRoom.ICE_DEMON;

			case RAIDS_THIEVING:
				return RaidRoom.THIEVING;

			case RAIDS_FARMING:
			case RAIDS_FARMING2:
				return RaidRoom.FARMING;

			case RAIDS_MUTTADILES:
				return RaidRoom.MUTTADILES;

			case RAIDS_MYSTICS:
				return RaidRoom.MYSTICS;

			case RAIDS_TEKTON:
				return RaidRoom.TEKTON;

			case RAIDS_TIGHTROPE:
				return RaidRoom.TIGHTROPE;

			case RAIDS_GUARDIANS:
				return RaidRoom.GUARDIANS;

			case RAIDS_CRABS:
				return RaidRoom.CRABS;

			case RAIDS_VESPULA:
				return RaidRoom.VESPULA;

			default:
				return RaidRoom.EMPTY;
		}

	}

	private void reset()
	{
		raid = null;
		upperTime = -1;
		middleTime = -1;
		lowerTime = -1;
		raidTime = -1;
		tooltip = null;
		inRaidChambers = false;
		widgetOverlay = null;
		raidStarted = false;
		timer = null;
	}

	private int timeToSeconds(String s)
	{
		int seconds = -1;
		String[] split = s.split(":");
		if (split.length == 2)
		{
			seconds = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
		}
		if (split.length == 3)
		{
			seconds = Integer.parseInt(split[0]) * 3600 + Integer.parseInt(split[1]) * 60 + Integer.parseInt(split[2]);
		}
		return seconds;
	}

	private String secondsToTime(int seconds)
	{
		StringBuilder builder = new StringBuilder();
		if (seconds >= 3600)
		{
			builder.append((int) Math.floor(seconds / 3600)).append(";");
		}
		seconds %= 3600;
		if (builder.length() == 0)
		{
			builder.append((int) Math.floor(seconds / 60));
		}
		else
		{
			builder.append(StringUtils.leftPad(String.valueOf((int) Math.floor(seconds / 60)), 2, '0'));
		}
		builder.append(":");
		seconds %= 60;
		builder.append(StringUtils.leftPad(String.valueOf(seconds), 2, '0'));
		return builder.toString();
	}

	private void updateTooltip()
	{
		StringBuilder builder = new StringBuilder();
		if (upperTime == -1)
		{
			tooltip = null;
			return;
		}
		builder.append("Upper level: ").append(secondsToTime(upperTime));
		if (middleTime == -1)
		{
			if (lowerTime == -1)
			{
				tooltip = builder.toString();
				return;
			}
			else
			{
				builder.append("</br>Lower level: ").append(secondsToTime(lowerTime - upperTime));
			}
		}
		else
		{
			builder.append("</br>Middle level: ").append(secondsToTime(middleTime - upperTime));
			if (lowerTime == -1)
			{
				tooltip = builder.toString();
				return;
			}
			else
			{
				builder.append("</br>Lower level: ").append(secondsToTime(lowerTime - middleTime));
			}
		}
		if (raidTime == -1)
		{
			tooltip = builder.toString();
			return;
		}
		builder.append("</br>Olm: ").append(secondsToTime(raidTime - lowerTime));
		tooltip = builder.toString();
	}

	private String handleCrabs(String firstGroup)
	{
		if (firstGroup.contains("Crabs") && GOOD_CRABS_FIRST.contains(layoutFullCode))
		{
			return "Good Crabs";
		}
		if (firstGroup.contains("Crabs") && RARE_CRABS_FIRST.contains(layoutFullCode))
		{
			return "Rare Crabs";
		}
		return null;
	}

	private String handleCrabs(String firstGroup, String secondGroup)
	{
		if (firstGroup.contains("Crabs") && GOOD_CRABS_FIRST.contains(layoutFullCode))
		{
			return "Good Crabs";
		}
		if (secondGroup.contains("Crabs") && GOOD_CRABS_SECOND.contains(layoutFullCode))
		{
			return "Good Crabs";
		}
		if (firstGroup.contains("Crabs") && RARE_CRABS_FIRST.contains(layoutFullCode))
		{
			return "Rare Crabs";
		}
		if (secondGroup.contains("Crabs") && RARE_CRABS_SECOND.contains(layoutFullCode))
		{
			return "Rare Crabs";
		}
		return null;
	}

	private String handleCrabs(String firstGroup, String secondGroup, String thirdGroup)
	{
		if (firstGroup.contains("Crabs"))
		{
			return "Good Crabs";
		}
		if (secondGroup.contains("Crabs"))
		{
			return "Rare Crabs";
		}
		if (thirdGroup.contains("Crabs"))
		{
			return "Rare Crabs";
		}
		return null;
	}

	String recordRaid()
	{
		if (raid.getRotationString().equalsIgnoreCase("vasa,tekton,vespula")
			&& containsIgnoreCase(raid.getFullRotationString(), "crabs")
			&& containsIgnoreCase(raid.getFullRotationString(), "tightrope")
			&& goodCrabs != null)
		{
			return goodCrabs;
		}
		return null;
	}

	private void setOverlayStatus(boolean bool)
	{
		overlay.setScoutOverlayShown(bool);
	}

	private void updateConfig()
	{
		this.enhanceScouterTitle = config.enhanceScouterTitle();
		this.hideBackground = config.hideBackground();
		this.raidsTimer = config.raidsTimer();
		this.pointsMessage = config.pointsMessage();
		this.ptsHr = config.ptsHr();
		this.scoutOverlay = config.scoutOverlay();
		this.scoutOverlayAtBank = config.scoutOverlayAtBank();
		this.scoutOverlayInRaid = config.scoutOverlayInRaid();
		this.displayFloorBreak = config.displayFloorBreak();
		this.showRecommendedItems = config.showRecommendedItems();
		this.recommendedItems = config.recommendedItems();
		this.alwaysShowWorldAndCC = config.alwaysShowWorldAndCC();
		this.displayLayoutMessage = config.displayLayoutMessage();
		this.colorTightrope = config.colorTightrope();
		this.tightropeColor = config.tightropeColor();
		this.crabHandler = config.crabHandler();
		this.goodCrabColor = config.goodCrabColor();
		this.rareCrabColor = config.rareCrabColor();
		this.enableRotationWhitelist = config.enableRotationWhitelist();
		this.whitelistedRotations = config.whitelistedRotations();
		this.enableLayoutWhitelist = config.enableLayoutWhitelist();
		this.whitelistedLayouts = config.whitelistedLayouts();
		this.showScavsFarms = config.showScavsFarms();
		this.scavsBeforeIce = config.scavsBeforeIce();
		this.scavsBeforeOlm = config.scavsBeforeOlm();
		this.scavPrepColor = config.scavPrepColor();
		this.whitelistedRooms = config.whitelistedRooms();
		this.blacklistedRooms = config.blacklistedRooms();
		this.hideRopeless = config.hideRopeless();
		this.hideVanguards = config.hideVanguards();
		this.hideUnknownCombat = config.hideUnknownCombat();
		this.partyDisplay = config.partyDisplay();
	}
}