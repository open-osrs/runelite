import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public abstract class class165 {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 602051603
	)
	static int field1809;
	@ObfuscatedName("f")
	String field1805;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/String;)V"
	)
	class165(class155 var1, String var2) {
		this.this$0 = var1; // L: 349
		this.field1805 = var2; // L: 350
	} // L: 351

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	public abstract int vmethod3314();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public String vmethod3320() {
		return null; // L: 360
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16777215"
	)
	public int vmethod3318() {
		return -1; // L: 364
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1817569519"
	)
	public String method3315() {
		return this.field1805; // L: 354
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-944677500"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 77

		for (int var6 = 0; var6 < var5; ++var6) { // L: 78
			char var7 = var0.charAt(var6 + var1); // L: 79
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 80
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 81
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 82
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 83
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 84
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 85
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 86
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 87
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 88
			} else if (var7 == 8240) { // L: 89
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 90
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 91
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 92
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 93
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 94
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 95
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 96
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 97
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 98
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106; // L: 99
			} else if (var7 == 8212) { // L: 100
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 101
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 102
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 103
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 104
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 105
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 106
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 107
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 108
			}
		}

		return var5; // L: 110
	}
}
