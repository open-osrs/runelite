import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -38617703
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1161789305
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1924631327
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "37"
	)
	public static int method4142(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 109
		return (var0 + var2) / var1 - var2; // L: 110
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2015271850"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 6079
		int var4 = var1 >> 7; // L: 6080
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 6081
			int var5 = var2; // L: 6082
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 6083
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 6084
			int var7 = var1 & 127; // L: 6085
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 6086
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 6087
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 6088
		} else {
			return 0;
		}
	}
}
