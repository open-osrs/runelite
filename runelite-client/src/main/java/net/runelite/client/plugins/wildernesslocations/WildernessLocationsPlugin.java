/*******************************************************************************
 * Copyright (c) 2019 openosrs
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * openosrs Discord: https://discord.gg/Q7wFtCe
 * openosrs website: https://openosrs.com
 ******************************************************************************/

package net.runelite.client.plugins.wildernesslocations;

import com.google.inject.Provides;
import java.awt.Color;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.ScriptID;
import net.runelite.api.VarClientStr;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.Keybind;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.WorldLocation;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.HotkeyListener;

@Slf4j
@PluginDescriptor(
	name = "Wild Locations",
	description = "Indicates the players current location in the wild",
	tags = {"Wildy", "Wilderness Location", "location", "loc", "pvp", "pklite"},
	type = PluginType.PVP,
	enabledByDefault = false
)
@Singleton
public class WildernessLocationsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	OverlayManager overlayManager;

	@Inject
	private WildernessLocationsOverlay overlay = new WildernessLocationsOverlay(this);

	@Getter(AccessLevel.PACKAGE)
	private boolean renderLocation;

	@Getter(AccessLevel.PACKAGE)
	private String locationString = "";

	@Inject
	private ClientThread clientThread;

	@Inject
	private WildernessLocationsConfig wildyConfig;

	@Inject
	private KeyManager keyManager;

	@Inject
	private WildernessLocationsMapOverlay wildernessLocationsMapOverlay;

	private String oldChat = "";
	private int currentCooldown = 0;
	private WorldPoint worldPoint = null;

	private final HotkeyListener hotkeyListener = new HotkeyListener(() -> this.keybind)
	{
		@Override
		public void hotkeyPressed()
		{
			sendLocToCC();
		}
	};

	@Getter(AccessLevel.PACKAGE)
	private boolean drawOverlay;
	private boolean pvpWorld;
	private Keybind keybind;
	@Getter(AccessLevel.PACKAGE)
	private boolean worldMapNames;
	@Getter(AccessLevel.PACKAGE)
	private Color mapOverlayColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean outlineLocations;
	@Getter(AccessLevel.PACKAGE)
	private boolean worldMapOverlay;


	@Provides
	WildernessLocationsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WildernessLocationsConfig.class);
	}

	@Override
	protected void startUp()
	{

		updateConfig();

		overlayManager.add(overlay);
		overlayManager.add(wildernessLocationsMapOverlay);
		keyManager.registerKeyListener(hotkeyListener);
	}

	private void updateConfig()
	{
		this.drawOverlay = wildyConfig.drawOverlay();
		this.pvpWorld = wildyConfig.pvpWorld();
		this.keybind = wildyConfig.keybind();
		this.worldMapNames = wildyConfig.worldMapOverlay();
		this.mapOverlayColor = wildyConfig.mapOverlayColor();
		this.outlineLocations = wildyConfig.outlineLocations();
		this.worldMapOverlay = this.worldMapNames || this.outlineLocations;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("wildernesslocations"))
		{
			return;
		}

		updateConfig();
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(wildernessLocationsMapOverlay);
		keyManager.unregisterKeyListener(hotkeyListener);
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{
		if (currentCooldown != 0)
		{
			currentCooldown--;
		}

		renderLocation = (client.getVar(Varbits.IN_WILDERNESS) == 1 || (this.pvpWorld && WorldType.isAllPvpWorld(client.getWorldType())));

		if (renderLocation)
		{
			final Player player = client.getLocalPlayer();
			if (player != null && player.getWorldLocation() != worldPoint)
			{
				locationString = WorldLocation.location(client.getLocalPlayer().getWorldLocation());
				worldPoint = client.getLocalPlayer().getWorldLocation();
			}
		}
		else
		{
			worldPoint = null;
			locationString = "";
		}
	}

	@Subscribe
	private void onVarClientStrChanged(VarClientStrChanged varClient)
	{
		String newChat = client.getVar(VarClientStr.CHATBOX_TYPED_TEXT);
		if (varClient.getIndex() == VarClientStr.CHATBOX_TYPED_TEXT.getIndex() && !newChat.equals(oldChat))
		{
			oldChat = newChat;
		}
	}

	private boolean inClanChat()
	{
		return client.getWidget(WidgetInfo.CLAN_CHAT_TITLE) != null;
	}

	private void sendMessage(String text)
	{
		int mode = 0;
		if (inClanChat() && text.startsWith("/"))
		{
			mode = 2;
		}
		int finalMode = mode;
		Runnable r = () ->
		{
			String cached = oldChat;
			client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, text);
			client.runScript(ScriptID.CHATBOX_INPUT, finalMode, text);
			oldChat = cached;
			client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, oldChat);
		};
		clientThread.invoke(r);
	}

	private void sendLocToCC()
	{
		if (currentCooldown != 0)
		{
			return;
		}
		String location = getLocationString();
		if (location.equals(""))
		{
			return;
		}
		sendMessage("/World: " + client.getWorld() + " Location: " + location);
		currentCooldown = 30;
	}
}
