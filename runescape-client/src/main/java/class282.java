import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class282 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field3261;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;I)I",
		garbageValue = "-825643804"
	)
	public static int method5489(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		int var4 = var1.length(); // L: 17
		byte[] var5 = new byte[var4]; // L: 18

		for (int var6 = 0; var6 < var4; ++var6) { // L: 19
			char var7 = var1.charAt(var6); // L: 20
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 21
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 22
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 23
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 24
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 25
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 26
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 27
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 28
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 29
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 30
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 31
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 32
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 33
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 34
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 35
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 36
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 37
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 38
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 39
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 40
			} else if (var7 == 8212) { // L: 41
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 42
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 43
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 44
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 45
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 46
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 47
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 48
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 49
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 54
		var0.offset += huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 55
		return var0.offset - var2; // L: 56
	}
}
