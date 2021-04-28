/*
 * ******************************************************************************
 *  * Copyright (c) 2019 openosrs
 *  *  Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 *  *  If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 *  *  ST0NEWALL#9112
 *  *   openosrs Discord: https://discord.gg/Q7wFtCe
 *  *   openosrs website: https://openosrs.com
 *  *****************************************************************************
 */

package net.runelite.client.plugins.pvptools;

import com.google.common.collect.Sets;
import com.google.inject.Provides;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.Player;
import net.runelite.api.SkullIcon;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import static net.runelite.client.plugins.pvptools.PvpToolsPanel.htmlLabel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.HotkeyListener;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.PvPUtil;
import net.runelite.client.util.QuantityFormatter;
import org.apache.commons.lang3.ArrayUtils;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "PvP Tools",
	enabledByDefault = false,
	description = "Enable the PvP Tools panel",
	tags = {"panel", "pvp", "pk", "pklite", "renderself"}
)
public class PvpToolsPlugin extends Plugin
{
	@Inject
	PlayerCountOverlay playerCountOverlay;

	private PvpToolsPanel panel;
	private MissingPlayersJFrame missingPlayersJFrame;
	private CurrentPlayersJFrame currentPlayersJFrame;
	private NavigationButton navButton;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private boolean hideAll;
	private boolean loaded;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ItemManager itemManager;

	private final PvpToolsPlugin uhPvpToolsPlugin = this;

	private static final CopyOnWriteArrayList<Player> clanMembers = new CopyOnWriteArrayList<>();

