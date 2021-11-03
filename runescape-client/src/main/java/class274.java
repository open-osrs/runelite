import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public final class class274 {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1659224646"
	)
	public static char method5199(byte var0) {
		int var1 = var0 & 255; // L: 63
		if (var1 == 0) { // L: 64
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 65
				char var2 = class316.cp1252AsciiExtension[var1 - 128]; // L: 66
				if (var2 == 0) { // L: 67
					var2 = '?';
				}

				var1 = var2; // L: 68
			}

			return (char)var1; // L: 70
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "2095914687"
	)
	static void method5198(Buffer var0, int var1) {
		MilliClock.method2954(var0.array, var1); // L: 11985
		if (JagexCache.JagexCache_randomDat != null) { // L: 11987
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11989
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11990
			} catch (Exception var3) { // L: 11992
			}
		}

	} // L: 11995
}
