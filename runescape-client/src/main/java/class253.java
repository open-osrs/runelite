import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class253 {
	@ObfuscatedName("p")
	static byte[][][] field3130;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lio;I[B[BI)V",
		garbageValue = "-26460885"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3033 == null) { // L: 964
			if (var2 == null) { // L: 965
				return; // L: 971
			}

			var0.field3033 = new byte[11][]; // L: 966
			var0.field3034 = new byte[11][]; // L: 967
			var0.field3035 = new int[11]; // L: 968
			var0.field3079 = new int[11]; // L: 969
		}

		var0.field3033[var1] = var2; // L: 973
		if (var2 != null) {
			var0.field3032 = true; // L: 974
		} else {
			var0.field3032 = false; // L: 976

			for (int var4 = 0; var4 < var0.field3033.length; ++var4) { // L: 977
				if (var0.field3033[var4] != null) { // L: 978
					var0.field3032 = true; // L: 979
					break;
				}
			}
		}

		var0.field3034[var1] = var3; // L: 984
	} // L: 985
}