	/**
	 * ActionListener for the missing cc members and refresh buttons
	 */
	final ActionListener playersButtonActionListener = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (missingPlayersJFrame != null)
			{
				missingPlayersJFrame.dispose();
				missingPlayersJFrame = null;
				missingPlayersJFrame = new MissingPlayersJFrame(client, uhPvpToolsPlugin, getMissingMembers());
			}
			else
			{
				missingPlayersJFrame = new MissingPlayersJFrame(client, uhPvpToolsPlugin, getMissingMembers());
			}
		}
	};

	final ActionListener currentPlayersActionListener = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (currentPlayersJFrame != null)
			{
				currentPlayersJFrame.dispose();
				currentPlayersJFrame = null;
				currentPlayersJFrame = new CurrentPlayersJFrame(client, uhPvpToolsPlugin, getCurrentMembers());
			}
			else
			{
				currentPlayersJFrame = new CurrentPlayersJFrame(client, uhPvpToolsPlugin, getCurrentMembers());
			}
		}
	};

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private KeyManager keyManager;

	@Inject
	private PvpToolsConfig config;

	private final HotkeyListener renderselfHotkeyListener = new HotkeyListener(() -> config.renderSelf())
	{
		public void hotkeyPressed()
		{
			client.setRenderSelf(!client.getRenderSelf());
		}
	};

	private int[] overheadCount = new int[]{0, 0, 0};

	@Getter
	private int enemyPlayerCount = 0;
	@Getter
	private int friendlyPlayerCount = 0;

	private List<String> getMissingMembers()
	{
		CopyOnWriteArrayList<Player> ccMembers = clanMembers;
		ArrayList<String> missingMembers = new ArrayList<>();
		if (this.client.getFriendsChatManager() != null)
		{
			for (FriendsChatMember friendsChatMember : client.getFriendsChatManager().getMembers())
			{
				if (!Objects.isNull(friendsChatMember))
				{
					List<String> arrayList = ccMembers.stream().map(player -> Text.removeTags(Text.standardize(player.getName()))).collect(Collectors.toList());
					if (!arrayList.contains(Text.removeTags(Text.standardize(friendsChatMember.getName()))) && !missingMembers.contains(friendsChatMember.getName()))
					{
						missingMembers.add("[W" + friendsChatMember.getWorld() + "] - " + friendsChatMember.getName());
					}
				}
			}
		}

		return missingMembers;
	}

	private List<String> getCurrentMembers()
	{
		CopyOnWriteArrayList<Player> ccMembers = clanMembers;
		ArrayList<String> currentMembers = new ArrayList<>();
		if (this.client.getFriendsChatManager() != null)
		{
			for (FriendsChatMember friendsChatMember : client.getFriendsChatManager().getMembers())
			{
				if (!Objects.isNull(friendsChatMember))
				{
					List<String> arrayList = ccMembers.stream().map(player -> Text.removeTags(Text.standardize(player.getName()))).collect(Collectors.toList());
					if (arrayList.contains(Text.removeTags(Text.standardize(friendsChatMember.getName()))) && !currentMembers.contains(friendsChatMember.getName()))
					{
						currentMembers.add(friendsChatMember.getName());
					}
				}
			}
		}

		return currentMembers;
	}


	@Provides
	PvpToolsConfig config(ConfigManager configManager)
	{
		return configManager.getConfig(PvpToolsConfig.class);
	}

	@Override
	protected void startUp()
	{
		overlayManager.add(playerCountOverlay);
		keyManager.registerKeyListener(renderselfHotkeyListener);
		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "skull.png");

		panel = new PvpToolsPanel();
		panel.init();

		navButton = NavigationButton.builder()
			.tooltip("PvP Tools")
			.icon(icon)
			.priority(5)
			.panel(panel)
			.build();

		panel.missingPlayers.addActionListener(playersButtonActionListener);
		panel.currentPlayers.addActionListener(currentPlayersActionListener);
		clientToolbar.addNavigation(navButton);

		if (config.missingPlayersEnabled())
		{
			panel.missingPlayers.setVisible(true);
		}

		if (config.currentPlayersEnabled())
		{
			panel.currentPlayers.setVisible(true);
		}

		if (client.getGameState() == GameState.LOGGED_IN)
		{
			setCastOptions();
		}
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(playerCountOverlay);
		keyManager.unregisterKeyListener(renderselfHotkeyListener);
		clientToolbar.removeNavigation(navButton);

		if (client.getGameState() == GameState.LOGGED_IN)
		{
			resetCastOptions();
		}

		loaded = false;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged configChanged)
	{
		if (!"pvptools".equals(configChanged.getGroup()))
		{
			return;
		}

		switch (configChanged.getKey())
		{
			case "countPlayers":
				if (config.countPlayers())
				{
					updatePlayers();
				}
				if (!config.countPlayers())
				{
					panel.disablePlayerCount();
				}
				break;
			case "countOverHeads":
				if (config.countOverHeads())
				{
					countOverHeads();
				}
				if (!config.countOverHeads())
				{
					panel.disablePrayerCount();
				}
				break;
			case "riskCalculator":
				if (config.riskCalculatorEnabled())
				{
					getCarriedWealth();
				}
				if (!config.riskCalculatorEnabled())
				{
					panel.disableRiskCalculator();
				}
				break;
			case "missingPlayers":
				if (config.missingPlayersEnabled())
				{
					panel.missingPlayers.setVisible(true);
				}
				break;
			case "currentPlayers":
				if (config.currentPlayersEnabled())
				{
					panel.currentPlayers.setVisible(true);
				}
				break;
			case "hideAttack":
			case "hideAttackMode":
				if (config.hideAttack())
				{
					hideAttackOptions(config.hideAttackMode());
				}
				else
				{
					client.setHideFriendAttackOptions(false);
					client.setHideClanmateAttackOptions(false);
				}
				break;
			case "hideCast":
			case "hideCastMode":
			case "hideCastIgnored":
				setCastOptions();
				break;
		}
	}

	@Subscribe
	private void onItemContainerChanged(ItemContainerChanged event)
	{
		if (event.getItemContainer().equals(client.getItemContainer(InventoryID.INVENTORY)) &&
			config.riskCalculatorEnabled())
		{
			getCarriedWealth();
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState().equals(GameState.LOGGED_IN))
		{
			if (config.riskCalculatorEnabled())
			{
				getCarriedWealth();
			}
			if (config.countPlayers())
			{
				updatePlayers();
			}
			if (!loaded)
			{
				setCastOptions();
			}
		}
	}

	@Subscribe
	private void onPlayerSpawned(PlayerSpawned event)
	{
		if (config.countPlayers() && PvPUtil.isAttackable(client, event.getPlayer()))
		{
			updatePlayers();
		}
		if (config.countOverHeads())
		{
			countOverHeads();
		}
	}

	@Subscribe
	private void onPlayerDespawned(PlayerDespawned event)
	{
		if (config.countPlayers() && PvPUtil.isAttackable(client, event.getPlayer()))
		{
			updatePlayers();
		}
		if (config.countOverHeads())
		{
			countOverHeads();
		}
	}

	/**
	 * Updates the PvP Tools panel with the numbers for enemy protection prayers
	 */
	private void updatePrayerNumbers()
	{
		panel.numMageJLabel.setText(htmlLabel("Enemies Praying Mage: ", String.valueOf(overheadCount[0])));
		panel.numRangeJLabel.setText(htmlLabel("Enemies Praying Range: ", String.valueOf(overheadCount[1])));
		panel.numMeleeJLabel.setText(htmlLabel("Enemies Praying Melee: ", String.valueOf(overheadCount[2])));
		panel.numMageJLabel.repaint();
		panel.numRangeJLabel.repaint();
		panel.numMeleeJLabel.repaint();
	}

	private void updatePlayers()
	{
		friendlyPlayerCount = 0;
		enemyPlayerCount = 0;
		if (config.countPlayers())
		{
			for (Player p : client.getPlayers())
			{
				if (Objects.nonNull(p))
				{
					if (p.equals(client.getLocalPlayer()))
					{
						continue;
					}
					if (PvPUtil.isAttackable(client, p))
					{
						if (p.isFriendsChatMember())
						{
							friendlyPlayerCount++;
						}
						else
						{
							enemyPlayerCount++;
						}
					}
				}
			}

			panel.numOther.setText(htmlLabel("Other Player Count: ", String.valueOf(enemyPlayerCount)));
			panel.numCC.setText(htmlLabel("Friendly Player Count: ", String.valueOf(friendlyPlayerCount)));
			panel.numCC.repaint();
			panel.numOther.repaint();
		}
	}

	private void countOverHeads()
	{
		overheadCount = new int[]{0, 0, 0};
		for (Player p : client.getPlayers())
		{
			if (Objects.nonNull(p) && PvPUtil.isAttackable(client, p) &&
				!p.isFriendsChatMember() && !(p.getOverheadIcon() == null))
			{
				switch (p.getOverheadIcon())
				{
					case MAGIC:
						overheadCount[0]++;
						break;
					case RANGED:
						overheadCount[1]++;
						break;
					case MELEE:
						overheadCount[2]++;
						break;
				}
			}
		}
		updatePrayerNumbers();
	}

	/**
	 * Calculates the player's risk based on Item Price of all items in their inventory and equipment
	 */
	private void getCarriedWealth()
	{
		if (!config.riskCalculatorEnabled())
		{
			return;
		}

		final ItemContainer equipment = client.getItemContainer(InventoryID.EQUIPMENT);
		final ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
		final Player player = client.getLocalPlayer();

		if (equipment == null || equipment.getItems() == null ||
			inventory == null || inventory.getItems() == null ||
			player == null)
		{
			return;
		}

		final Item[] items = ArrayUtils.addAll(equipment.getItems(), inventory.getItems());
		final TreeMap<Integer, Item> priceMap = new TreeMap<>(Comparator.comparingInt(Integer::intValue));
		int wealth = 0;
		for (Item i : items)
		{
			int value = (itemManager.getItemPrice(i.getId()) * i.getQuantity());
			final ItemComposition itemComposition = itemManager.getItemComposition(i.getId());

			if (!itemComposition.isTradeable() && value == 0)
			{
				value = itemComposition.getPrice() * i.getQuantity();
				priceMap.put(value, i);
			}
			else
			{
				value = itemManager.getItemPrice(i.getId()) * i.getQuantity();
				if (i.getId() > 0 && value > 0)
				{
					priceMap.put(value, i);
				}
			}
			wealth += value;
		}

		panel.totalRiskLabel.setText(htmlLabel("Total risk: ", QuantityFormatter.quantityToRSDecimalStack(wealth)));
		panel.totalRiskLabel.repaint();

		int itemLimit = 0;
		if (player.getSkullIcon() != null && player.getSkullIcon() == SkullIcon.SKULL)
		{
			itemLimit = 1;
		}
		if (player.getSkullIcon() == null)
		{
			itemLimit = 4;
		}

		AsyncBufferedImage itemImage = null;

		NavigableMap<Integer, Item> descendingMap = priceMap.descendingMap();

		for (int i = 0; i < itemLimit; i++)
		{
			if (i == 0)
			{
				if (!descendingMap.isEmpty())
				{
					itemImage = itemManager.getImage(descendingMap.pollFirstEntry().getValue().getId());
				}
			}
			else
			{
				if (!descendingMap.isEmpty())
				{
					itemManager.getItemComposition(priceMap.descendingMap().pollFirstEntry().getValue().getId())
						.getName();
				}
			}
		}
		panel.riskProtectingItem.setText(htmlLabel("Risk Protecting Item: ",
			QuantityFormatter.quantityToRSDecimalStack(descendingMap.keySet().stream().mapToInt(Integer::intValue).sum())));
		panel.riskProtectingItem.repaint();

		panel.biggestItemLabel.setText("Most Valuable Item: ");
		if (itemImage != null)
		{
			itemImage.addTo(panel.biggestItemLabel);
		}
		panel.biggestItemLabel.repaint();
	}

	/**
	 * Given an AttackMode, hides the appropriate attack options.
	 *
	 * @param mode The {@link AttackMode} specifying clanmates, friends, or both.
	 */
	private void hideAttackOptions(AttackMode mode)
	{
		switch (mode)
		{
			case CLAN:
				client.setHideClanmateAttackOptions(true);
				client.setHideFriendAttackOptions(false);
				break;
			case FRIENDS:
				client.setHideFriendAttackOptions(true);
				client.setHideClanmateAttackOptions(false);
				break;
			case BOTH:
				client.setHideClanmateAttackOptions(true);
				client.setHideFriendAttackOptions(true);
				break;
		}
	}

	/**
	 * Given an AttackMode, hides the appropriate cast options.
	 *
	 * @param mode The {@link AttackMode} specifying clanmates, friends, or both.
	 */
	private void hideCastOptions(AttackMode mode)
	{
		switch (mode)
		{
			case CLAN:
				client.setHideClanmateCastOptions(true);
				client.setHideFriendCastOptions(false);
				break;
			case FRIENDS:
				client.setHideFriendCastOptions(true);
				client.setHideClanmateCastOptions(false);
				break;
			case BOTH:
				client.setHideClanmateCastOptions(true);
				client.setHideFriendCastOptions(true);
				break;
		}
	}

	public void setCastOptions()
	{
		clientThread.invoke(() ->
		{
			if ((client.getVar(Varbits.IN_RAID) == 1 || client.getVar(Varbits.THEATRE_OF_BLOOD) == 2)
				|| (client.getVar(Varbits.IN_WILDERNESS) != 1 && !WorldType.isAllPvpWorld(client.getWorldType())))
			{
				return;
			}

			if (config.hideAttack())
			{
				hideAttackOptions(config.hideAttackMode());
			}
			else
			{
				client.setHideFriendAttackOptions(false);
				client.setHideClanmateAttackOptions(false);
			}

			if (config.hideCast())
			{
				hideCastOptions(config.hideCastMode());
			}
			else
			{
				client.setHideFriendCastOptions(false);
				client.setHideClanmateCastOptions(false);
			}

			client.setUnhiddenCasts(Sets.newHashSet(Text.fromCSV(config.hideCastIgnored().toLowerCase())));

			loaded = true;
		});
	}

	private void resetCastOptions()
	{
		clientThread.invoke(() ->
		{
			if (client.getVar(Varbits.IN_RAID) == 1 || client.getVar(Varbits.THEATRE_OF_BLOOD) == 2)
			{
				return;
			}

			client.setHideFriendAttackOptions(false);
			client.setHideFriendCastOptions(false);
		});
	}
}