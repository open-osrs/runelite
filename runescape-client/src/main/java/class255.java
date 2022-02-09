import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class255 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2941;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2942;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2943;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2949;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2945;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2948;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2946;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2944;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2947;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class255 field2950;

	static {
		field2941 = new class255(5); // L: 5
		field2942 = new class255(7); // L: 6
		field2943 = new class255(3); // L: 7
		field2949 = new class255(6); // L: 8
		field2945 = new class255(4); // L: 9
		field2948 = new class255(15); // L: 10
		field2946 = new class255(4); // L: 11
		field2944 = new class255(2); // L: 12
		field2947 = new class255(14); // L: 13
		field2950 = new class255(5); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class255(int var1) {
	} // L: 20

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "-13275"
	)
	public static byte[] method4983(byte[] var0) {
		int var1 = var0.length; // L: 22
		byte[] var2 = new byte[var1]; // L: 23
		System.arraycopy(var0, 0, var2, 0, var1); // L: 24
		return var2; // L: 25
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1627064681"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 83

		for (int var6 = 0; var6 < var5; ++var6) { // L: 84
			char var7 = var0.charAt(var6 + var1); // L: 85
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 86
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 87
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 88
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 89
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 90
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 91
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 92
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 93
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 94
			} else if (var7 == 8240) { // L: 95
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 96
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 97
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 98
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 99
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 100
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 101
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 102
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 103
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 104
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 105
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 106
			} else if (var7 == 732) { // L: 107
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 108
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 109
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 110
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 111
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 112
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 113
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 114
			}
		}

		return var5; // L: 116
	}
}
