import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)I",
		garbageValue = "-1618602527"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldk;",
		garbageValue = "1223848574"
	)
	static class119[] method5977() {
		return new class119[]{class119.field1449, class119.field1439, class119.field1440, class119.field1441, class119.field1442, class119.field1446, class119.field1444, class119.field1443, class119.field1455, class119.field1447, class119.field1448, class119.field1451, class119.field1450, class119.field1445, class119.field1457, class119.field1452, class119.field1454}; // L: 73
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1983287311"
	)
	@Export("incrementMenuEntries")
	static final void incrementMenuEntries() {
		boolean var0 = false; // L: 9793

		while (!var0) { // L: 9794
			var0 = true; // L: 9795

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9796
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9797
					String var2 = Client.menuTargets[var1]; // L: 9798
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9799
					Client.menuTargets[var1 + 1] = var2; // L: 9800
					String var3 = Client.menuActions[var1]; // L: 9801
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9802
					Client.menuActions[var1 + 1] = var3; // L: 9803
					int var4 = Client.menuOpcodes[var1]; // L: 9804
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9805
					Client.menuOpcodes[var1 + 1] = var4; // L: 9806
					var4 = Client.menuArguments1[var1]; // L: 9807
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9808
					Client.menuArguments1[var1 + 1] = var4; // L: 9809
					var4 = Client.menuArguments2[var1]; // L: 9810
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9811
					Client.menuArguments2[var1 + 1] = var4; // L: 9812
					var4 = Client.menuIdentifiers[var1]; // L: 9813
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9814
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9815
					boolean var5 = Client.menuShiftClick[var1]; // L: 9816
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9817
					Client.menuShiftClick[var1 + 1] = var5; // L: 9818
					var0 = false; // L: 9819
				}
			}
		}

	} // L: 9823
}
