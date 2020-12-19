import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("h")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("v")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("x")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("musicTrackArchive")
	static AbstractArchive musicTrackArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-1388919463"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-106"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4285
			byte var2 = 4; // L: 4286
			int var3 = var2 + 6; // L: 4287
			int var4 = var2 + 6; // L: 4288
			int var5 = WorldMapLabelSize.fontPlain12.lineWidth(var0, 250); // L: 4289
			int var6 = WorldMapLabelSize.fontPlain12.lineCount(var0, 250) * 13; // L: 4290
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0); // L: 4291
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215); // L: 4292
			WorldMapLabelSize.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4293
			Frames.method3352(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2); // L: 4294
			if (var1) { // L: 4295
				WorldMapIcon_0.rasterProvider.drawFull(0, 0); // L: 4296
			} else {
				Strings.method4157(var3, var4, var5, var6); // L: 4299
			}

		}
	} // L: 4301
}
