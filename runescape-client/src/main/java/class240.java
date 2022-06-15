import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class240 {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1497426191
	)
	static int field2846;

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1536934514"
	)
	static final int method5005() {
		return Client.menuOptionsCount - 1; // L: 9718
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lkb;III)V",
		garbageValue = "1978456423"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10704
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10705
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10706
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10707
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10708
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10709
		}

		if (var0.yAlignment == 0) { // L: 10710
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10711
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10712
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10713
		} else if (var0.yAlignment == 4) { // L: 10714
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10715
		}

	} // L: 10716
}
