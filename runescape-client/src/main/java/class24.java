import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class24 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -568813485
	)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "24"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10451
	} // L: 10452
}
