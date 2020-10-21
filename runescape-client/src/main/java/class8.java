import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class8 implements Callable {
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("at")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	final Buffer field35;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class12 field31;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;Lkb;Ln;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1; // L: 47
		this.field35 = var2; // L: 48
		this.field31 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field31.vmethod145(this.field35); // L: 53
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lih;",
		garbageValue = "1246224952"
	)
	static class238[] method116() {
		return new class238[]{class238.field3116, class238.field3113}; // L: 35
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "1560484309"
	)
	static long method117(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-2023789845"
	)
	public static byte[] method113(CharSequence var0) {
		int var1 = var0.length(); // L: 68
		byte[] var2 = new byte[var1]; // L: 69

		for (int var3 = 0; var3 < var1; ++var3) { // L: 70
			char var4 = var0.charAt(var3); // L: 71
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 72
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 73
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 74
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 75
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 76
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 77
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 78
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 79
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 80
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 81
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 82
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 83
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 84
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 85
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 86
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 87
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 88
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 89
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 90
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 91
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 92
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 93
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 94
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 95
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 96
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 97
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 98
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 99
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 100
			}
		}

		return var2; // L: 102
	}
}
