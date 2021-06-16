import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1630(1, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	field1632(0, 2);

	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1337520325
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1920193363
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "537873753"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 84

		for (int var6 = 0; var6 < var5; ++var6) { // L: 85
			char var7 = var0.charAt(var6 + var1); // L: 86
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 87
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 88
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 89
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 90
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 91
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 92
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 93
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 94
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 95
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 96
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 97
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 98
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 99
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 100
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 101
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 102
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 103
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 104
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 105
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 106
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 107
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 108
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 109
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 110
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 111
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 112
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 113
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 114
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 115
			}
		}

		return var5; // L: 117
	}
}
