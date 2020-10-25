package net.runelite.client.game;

import java.util.ArrayList;
import java.util.List;
import lombok.Value;
import net.runelite.api.ItemDefinition;
import net.runelite.api.PlayerAppearance;
import net.runelite.api.kit.KitType;
import static net.runelite.api.kit.KitType.AMMUNITION;
import static net.runelite.api.kit.KitType.RING;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;

@Value
public class ConcurrentItem
{
	int id;
	KitType type;
	ItemDefinition definition;
	ItemStats stats;
	ItemEquipmentStats equipmentStats;

	public static List<ConcurrentItem> getConcurrentList(PlayerAppearance appearance, ItemManager itemManager)
	{
		List<ConcurrentItem> list = new ArrayList<>();
		for (KitType value : KitType.values())
		{
			if (value == RING || value == AMMUNITION)
			{
				continue;
			}
			int id = appearance.getEquipmentId(value);
			if (id == -1)
			{
				continue;
			}
			ItemStats stats = itemManager.getItemStats(id, false);
			ItemDefinition definition = itemManager.getItemDefinition(id);
			ItemEquipmentStats equipmentStats;
			if (stats == null)
			{
				equipmentStats = null;
			}
			else
			{
				equipmentStats = stats.getEquipment();
			}
			list.add(new ConcurrentItem(id, value, definition, stats, equipmentStats));
		}
		return List.copyOf(list);
	}
}
