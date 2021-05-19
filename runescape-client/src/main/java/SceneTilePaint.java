import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 106917001
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1198653441
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 62824417
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -790767125
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1418532851
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("z")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -940535567
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lci;",
		garbageValue = "-313203913"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 45
		Script var5;
		if (var6 != null) { // L: 46
			var5 = var6; // L: 47
		} else {
			String var7 = String.valueOf(var3); // L: 50
			int var8 = class22.archive12.getGroupId(var7); // L: 51
			if (var8 == -1) { // L: 52
				var5 = null; // L: 53
			} else {
				label58: {
					byte[] var9 = class22.archive12.takeFileFlat(var8); // L: 56
					if (var9 != null) { // L: 57
						if (var9.length <= 1) { // L: 58
							var5 = null; // L: 59
							break label58; // L: 60
						}

						var6 = class25.newScript(var9); // L: 62
						if (var6 != null) { // L: 63
							Script.Script_cached.put(var6, (long)(var3 << 16)); // L: 64
							var5 = var6; // L: 65
							break label58; // L: 66
						}
					}

					var5 = null; // L: 69
				}
			}
		}

		if (var5 != null) { // L: 72
			return var5; // L: 73
		} else {
			int var4 = WorldMapSection2.method3202(var2, var0); // L: 75
			Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16)); // L: 78
			Script var13;
			if (var12 != null) { // L: 79
				var13 = var12; // L: 80
			} else {
				String var14 = String.valueOf(var4); // L: 83
				int var10 = class22.archive12.getGroupId(var14); // L: 84
				if (var10 == -1) { // L: 85
					var13 = null; // L: 86
				} else {
					byte[] var11 = class22.archive12.takeFileFlat(var10); // L: 89
					if (var11 != null) { // L: 90
						if (var11.length <= 1) { // L: 91
							var13 = null; // L: 92
							return var13 != null ? var13 : null; // L: 105 108
						}

						var12 = class25.newScript(var11); // L: 95
						if (var12 != null) { // L: 96
							Script.Script_cached.put(var12, (long)(var4 << 16)); // L: 97
							var13 = var12; // L: 98
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 102
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-82147640"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5448
		int var4 = var1 >> 7; // L: 5449
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5450
			int var5 = var2; // L: 5451
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5452
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5453
			int var7 = var1 & 127; // L: 5454
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5455
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5456
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5457
		} else {
			return 0;
		}
	}
}
