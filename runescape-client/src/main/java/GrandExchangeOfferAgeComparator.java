import java.awt.FontMetrics;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("l")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ac")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lx;Lx;I)I",
		garbageValue = "1835867422"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(III)Lgz;",
		garbageValue = "-1799061438"
	)
	static RouteStrategy method214(int var0, int var1) {
		Client.field935.approxDestinationX = var0; // L: 7806
		Client.field935.approxDestinationY = var1; // L: 7807
		Client.field935.approxDestinationSizeX = 1; // L: 7808
		Client.field935.approxDestinationSizeY = 1; // L: 7809
		return Client.field935; // L: 7810
	}
}
