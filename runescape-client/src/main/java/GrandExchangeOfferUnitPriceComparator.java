import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -241051859
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;I)I",
		garbageValue = "-2067115084"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}
}
