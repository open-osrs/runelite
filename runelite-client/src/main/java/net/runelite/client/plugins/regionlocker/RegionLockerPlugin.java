/*
 * Copyright (c) 2019, Slay to Stay <https://github.com/slaytostay>
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
package net.runelite.client.plugins.regionlocker;

import com.google.inject.Provides;
import java.awt.Color;
import java.awt.Rectangle;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.chat.ChatCommandManager;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.Keybind;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Region Locker",
	description = "Settings for the region locker.",
	tags = {"region", "locker", "chunk", "map", "square", "chunklite"},
	type = PluginType.UTILITY,
	enabledByDefault = false
)
public class RegionLockerPlugin extends Plugin
{
	static final String CONFIG_KEY = "regionlocker";
	private static final String CHUNK_COMMAND = "!chunks";

	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private RegionLockerConfig config;

	@Inject
	private RegionLockerOverlay regionLockerOverlay;

	@Inject
	private RegionBorderOverlay regionBorderOverlay;

	@Inject
	private RegionLockerInput inputListener;

	@Inject
	private KeyManager keyManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private ChatCommandManager chatCommandManager;

	private RegionLockerPlugin plugin;
	private RegionLocker regionLocker;
	private NavigationButton titleBarButton;

	@Setter(AccessLevel.PACKAGE)
	private boolean unlockKeyPressed = false;
	@Setter(AccessLevel.PACKAGE)
	private boolean blockKeyPressed = false;
	@Getter(AccessLevel.PACKAGE)
	private boolean renderLockedRegions;
	@Getter(AccessLevel.PACKAGE)
	private boolean renderRegionBorders;
	@Getter(AccessLevel.PACKAGE)
	private boolean unlockUnderground;
	@Getter(AccessLevel.PACKAGE)
	private boolean unlockRealms;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawMapOverlay;
	@Getter(AccessLevel.PACKAGE)
	private boolean invertMapOverlay;
	@Getter(AccessLevel.PACKAGE)
	private boolean hardBorder;
	@Getter(AccessLevel.PACKAGE)
	private Color shaderGrayColor;
	@Getter(AccessLevel.PACKAGE)
	private Color shaderGrayAmount;
	@Getter(AccessLevel.PACKAGE)
	private Color mapOverlayColor;
	@Getter(AccessLevel.PACKAGE)
	private Color unlockableOverlayColor;
	@Getter(AccessLevel.PACKAGE)
	private Color blacklistedOverlayColor;
	@Getter(AccessLevel.PACKAGE)
	private Color regionBorderColor;
	@Getter(AccessLevel.PACKAGE)
	private int regionBorderWidth;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawMapGrid;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawRegionId;
	@Getter(AccessLevel.PACKAGE)
	private Keybind unlockKey;
	@Getter(AccessLevel.PACKAGE)
	private Keybind blacklistKey;
	@Getter(AccessLevel.PACKAGE)
	private String unlockedRegions;
	@Getter(AccessLevel.PACKAGE)
	private String unlockableRegions;
	@Getter(AccessLevel.PACKAGE)
	private String blacklistedRegions;


	@Provides
	RegionLockerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RegionLockerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		regionLocker = new RegionLocker(client, plugin, configManager);
		overlayManager.add(regionLockerOverlay);
		overlayManager.add(regionBorderOverlay);
		keyManager.registerKeyListener(inputListener);
		setKeys();
		updateConfig();
	}

	@Override
	protected void shutDown() throws Exception
	{
		chatCommandManager.unregisterCommand(CHUNK_COMMAND);
		overlayManager.remove(regionLockerOverlay);
		overlayManager.remove(regionBorderOverlay);
		keyManager.unregisterKeyListener(inputListener);
		RegionLocker.renderLockedRegions = false;
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(RegionLockerPlugin.CONFIG_KEY))
		{
			return;
		}

		setKeys();
		updateConfig();
		regionLocker.readConfig();
	}

	@Subscribe
	public void onFocusChanged(FocusChanged focusChanged)
	{
		if (!focusChanged.isFocused())
		{
			unlockKeyPressed = false;
			blockKeyPressed = false;
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		Widget map = client.getWidget(WidgetInfo.WORLD_MAP_VIEW);
		if (!(unlockKeyPressed || blockKeyPressed) || map == null)
		{
			return;
		}

		RenderOverview ro = client.getRenderOverview();
		Float pixelsPerTile = ro.getWorldMapZoom();

		Rectangle worldMapRect = map.getBounds();
		int widthInTiles = (int) Math.ceil(worldMapRect.getWidth() / pixelsPerTile);
		int heightInTiles = (int) Math.ceil(worldMapRect.getHeight() / pixelsPerTile);

		Point worldMapPosition = ro.getWorldMapPosition();

		int yTileMin = worldMapPosition.getY() - heightInTiles / 2;

		Point mousePos = client.getMouseCanvasPosition();

		int tx = (int) ((mousePos.getX() - worldMapRect.getX()) / pixelsPerTile);
		int ty = (int) ((mousePos.getY() - worldMapRect.getX() - worldMapRect.height) / pixelsPerTile);

		int x = tx - widthInTiles / 2 + worldMapPosition.getX();
		int y = -ty + yTileMin;

		int regionId = ((x >> 6) << 8) | (y >> 6);

		if (unlockKeyPressed)
		{
			regionLocker.addRegion(regionId);
		}
		if (blockKeyPressed)
		{
			regionLocker.blockRegion(regionId);
		}
	}

	private void setKeys()
	{
		RegionLockerInput.UNLOCK_KEY = this.unlockKey;
		RegionLockerInput.BLOCK_KEY = this.blacklistKey;
	}

	private void updateConfig()
	{
		this.renderLockedRegions = config.renderLockedRegions();
		this.renderRegionBorders = config.renderRegionBorders();
		this.unlockUnderground = config.unlockUnderground();
		this.unlockRealms = config.unlockRealms();
		this.drawMapOverlay = config.drawMapOverlay();
		this.invertMapOverlay = config.invertMapOverlay();
		this.hardBorder = config.hardBorder();
		this.shaderGrayColor = config.shaderGrayColor();
		this.shaderGrayAmount = config.shaderGrayAmount();
		this.mapOverlayColor = config.mapOverlayColor();
		this.unlockableOverlayColor = config.unlockableOverlayColor();
		this.blacklistedOverlayColor = config.blacklistedOverlayColor();
		this.regionBorderColor = config.regionBorderColor();
		this.regionBorderWidth = config.regionBorderWidth();
		this.drawMapGrid = config.drawMapGrid();
		this.drawRegionId = config.drawRegionId();
		this.unlockKey = config.unlockKey();
		this.blacklistKey = config.blacklistKey();
		this.unlockedRegions = config.unlockedRegions();
		this.unlockableRegions = config.unlockableRegions();
		this.blacklistedRegions = config.blacklistedRegions();
	}
}
