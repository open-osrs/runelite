import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class60 {
	@ObfuscatedName("h")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("v")
	public static String field439;

	static {
		applet = null; // L: 10
		field439 = ""; // L: 11
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "24"
	)
	static int method942(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}
}
