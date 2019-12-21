package net.runelite.client.plugins.specregen;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemDefinition;
import net.runelite.api.Point;
import net.runelite.api.VarPlayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;

public class SpecRegenTimerOverlay extends Overlay
{
	private final Client client;
	private final TooltipManager tooltipManager;
	private final HashMap<String, Integer> weapons;
	private SpecRegenTimerPlugin plugin;
	@Inject
	private ItemManager itemManager;
	private double currentSpec;
	private int specCount;
	private int maxSpecs;
	private int remainingMinutes;
	private String remainingSecondsString;

	@Inject
	public SpecRegenTimerOverlay(Client client, SpecRegenTimerPlugin plugin, TooltipManager tooltipManager)
	{
		this.tooltipManager = tooltipManager;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);

		this.client = client;
		this.plugin = plugin;
		this.weapons = Weapons.getWeapons();
	}

	@Override
	public Dimension render(Graphics2D graphics2D)
	{
		final Widget widget = client.getWidget(WidgetInfo.MINIMAP_SPEC_ORB);
		if (widget == null)
		{
			return null;
		}
		final Rectangle bounds = widget.getBounds();
		final Point mousePosition = client.getMouseCanvasPosition();
		if (bounds.contains(mousePosition.getX(), mousePosition.getY()))
		{
			String tooltip;
			if (currentSpec == 100 || specCount == maxSpecs)
			{
				tooltip = "Available special attacks: " + specCount;
			}
			else
			{
				tooltip = "Time Remaining till next spec: " + remainingMinutes + ":" + remainingSecondsString + "</br>" +
					"Available special attacks: " + specCount;
			}
			int i = 0;
			tooltipManager.add(new Tooltip(tooltip));

		}
		return null;
	}

	public void updateSpec()
	{
		//0.2% spec restore per tick
		if (client.getItemContainer(InventoryID.EQUIPMENT) == null)
		{
			return;
		}
		currentSpec = Math.floor((client.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) / 10) + (plugin.getSpecialPercentage() * 10));
		int specTarget = 100;
		final Item[] items = client.getItemContainer(InventoryID.EQUIPMENT).getItems();
		if (items.length <= EquipmentInventorySlot.WEAPON.getSlotIdx())
		{
			return;
		}
		final Item weapon = items[EquipmentInventorySlot.WEAPON.getSlotIdx()];
		final ItemDefinition weaponComp = itemManager.getItemDefinition(weapon.getId());

		String weaponName;
		//magic shortbow(i) had to be special
		if (weaponComp.getName().toLowerCase().equals("magic shortbow (i)"))
		{
			weaponName = "magic shortbow (i)";
		}
		else
		{
			weaponName = weaponComp.getName().replaceAll("\\([^()]*\\)", "").toLowerCase();
		}

		if (weapons.containsKey(weaponName))
		{
			if (weaponName.equals("granite maul") && Arrays.asList(24225, 24226, 24227, 24228).contains(weaponComp.getId()))
			{
				specTarget = 50;
			}
			else
			{
				specTarget = weapons.get(weaponName);
			}
		}
		specCount = (int) (currentSpec / specTarget);

		double remainingSpec = specTarget - (currentSpec % specTarget);

		int remainingTicks = (int) (remainingSpec / 0.2);
		int remainingTime = (int) (remainingTicks * 0.6);
		int remainingSeconds = remainingTime % 60;
		remainingMinutes = (int) Math.floor(remainingTime / 60);

		remainingSecondsString = remainingSeconds + "";
		if (remainingSeconds < 10)
		{
			remainingSecondsString = "0" + remainingSeconds;
		}

		maxSpecs = (int) Math.floor(100 / specTarget);
	}
}
