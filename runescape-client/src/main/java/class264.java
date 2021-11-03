import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class264 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 111
		int var4 = 0; // L: 112

		for (int var5 = 0; var5 < var2; ++var5) { // L: 113
			int var6 = var0[var5 + var1] & 255; // L: 114
			if (var6 != 0) { // L: 115
				if (var6 >= 128 && var6 < 160) { // L: 116
					char var7 = class316.cp1252AsciiExtension[var6 - 128]; // L: 117
					if (var7 == 0) { // L: 118
						var7 = '?';
					}

					var6 = var7; // L: 119
				}

				var3[var4++] = (char)var6; // L: 121
			}
		}

		return new String(var3, 0, var4); // L: 123
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lop;J)V"
	)
	static void method5144(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67
}
