import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class400 {
	@ObfuscatedName("l")
	static final int[] field4390;
	@ObfuscatedName("n")
	static final int[] field4389;

	static {
		field4390 = new int[16384]; // L: 8
		field4389 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4390[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4389[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I[B[BI)V",
		garbageValue = "-785240877"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3422 == null) { // L: 988
			if (var2 == null) { // L: 989
				return; // L: 995
			}

			var0.field3422 = new byte[11][]; // L: 990
			var0.field3423 = new byte[11][]; // L: 991
			var0.field3424 = new int[11]; // L: 992
			var0.field3425 = new int[11]; // L: 993
		}

		var0.field3422[var1] = var2; // L: 997
		if (var2 != null) {
			var0.field3432 = true; // L: 998
		} else {
			var0.field3432 = false; // L: 1000

			for (int var4 = 0; var4 < var0.field3422.length; ++var4) { // L: 1001
				if (var0.field3422[var4] != null) { // L: 1002
					var0.field3432 = true; // L: 1003
					break;
				}
			}
		}

		var0.field3423[var1] = var3; // L: 1008
	} // L: 1009
}
