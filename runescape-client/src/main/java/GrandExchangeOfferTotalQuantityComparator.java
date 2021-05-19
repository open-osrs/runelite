import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;B)I",
		garbageValue = "-64"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lcj;II)V",
		garbageValue = "1442681811"
	)
	static final void method4972(Actor var0, int var1) {
		PcmPlayer.worldToScreen(var0.x, var0.y, var1); // L: 5414
	} // L: 5415

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Liv;B)Ljava/lang/String;",
		garbageValue = "12"
	)
	static String method4979(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9998
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9999
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10001
					if (var3 == -1) { // L: 10002
						break;
					}

					var0 = var0.substring(0, var3) + GrandExchangeOfferOwnWorldComparator.method1214(class161.method3150(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10003
				}
			}
		}

		return var0; // L: 10007
	}
}
