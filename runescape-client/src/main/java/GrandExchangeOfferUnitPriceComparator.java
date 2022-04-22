import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;B)I",
		garbageValue = "2"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1285875699"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ArchiveLoader.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5844
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) { // L: 5845
			var7 = ArchiveLoader.scene.getObjectFlags(var0, var1, var2, var5); // L: 5846
			var8 = var7 >> 6 & 3; // L: 5847
			var9 = var7 & 31; // L: 5848
			var10 = var3; // L: 5849
			boolean var12 = var5 != 0L; // L: 5852
			if (var12) { // L: 5853
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 5856
				var12 = !var13; // L: 5858
			}

			if (var12) { // L: 5862
				var10 = var4;
			}

			int[] var19 = HealthBarUpdate.sceneMinimapSprite.pixels; // L: 5863
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5864
			var14 = FileSystem.Entity_unpackID(var5); // L: 5865
			ObjectComposition var15 = class146.getObjectDefinition(var14); // L: 5866
			if (var15.mapSceneId != -1) { // L: 5867
				IndexedSprite var16 = GraphicsDefaults.mapSceneSprites[var15.mapSceneId]; // L: 5868
				if (var16 != null) { // L: 5869
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5870
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5871
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5872
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5876
					if (var8 == 0) { // L: 5877
						var19[var26] = var10; // L: 5878
						var19[var26 + 512] = var10; // L: 5879
						var19[var26 + 1024] = var10; // L: 5880
						var19[var26 + 1536] = var10; // L: 5881
					} else if (var8 == 1) { // L: 5883
						var19[var26] = var10; // L: 5884
						var19[var26 + 1] = var10; // L: 5885
						var19[var26 + 2] = var10; // L: 5886
						var19[var26 + 3] = var10; // L: 5887
					} else if (var8 == 2) { // L: 5889
						var19[var26 + 3] = var10; // L: 5890
						var19[var26 + 512 + 3] = var10; // L: 5891
						var19[var26 + 1024 + 3] = var10; // L: 5892
						var19[var26 + 1536 + 3] = var10; // L: 5893
					} else if (var8 == 3) { // L: 5895
						var19[var26 + 1536] = var10; // L: 5896
						var19[var26 + 1536 + 1] = var10; // L: 5897
						var19[var26 + 1536 + 2] = var10; // L: 5898
						var19[var26 + 1536 + 3] = var10; // L: 5899
					}
				}

				if (var9 == 3) { // L: 5902
					if (var8 == 0) { // L: 5903
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 5904
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 5905
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5906
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5908
					if (var8 == 3) { // L: 5909
						var19[var26] = var10; // L: 5910
						var19[var26 + 512] = var10; // L: 5911
						var19[var26 + 1024] = var10; // L: 5912
						var19[var26 + 1536] = var10; // L: 5913
					} else if (var8 == 0) { // L: 5915
						var19[var26] = var10; // L: 5916
						var19[var26 + 1] = var10; // L: 5917
						var19[var26 + 2] = var10; // L: 5918
						var19[var26 + 3] = var10; // L: 5919
					} else if (var8 == 1) { // L: 5921
						var19[var26 + 3] = var10; // L: 5922
						var19[var26 + 512 + 3] = var10; // L: 5923
						var19[var26 + 1024 + 3] = var10; // L: 5924
						var19[var26 + 1536 + 3] = var10; // L: 5925
					} else if (var8 == 2) { // L: 5927
						var19[var26 + 1536] = var10; // L: 5928
						var19[var26 + 1536 + 1] = var10; // L: 5929
						var19[var26 + 1536 + 2] = var10; // L: 5930
						var19[var26 + 1536 + 3] = var10; // L: 5931
					}
				}
			}
		}

		var5 = ArchiveLoader.scene.getGameObjectTag(var0, var1, var2); // L: 5936
		if (0L != var5) { // L: 5937
			var7 = ArchiveLoader.scene.getObjectFlags(var0, var1, var2, var5); // L: 5938
			var8 = var7 >> 6 & 3; // L: 5939
			var9 = var7 & 31; // L: 5940
			var10 = FileSystem.Entity_unpackID(var5); // L: 5941
			ObjectComposition var20 = class146.getObjectDefinition(var10); // L: 5942
			if (var20.mapSceneId != -1) { // L: 5943
				IndexedSprite var28 = GraphicsDefaults.mapSceneSprites[var20.mapSceneId]; // L: 5944
				if (var28 != null) { // L: 5945
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 5946
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 5947
					var28.drawAt(var1 * 4 + var26 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48); // L: 5948
				}
			} else if (var9 == 9) { // L: 5951
				int var25 = 15658734; // L: 5952
				boolean var27 = 0L != var5; // L: 5955
				if (var27) { // L: 5956
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 5959
					var27 = !var21; // L: 5961
				}

				if (var27) { // L: 5965
					var25 = 15597568;
				}

				int[] var22 = HealthBarUpdate.sceneMinimapSprite.pixels; // L: 5966
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5967
				if (var8 != 0 && var8 != 2) { // L: 5968
					var22[var29] = var25; // L: 5975
					var22[var29 + 1 + 512] = var25; // L: 5976
					var22[var29 + 1024 + 2] = var25; // L: 5977
					var22[var29 + 1536 + 3] = var25; // L: 5978
				} else {
					var22[var29 + 1536] = var25; // L: 5969
					var22[var29 + 1 + 1024] = var25; // L: 5970
					var22[var29 + 512 + 2] = var25; // L: 5971
					var22[var29 + 3] = var25; // L: 5972
				}
			}
		}

		var5 = ArchiveLoader.scene.getFloorDecorationTag(var0, var1, var2); // L: 5982
		if (var5 != 0L) { // L: 5983
			var7 = FileSystem.Entity_unpackID(var5); // L: 5984
			ObjectComposition var23 = class146.getObjectDefinition(var7); // L: 5985
			if (var23.mapSceneId != -1) { // L: 5986
				IndexedSprite var24 = GraphicsDefaults.mapSceneSprites[var23.mapSceneId]; // L: 5987
				if (var24 != null) { // L: 5988
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5989
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5990
					var24.drawAt(var10 + var1 * 4 + 48, var11 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 5991
				}
			}
		}

	} // L: 5995
}
