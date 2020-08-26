import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2042157485
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Ldr;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			Decimator.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "-649379031"
	)
	public static FloorOverlayDefinition method2594(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class1.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition(); // L: 29
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-2072659501"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 122

		for (int var6 = 0; var6 < var5; ++var6) { // L: 123
			char var7 = var0.charAt(var6 + var1); // L: 124
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 125
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 126
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 127
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 128
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 129
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 130
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 131
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 132
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 133
			} else if (var7 == 8240) { // L: 134
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 135
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 136
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 137
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 138
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 139
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 140
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 141
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 142
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 143
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 144
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 145
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 146
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 147
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 148
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 149
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 150
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 151
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 152
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 153
			}
		}

		return var5; // L: 155
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1863289029"
	)
	static final boolean method2592(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 176
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 177
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 178
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 179
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 180
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 181
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 182
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 183
				}
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	@Export("shouldPrioritizeDrop")
	static boolean shouldPrioritizeDrop() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 9639
	}
}
