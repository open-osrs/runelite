import java.util.Comparator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive4;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 401783773
	)
	static int selectedItemSlot;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;I)I",
		garbageValue = "1888921269"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lmu;B)I",
		garbageValue = "1"
	)
	public static final int method211(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4063) { // L: 19
			case 7:
				return 20; // L: 23
			default:
				return 12; // L: 21
			}
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)Z",
		garbageValue = "798311981"
	)
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 10732
	}
}
