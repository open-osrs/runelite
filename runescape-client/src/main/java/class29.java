import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class29 {
	@ObfuscatedName("o")
	static Applet field170;
	@ObfuscatedName("q")
	static String field168;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1437756653
	)
	static int field172;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	static {
		field170 = null; // L: 10
		field168 = ""; // L: 11
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69
}
