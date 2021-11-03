import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class111 implements class110 {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-721238808"
	)
	public static final synchronized long method2516() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class397.field4289) { // L: 15
			class397.field4288 += class397.field4289 - var0; // L: 16
		}

		class397.field4289 = var0; // L: 18
		return var0 + class397.field4288; // L: 19
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1420142897"
	)
	public static boolean method2514(int var0) {
		return (var0 >> 31 & 1) != 0; // L: 37
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-600085887"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = GameBuild.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5896
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5897
			var7 = GameBuild.scene.getObjectFlags(var0, var1, var2, var5); // L: 5898
			var8 = var7 >> 6 & 3; // L: 5899
			var9 = var7 & 31; // L: 5900
			var10 = var3; // L: 5901
			if (ItemLayer.method4106(var5)) { // L: 5902
				var10 = var4;
			}

			int[] var11 = class10.sceneMinimapSprite.pixels; // L: 5903
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5904
			var13 = class21.Entity_unpackID(var5); // L: 5905
			ObjectComposition var14 = KitDefinition.getObjectDefinition(var13); // L: 5906
			if (var14.mapSceneId != -1) { // L: 5907
				IndexedSprite var15 = TriBool.mapSceneSprites[var14.mapSceneId]; // L: 5908
				if (var15 != null) { // L: 5909
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5910
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5911
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5912
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5916
					if (var8 == 0) { // L: 5917
						var11[var12] = var10; // L: 5918
						var11[var12 + 512] = var10; // L: 5919
						var11[var12 + 1024] = var10; // L: 5920
						var11[var12 + 1536] = var10; // L: 5921
					} else if (var8 == 1) { // L: 5923
						var11[var12] = var10; // L: 5924
						var11[var12 + 1] = var10; // L: 5925
						var11[var12 + 2] = var10; // L: 5926
						var11[var12 + 3] = var10; // L: 5927
					} else if (var8 == 2) { // L: 5929
						var11[var12 + 3] = var10; // L: 5930
						var11[var12 + 512 + 3] = var10; // L: 5931
						var11[var12 + 1024 + 3] = var10; // L: 5932
						var11[var12 + 1536 + 3] = var10; // L: 5933
					} else if (var8 == 3) { // L: 5935
						var11[var12 + 1536] = var10; // L: 5936
						var11[var12 + 1536 + 1] = var10; // L: 5937
						var11[var12 + 1536 + 2] = var10; // L: 5938
						var11[var12 + 1536 + 3] = var10; // L: 5939
					}
				}

				if (var9 == 3) { // L: 5942
					if (var8 == 0) { // L: 5943
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5944
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5945
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5946
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5948
					if (var8 == 3) { // L: 5949
						var11[var12] = var10; // L: 5950
						var11[var12 + 512] = var10; // L: 5951
						var11[var12 + 1024] = var10; // L: 5952
						var11[var12 + 1536] = var10; // L: 5953
					} else if (var8 == 0) { // L: 5955
						var11[var12] = var10; // L: 5956
						var11[var12 + 1] = var10; // L: 5957
						var11[var12 + 2] = var10; // L: 5958
						var11[var12 + 3] = var10; // L: 5959
					} else if (var8 == 1) { // L: 5961
						var11[var12 + 3] = var10; // L: 5962
						var11[var12 + 512 + 3] = var10; // L: 5963
						var11[var12 + 1024 + 3] = var10; // L: 5964
						var11[var12 + 1536 + 3] = var10; // L: 5965
					} else if (var8 == 2) { // L: 5967
						var11[var12 + 1536] = var10; // L: 5968
						var11[var12 + 1536 + 1] = var10; // L: 5969
						var11[var12 + 1536 + 2] = var10; // L: 5970
						var11[var12 + 1536 + 3] = var10; // L: 5971
					}
				}
			}
		}

		var5 = GameBuild.scene.getGameObjectTag(var0, var1, var2); // L: 5976
		if (var5 != 0L) { // L: 5977
			var7 = GameBuild.scene.getObjectFlags(var0, var1, var2, var5); // L: 5978
			var8 = var7 >> 6 & 3; // L: 5979
			var9 = var7 & 31; // L: 5980
			var10 = class21.Entity_unpackID(var5); // L: 5981
			ObjectComposition var24 = KitDefinition.getObjectDefinition(var10); // L: 5982
			int var19;
			if (var24.mapSceneId != -1) { // L: 5983
				IndexedSprite var20 = TriBool.mapSceneSprites[var24.mapSceneId]; // L: 5984
				if (var20 != null) { // L: 5985
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5986
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5987
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 5988
				}
			} else if (var9 == 9) { // L: 5991
				var12 = 15658734; // L: 5992
				if (ItemLayer.method4106(var5)) { // L: 5993
					var12 = 15597568;
				}

				int[] var18 = class10.sceneMinimapSprite.pixels; // L: 5994
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5995
				if (var8 != 0 && var8 != 2) { // L: 5996
					var18[var19] = var12; // L: 6003
					var18[var19 + 1 + 512] = var12; // L: 6004
					var18[var19 + 1024 + 2] = var12; // L: 6005
					var18[var19 + 1536 + 3] = var12; // L: 6006
				} else {
					var18[var19 + 1536] = var12; // L: 5997
					var18[var19 + 1 + 1024] = var12; // L: 5998
					var18[var19 + 512 + 2] = var12; // L: 5999
					var18[var19 + 3] = var12; // L: 6000
				}
			}
		}

		var5 = GameBuild.scene.getFloorDecorationTag(var0, var1, var2); // L: 6010
		if (var5 != 0L) { // L: 6011
			var7 = class21.Entity_unpackID(var5); // L: 6012
			ObjectComposition var21 = KitDefinition.getObjectDefinition(var7); // L: 6013
			if (var21.mapSceneId != -1) { // L: 6014
				IndexedSprite var22 = TriBool.mapSceneSprites[var21.mapSceneId]; // L: 6015
				if (var22 != null) { // L: 6016
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6017
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6018
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6019
				}
			}
		}

	} // L: 6023
}
