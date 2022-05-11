import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class194 {
	@ObfuscatedName("l")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("k")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1497652731
	)
	public static int field2255;
	@ObfuscatedName("s")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("r")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive3")
	static Archive archive3;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[Lja;",
		garbageValue = "-67"
	)
	public static class263[] method3807() {
		return new class263[]{class263.field3071, class263.field3058, class263.field3060, class263.field3062, class263.field3068, class263.field3063, class263.field3059, class263.field3064, class263.field3066, class263.field3067}; // L: 17
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1426013528"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			char var7 = var0.charAt(var6 + var1); // L: 47
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 48
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 49
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 50
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 51
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 52
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 53
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 54
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 55
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 56
			} else if (var7 == 8240) { // L: 57
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 58
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 59
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 60
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 61
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 62
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 63
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 64
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 65
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 66
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 67
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 68
			} else if (var7 == 732) { // L: 69
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 70
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 71
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 72
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 73
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 74
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 75
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 76
			}
		}

		return var5; // L: 78
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	static final void method3804() {
		Client.field690 = Client.cycleCntr; // L: 12429
		Decimator.ClanChat_inClanChat = true; // L: 12430
	} // L: 12431
}
