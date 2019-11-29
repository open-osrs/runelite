package net.runelite.client.plugins.spawntimer;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Spawn Timer",
	description = "Shows NPC'S time since spawned",
	tags = {"highlight", "minimap", "npcs", "overlay", "spawn", "tags", "lyzrd"},
	type = PluginType.PVM,
	enabledByDefault = false
)
@Singleton
public class SpawnTimerPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> highlightedNpcs = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	Set<thing> ticks = new HashSet<>();

	@Inject
	private SpawnTimerOverlay SpawnTimerOverlay;

	@Inject
	private SpawnTimerConfig config;

	@Provides
	SpawnTimerConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SpawnTimerConfig.class);
	}

	@Getter(AccessLevel.PACKAGE)
	public int currentTick;

	private String getNpcToHighlight;
	@Getter(AccessLevel.PACKAGE)
	private Color getHighlightColor;

	@Override
	protected void startUp()
	{

		this.getNpcToHighlight = config.getNpcToHighlight();
		this.getHighlightColor = config.getHighlightColor();

		currentTick = 0;
		overlayManager.add(SpawnTimerOverlay);
	}


	@Override
	protected void shutDown()
	{
		ticks.clear();
		highlightedNpcs.clear();
		overlayManager.remove(SpawnTimerOverlay);
	}

	@Subscribe
	private void onGameTick(GameTick g)
	{
		currentTick++;
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGIN_SCREEN ||
			event.getGameState() == GameState.HOPPING)
		{
			highlightedNpcs.clear();
			ticks.clear();
		}
	}

	@Subscribe
	private void onNpcSpawned(NpcSpawned n)
	{
		if (n.getNpc() != null)
		{
			final NPC npc = n.getNpc();
			highlightedNpcs.add(npc);
			thing temp = new thing();
			temp.setNpc(npc);
			temp.setTick(currentTick);
			ticks.add(temp);
		}
	}

	@Subscribe
	private void onNpcDespawned(NpcDespawned n)
	{
		final NPC npc = n.getNpc();
		if (highlightedNpcs.contains(npc))
		{
			highlightedNpcs.remove(npc);
			//currentTick = 0;
			ticks.removeIf(t -> t.getNpc() == npc);
		}
	}

	@VisibleForTesting
	public List<String> getHighlights()
	{
		final String configNpcs = this.getNpcToHighlight.toLowerCase();

		if (configNpcs.isEmpty())
		{
			return Collections.emptyList();
		}

		return Text.fromCSV(configNpcs);
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("spawntimer"))
		{
			return;
		}

		this.getNpcToHighlight = config.getNpcToHighlight();
		this.getHighlightColor = config.getHighlightColor();
	}
}