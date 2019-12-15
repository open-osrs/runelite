package net.runelite.client.plugins.suppliestracker;

import net.runelite.client.game.ItemManager;
import net.runelite.client.util.QuantityFormatter;
import static net.runelite.api.ItemID.*;

class ChargesBox extends Box
{
	ChargesBox(
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
		StringBuilder tooltip = new StringBuilder();

		switch (itemId)
		{
			case SCYTHE_OF_VITUR:
				tooltip.append("<html>");
				tooltip.append("Blood Rune x ")
						.append(qty * 3)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								itemManager.getItemPrice(BLOOD_RUNE) * qty * 3)
						)
						.append("gp)");
				tooltip.append("<br>");
				tooltip.append("Vial of Blood x ")
						.append(qty).append("/100 (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(VIAL_OF_BLOOD_22446) * qty) / 100)
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("</html>");
				return tooltip.toString();
			case SANGUINESTI_STAFF:

				tooltip.append("Blood Rune x ")
						.append(qty * 3).append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								itemManager.getItemPrice(BLOOD_RUNE) * qty * 3)
						)
						.append("gp)");
				return tooltip.toString();

			case TRIDENT_OF_THE_SEAS:
				tooltip.append("<html>");
				tooltip.append("Chaos Rune x ")
						.append(qty).append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								itemManager.getItemPrice(CHAOS_RUNE) * qty)
						)
						.append("gp)");
				tooltip.append("<br>");
				tooltip.append("Death Rune x ")
						.append(qty)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								itemManager.getItemPrice(DEATH_RUNE) * qty)
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("<br>");
				tooltip.append("Fire Rune x ")
						.append(qty * 5)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(FIRE_RUNE) * qty) * 5)
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("<br>");
				tooltip.append("Coins x ")
						.append(qty * 10)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(COINS_995) * qty) * 10)
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("</html>");
				return tooltip.toString();
			case TRIDENT_OF_THE_SWAMP:
				tooltip.append("<html>");
				tooltip.append("Chaos Rune x ")
						.append(qty)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								itemManager.getItemPrice(CHAOS_RUNE) * qty)
						)
						.append("gp)");
				tooltip.append("<br>");
				tooltip.append("Death Rune x ")
						.append(qty)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(DEATH_RUNE) * qty))
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("<br>");
				tooltip.append("Fire Rune x ")
						.append(qty * 5)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(FIRE_RUNE) * qty) * 5)
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("<br>");
				tooltip.append("Zulrah's Scales x ")
						.append(qty)
						.append(" (")
						.append(QuantityFormatter.quantityToStackSize(
								(itemManager.getItemPrice(ZULRAHS_SCALES) * qty))
						)
						.append("gp)");
				tooltip.append("</br>");
				tooltip.append("</html>");
				return tooltip.toString();
			default:
				return "Error building Tooltip";
		}
	}
}
