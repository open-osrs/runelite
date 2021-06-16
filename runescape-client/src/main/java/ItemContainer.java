import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("e")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("v")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "0"
	)
	public static boolean method2181(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 61
			return true;
		} else {
			if (var0 != 0) { // L: 62
				char[] var1 = class302.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-1214579938"
	)
	public static int method2183(CharSequence var0, int var1) {
		return class8.method105(var0, var1, true); // L: 80
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "2"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5461
		int var4 = var1 >> 7; // L: 5462
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5463
			int var5 = var2; // L: 5464
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5465
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5466
			int var7 = var1 & 127; // L: 5467
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5468
			int var9 = Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5469
			return var8 * (128 - var7) + var7 * var9 >> 7; // L: 5470
		} else {
			return 0;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Liv;I)Ljava/lang/String;",
		garbageValue = "2065897018"
	)
	static String method2184(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9883
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9884
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9886
					if (var3 == -1) { // L: 9887
						break;
					}

					String var4 = var0.substring(0, var3); // L: 9888
					int var6 = class27.method355(var1, var2 - 1); // L: 9890
					String var5;
					if (var6 < 999999999) { // L: 9892
						var5 = Integer.toString(var6); // L: 9893
					} else {
						var5 = "*"; // L: 9896
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 9898
				}
			}
		}

		return var0; // L: 9902
	}
}
