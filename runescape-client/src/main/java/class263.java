import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ji")
public class class263 {
	@ObfuscatedName("c")
	static int[] field3091;
	@ObfuscatedName("ar")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		new Object();
		field3091 = new int[33]; // L: 8
		field3091[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3091[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17
}
