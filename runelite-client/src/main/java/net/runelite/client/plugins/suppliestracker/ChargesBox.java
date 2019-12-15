package net.runelite.client.plugins.suppliestracker;

import net.runelite.client.game.ItemManager;
import net.runelite.client.util.QuantityFormatter;
import static net.runelite.api.ItemID.*;

class ChargesBox extends Box
{
	ChargesBox(ItemManager itemManager, String id, SuppliesTrackerPlugin plugin, SuppliesTrackerPanel panel, ItemType type)
	{
		super(itemManager, id, plugin, panel, type);
	}

	public String buildToolTip(int itemId, int qty)
	{
		StringBuilder b = new StringBuilder();
		if (itemId == SCYTHE_OF_VITUR)
		{
			b.append("<html>");
			b.append("Blood Rune x ").append(qty * 3).append(" (").append(QuantityFormatter.quantityToStackSize(itemManager.getItemPrice(BLOOD_RUNE) * qty * 3)).append("gp)");
			b.append("<br>");
			b.append("Vial of Blood x ").append(qty).append("/100 (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(VIAL_OF_BLOOD_22446) * qty) / 100)).append("gp)");
			b.append("</br>");
			b.append("</html>");

			return b.toString();
		}
		if (itemId == SANGUINESTI_STAFF)
		{
			b.append("Blood Rune x ").append(qty * 3).append(" (").append(QuantityFormatter.quantityToStackSize(itemManager.getItemPrice(BLOOD_RUNE) * qty * 3)).append("gp)");

			return b.toString();
		}
		if (itemId == TRIDENT_OF_THE_SEAS)
		{
			b.append("<html>");
			b.append("Chaos Rune x ").append(qty).append(" (").append(QuantityFormatter.quantityToStackSize(itemManager.getItemPrice(CHAOS_RUNE) * qty)).append("gp)");
			b.append("<br>");
			b.append("Death Rune x ").append(qty).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(DEATH_RUNE) * qty))).append("gp)");
			b.append("</br>");
			b.append("<br>");
			b.append("Fire Rune x ").append(qty * 5).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(FIRE_RUNE) * qty) * 5)).append("gp)");
			b.append("</br>");
			b.append("<br>");
			b.append("Coins x ").append(qty * 10).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(COINS_995) * qty) * 10)).append("gp)");
			b.append("</br>");
			b.append("</html>");
			return b.toString();
		}
		if (itemId == TRIDENT_OF_THE_SWAMP)
		{
			b.append("<html>");
			b.append("Chaos Rune x ").append(qty).append(" (").append(QuantityFormatter.quantityToStackSize(itemManager.getItemPrice(CHAOS_RUNE) * qty)).append("gp)");
			b.append("<br>");
			b.append("Death Rune x ").append(qty).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(DEATH_RUNE) * qty))).append("gp)");
			b.append("</br>");
			b.append("<br>");
			b.append("Fire Rune x ").append(qty * 5).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(FIRE_RUNE) * qty) * 5)).append("gp)");
			b.append("</br>");
			b.append("<br>");
			b.append("Zulrah's Scales x ").append(qty).append(" (").append(QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(ZULRAHS_SCALES) * qty))).append("gp)");
			b.append("</br>");
			b.append("</html>");
			return b.toString();
		}
		return "Error building Tooltip";
	}
}
