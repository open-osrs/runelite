import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class39 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class39 field278;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class39 field277;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 980177793
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1993101161
	)
	@Export("value")
	final int value;

	static {
		field278 = new class39(0); // L: 4
		field277 = new class39(1); // L: 5
	}

	class39(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2030729234"
	)
	public static String method591(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 21
		int var4 = 0; // L: 22
		int var5 = var1; // L: 23

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 24 25 56
			int var7 = var0[var5++] & 255; // L: 26
			if (var7 < 128) { // L: 28
				if (var7 == 0) { // L: 29
					var8 = 65533;
				} else {
					var8 = var7; // L: 30
				}
			} else if (var7 < 192) { // L: 32
				var8 = 65533;
			} else if (var7 < 224) { // L: 33
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 34
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 35
					if (var8 < 128) { // L: 36
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 38
				}
			} else if (var7 < 240) { // L: 40
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 41
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 42
					if (var8 < 2048) { // L: 43
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 45
				}
			} else if (var7 < 248) { // L: 47
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 48
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 49
					if (var8 >= 65536 && var8 <= 1114111) { // L: 50
						var8 = 65533; // L: 51
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 53
				}
			} else {
				var8 = 65533; // L: 55
			}
		}

		return new String(var3, 0, var4); // L: 58
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-257596336"
	)
	static final void method594(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 64
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 65
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 66
					Tiles.field511[0][var5][var4] = 127; // L: 67
					if (var0 == var5 && var5 > 0) { // L: 68
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 69
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 75

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1443206500"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 151
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1859709852"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 72 73
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20631"
	)
	static final void method596() {
		Scene.Scene_isLowDetail = false; // L: 849
		Client.isLowDetail = false; // L: 850
	} // L: 851

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1974117172"
	)
	static void method593(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1714

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1715
			int var4 = var3 * 32 + 15 + 128; // L: 1716
			int var5 = WorldMapManager.method704(var4); // L: 1717
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1718
			var5 = NetSocket.method3587(var5, var1); // L: 1719
			var2[var3] = var6 * var5 >> 16; // L: 1720
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1722
	} // L: 1723
}
