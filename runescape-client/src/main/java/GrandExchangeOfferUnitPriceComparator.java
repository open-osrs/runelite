import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;B)I",
		garbageValue = "88"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-602449729"
	)
	static final int method5846(int var0, int var1) {
		int var2 = InterfaceParent.method2070(45365 + var0, 91923 + var1, 4) - 128 + (InterfaceParent.method2070(10294 + var0, var1 + 37821, 2) - 128 >> 1) + (InterfaceParent.method2070(var0, var1, 1) - 128 >> 2); // L: 918
		var2 = (int)(0.3D * (double)var2) + 35; // L: 919
		if (var2 < 10) { // L: 920
			var2 = 10;
		} else if (var2 > 60) { // L: 921
			var2 = 60;
		}

		return var2; // L: 922
	}
}
