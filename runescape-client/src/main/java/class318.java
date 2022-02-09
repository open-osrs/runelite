import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
public class class318 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final class318 field3974;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final class318 field3973;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final class318 field3975;

	static {
		field3974 = new class318(); // L: 4
		field3973 = new class318(); // L: 5
		field3975 = new class318(); // L: 6
	}

	class318() {
	} // L: 8

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1727065508"
	)
	public static String method5786(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 42
		int var4 = 0; // L: 43
		int var5 = var1; // L: 44

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 45 46 77
			int var7 = var0[var5++] & 255; // L: 47
			if (var7 < 128) { // L: 49
				if (var7 == 0) { // L: 50
					var8 = 65533;
				} else {
					var8 = var7; // L: 51
				}
			} else if (var7 < 192) { // L: 53
				var8 = 65533;
			} else if (var7 < 224) { // L: 54
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 55
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 56
					if (var8 < 128) { // L: 57
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 59
				}
			} else if (var7 < 240) { // L: 61
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 62
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 63
					if (var8 < 2048) { // L: 64
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 66
				}
			} else if (var7 < 248) { // L: 68
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 69
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 70
					if (var8 >= 65536 && var8 <= 1114111) { // L: 71
						var8 = 65533; // L: 72
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 74
				}
			} else {
				var8 = 65533; // L: 76
			}
		}

		return new String(var3, 0, var4); // L: 79
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Lfn;IIZI)V",
		garbageValue = "829437847"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10520
		byte var6 = -1; // L: 10521
		String var7 = null; // L: 10522
		if (var5 != null && var5[var3] != null) { // L: 10523
			if (var3 == 0) { // L: 10524
				var6 = 33;
			} else if (var3 == 1) { // L: 10525
				var6 = 34;
			} else if (var3 == 2) { // L: 10526
				var6 = 35;
			} else if (var3 == 3) { // L: 10527
				var6 = 36;
			} else {
				var6 = 37; // L: 10528
			}

			var7 = var5[var3]; // L: 10529
		} else if (var3 == 4) { // L: 10532
			var6 = 37; // L: 10533
			var7 = "Drop"; // L: 10534
		}

		if (var6 != -1 && var7 != null) { // L: 10537
			ArchiveLoader.insertMenuItem(var7, LoginScreenAnimation.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10538
		}

	} // L: 10540
}
