import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -502169227
	)
	static int field2216;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -195950963
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1964137909
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILiy;Liy;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILfw;Lfk;Z[I[II)I",
		garbageValue = "-1833738708"
	)
	public static int method3948(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class174.directions[var8][var9] = 0;
				class174.distances[var8][var9] = 99999999;
			}
		}

		boolean var27;
		if (var2 == 1) {
			var27 = GraphicsObject.method1869(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var27 = class150.method2806(var0, var1, var3, var4);
		} else {
			var27 = class111.method2467(var0, var1, var2, var3, var4);
		}

		var9 = var0 - 64;
		int var10 = var1 - 64;
		int var11 = class150.field1601;
		int var12 = class174.field1991;
		int var13;
		int var14;
		int var16;
		if (!var27) {
			var13 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var15 = 10;
			var16 = var3.approxDestinationX;
			int var17 = var3.approxDestinationY;
			int var18 = var3.approxDestinationSizeX;
			int var19 = var3.approxDestinationSizeY;

			for (int var20 = var16 - var15; var20 <= var16 + var15; ++var20) {
				for (int var21 = var17 - var15; var21 <= var15 + var17; ++var21) {
					int var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class174.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var16) {
							var24 = var16 - var20;
						} else if (var20 > var16 + var18 - 1) {
							var24 = var20 - (var18 + var16 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) {
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var13 || var26 == var13 && class174.distances[var22][var23] < var14) {
							var13 = var26;
							var14 = class174.distances[var22][var23];
							var11 = var20;
							var12 = var21;
						}
					}
				}
			}

			if (var13 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var12 == var1) {
			return 0;
		} else {
			byte var28 = 0;
			class174.bufferX[var28] = var11;
			var13 = var28 + 1;
			class174.bufferY[var28] = var12;

			int var29;
			for (var14 = var29 = class174.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class174.directions[var11 - var9][var12 - var10]) {
				if (var29 != var14) {
					var29 = var14;
					class174.bufferX[var13] = var11;
					class174.bufferY[var13++] = var12;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var12;
				} else if ((var14 & 4) != 0) {
					--var12;
				}
			}

			var16 = 0;

			while (var13-- > 0) {
				var6[var16] = class174.bufferX[var13];
				var7[var16++] = class174.bufferY[var13];
				if (var16 >= var6.length) {
					break;
				}
			}

			return var16;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-10"
	)
	public static boolean method3947(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-769879638"
	)
	public static int method3949(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
