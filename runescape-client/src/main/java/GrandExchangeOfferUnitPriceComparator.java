import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		longValue = 3905628072379123313L
	)
	static long field3758;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	static LoginType loginType;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;B)I",
		garbageValue = "-67"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	static void method5485() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79
}
