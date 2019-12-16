package net.runelite.client.plugins.suppliestracker;


import net.runelite.api.ItemDefinition;
import net.runelite.client.game.ItemManager;
import net.runelite.client.util.QuantityFormatter;
import static net.runelite.api.ItemID.*;

public class JewelleryBox extends Box
{
	JewelleryBox(
				ItemManager itemManager,
				String id,
				SuppliesTrackerPlugin plugin,
				SuppliesTrackerPanel panel,
				ItemType type
	)
	{
		super(itemManager, id, plugin, panel, type);
	}

	public String buildToolTip(int itemId, int qty)
	{
		ItemDefinition item = itemManager.getItemDefinition(itemId);
		final String name = item.getName();
		StringBuilder tooltip = new StringBuilder();

		if (name.toLowerCase().contains("glory"))
		{
			tooltip.append("Amulet of Glory(6) x ")
					.append(qty)
					.append("/6 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(AMULET_OF_GLORY6) * qty) / 6))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("dueling"))
		{
			tooltip.append("Ring of Dueling(8) x ")
					.append(qty)
					.append("/8 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(RING_OF_DUELING8) * qty) / 8))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("wealth"))
		{
			tooltip.append("Ring of Wealth(5) x ")
					.append(qty)
					.append("/5 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(RING_OF_WEALTH_5) * qty) / 5))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("combat"))
		{
			tooltip.append("Combat Bracelet(6) x ")
					.append(qty)
					.append("/6 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(COMBAT_BRACELET6) * qty) / 6))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("games"))
		{
			tooltip.append("Games Necklace(8) x ")
					.append(qty)
					.append("/8 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(GAMES_NECKLACE8) * qty) / 8))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("skills"))
		{
			tooltip.append("Skills Necklace(6) x ")
					.append(qty)
					.append("/6 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(SKILLS_NECKLACE6) * qty) / 6))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("passage"))
		{
			tooltip.append("Necklace of Passage(5) x ")
					.append(qty)
					.append("/5 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(NECKLACE_OF_PASSAGE5) * qty) / 5))
					.append("gp)");
		}
		else if (name.toLowerCase().contains("burning"))
		{
			tooltip.append("Burning Amulet(5) x ")
					.append(qty)
					.append("/5 (")
					.append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(BURNING_AMULET5) * qty) / 5))
					.append("gp)");
		}
			return tooltip.toString();
	}
}
