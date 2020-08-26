import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class227 {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 775643589
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-636086719"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) {
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
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) {
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

	@ObfuscatedName("z")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V",
		garbageValue = "-330609994"
	)
	public static void method4185(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "-1245700740"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 80
		if (var3) { // L: 81
			var5 |= 65536L;
		}

		return var5; // L: 82
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ler;IIII)Z",
		garbageValue = "-319500223"
	)
	static final boolean method4186(Model var0, int var1, int var2, int var3) {
		if (!class200.method3760()) { // L: 143
			return false;
		} else {
			PlatformInfo.method6411(); // L: 144
			int var4 = var0.xMid + var1; // L: 145
			int var5 = var2 + var0.yMid; // L: 146
			int var6 = var3 + var0.zMid; // L: 147
			int var7 = var0.xMidOffset; // L: 148
			int var8 = var0.yMidOffset; // L: 149
			int var9 = var0.zMidOffset; // L: 150
			int var10 = ViewportMouse.field1768 - var4; // L: 151
			int var11 = class217.field2537 - var5; // L: 152
			int var12 = ViewportMouse.field1769 - var6; // L: 153
			if (Math.abs(var10) > var7 + class3.field25) { // L: 154
				return false; // L: 155
			} else if (Math.abs(var11) > var8 + class234.field3100) { // L: 157
				return false; // L: 158
			} else if (Math.abs(var12) > var9 + ViewportMouse.field1771) { // L: 160
				return false; // L: 161
			} else if (Math.abs(var12 * WorldMapSectionType.field178 - var11 * ViewportMouse.field1770) > var9 * class234.field3100 + var8 * ViewportMouse.field1771) { // L: 163
				return false; // L: 164
			} else if (Math.abs(var10 * ViewportMouse.field1770 - var12 * SpriteMask.field2552) > var7 * ViewportMouse.field1771 + var9 * class3.field25) { // L: 166
				return false; // L: 167
			} else {
				return Math.abs(var11 * SpriteMask.field2552 - var10 * WorldMapSectionType.field178) <= var8 * class3.field25 + var7 * class234.field3100; // L: 169
			}
		}
	}
}
