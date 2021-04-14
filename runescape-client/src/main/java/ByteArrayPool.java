import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1309322053
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 535020743
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1601199927
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("e")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		ByteArrayPool_smallCount = 0; // L: 4
		ByteArrayPool_mediumCount = 0; // L: 5
		ByteArrayPool_largeCount = 0; // L: 6
		ByteArrayPool_small = new byte[1000][]; // L: 7
		ByteArrayPool_medium = new byte[250][]; // L: 8
		ByteArrayPool_large = new byte[50][]; // L: 9
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljy;",
		garbageValue = "-2079671317"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < GrandExchangeOfferNameComparator.WorldMapElement_cached.length && GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] != null ? GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "147973145"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 35
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 36
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 37
			return var4; // L: 38
		}

		if (var0 != 5000) { // L: 40
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 41
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 42
			return var4; // L: 43
		}

		if (var0 != 30000) { // L: 45
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 46
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 47
			return var4; // L: 48
		}

		if (ScriptFrame.ByteArrayPool_arrays != null) { // L: 50
			for (int var2 = 0; var2 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 51
				if (UserComparator3.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 52
					if (var0 < UserComparator3.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class221.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ScriptFrame.ByteArrayPool_arrays[var2][--class221.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 53
					ScriptFrame.ByteArrayPool_arrays[var2][class221.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 54
					return var3; // L: 55
				}
			}
		}

		return new byte[var0]; // L: 68
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1064656053"
	)
	static final void method5575(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9885
		int var7 = var3 - var1; // L: 9886
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9887
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9888
		int var10 = var8; // L: 9889
		if (var8 < var9) { // L: 9890
			var10 = var9;
		}

		if (var10 != 0) { // L: 9891
			int var11 = (var6 << 16) / var10; // L: 9892
			int var12 = (var7 << 16) / var10; // L: 9893
			if (var12 <= var11) { // L: 9894
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9895
			}

			int var13 = var5 * var12 >> 17; // L: 9896
			int var14 = var5 * var12 + 1 >> 17; // L: 9897
			int var15 = var5 * var11 >> 17; // L: 9898
			int var16 = var5 * var11 + 1 >> 17; // L: 9899
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9900
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9901
			int var17 = var0 + var13; // L: 9902
			int var18 = var0 - var14; // L: 9903
			int var19 = var0 + var6 - var14; // L: 9904
			int var20 = var0 + var6 + var13; // L: 9905
			int var21 = var15 + var1; // L: 9906
			int var22 = var1 - var16; // L: 9907
			int var23 = var7 + var1 - var16; // L: 9908
			int var24 = var15 + var7 + var1; // L: 9909
			Rasterizer3D.method3389(var17, var18, var19); // L: 9910
			Rasterizer3D.method3370(var21, var22, var23, var17, var18, var19, var4); // L: 9911
			Rasterizer3D.method3389(var17, var19, var20); // L: 9912
			Rasterizer3D.method3370(var21, var23, var24, var17, var19, var20, var4); // L: 9913
		}
	} // L: 9914
}
