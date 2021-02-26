import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class277 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "1470841417"
	)
	public static int method5192(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}
}
