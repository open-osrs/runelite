import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class289 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(BS)C",
		garbageValue = "3465"
	)
	public static char method5560(byte var0) {
		int var1 = var0 & 255; // L: 66
		if (var1 == 0) { // L: 67
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 68
				char var2 = class340.cp1252AsciiExtension[var1 - 128]; // L: 69
				if (var2 == 0) { // L: 70
					var2 = '?';
				}

				var1 = var2; // L: 71
			}

			return (char)var1; // L: 73
		}
	}
}
