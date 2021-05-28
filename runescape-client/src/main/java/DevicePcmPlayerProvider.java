import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-597712139"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "228217886"
	)
	static boolean method385(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 758
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "-591767217"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 89
		if (var3) { // L: 90
			var5 |= 65536L;
		}

		return var5; // L: 91
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgt;Lfz;B)V",
		garbageValue = "85"
	)
	static final void method386(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class23.getObjectDefinition(var4); // L: 877
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 880
			var10 = var9.sizeX; // L: 885
			var11 = var9.sizeY; // L: 886
		} else {
			var10 = var9.sizeY; // L: 881
			var11 = var9.sizeX; // L: 882
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 892
			var12 = (var10 >> 1) + var2; // L: 893
			var13 = var2 + (var10 + 1 >> 1); // L: 894
		} else {
			var12 = var2; // L: 897
			var13 = var2 + 1; // L: 898
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 900
			var14 = var3 + (var11 >> 1); // L: 901
			var15 = var3 + (var11 + 1 >> 1); // L: 902
		} else {
			var14 = var3; // L: 905
			var15 = var3 + 1; // L: 906
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 908
		int var17 = var16[var13][var15] + var16[var13][var14] + var16[var12][var14] + var16[var12][var15] >> 2; // L: 909
		int var18 = (var2 << 7) + (var10 << 6); // L: 910
		int var19 = (var3 << 7) + (var11 << 6); // L: 911
		long var20 = calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 912
		int var22 = (var5 << 6) + var6; // L: 913
		if (var9.int3 == 1) { // L: 914
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 915
			if (var9.animationId == -1 && var9.transforms == null) { // L: 917
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 918
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 919
			if (var9.interactType == 1) { // L: 920
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 923
			if (var6 >= 12) { // L: 931
				if (var9.animationId == -1 && var9.transforms == null) { // L: 933
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 934
				}

				var7.method4007(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 935
				if (var9.interactType != 0) { // L: 936
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 939
				if (var9.animationId == -1 && var9.transforms == null) { // L: 941
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 942
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1117[var5], 0, var20, var22); // L: 943
				if (var9.interactType != 0) { // L: 944
					var8.method3164(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 947
				if (var9.animationId == -1 && var9.transforms == null) { // L: 949
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 950
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1125[var5], 0, var20, var22); // L: 951
				if (var9.interactType != 0) { // L: 952
					var8.method3164(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 955
					var23 = var5 + 1 & 3; // L: 956
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 959
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 960
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 961
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 964
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 965
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1117[var5], Tiles.field1117[var23], var20, var22); // L: 967
					if (var9.interactType != 0) { // L: 968
						var8.method3164(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 971
					if (var9.animationId == -1 && var9.transforms == null) { // L: 973
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 974
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1125[var5], 0, var20, var22); // L: 975
					if (var9.interactType != 0) { // L: 976
						var8.method3164(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 979
					if (var9.animationId == -1 && var9.transforms == null) { // L: 981
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 982
					}

					var7.method4007(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 983
					if (var9.interactType != 0) { // L: 984
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 987
					if (var9.animationId == -1 && var9.transforms == null) { // L: 989
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 990
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1117[var5], 0, 0, 0, var20, var22); // L: 991
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 994
						var23 = 16; // L: 995
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 996
						if (var24 != 0L) { // L: 997
							var23 = class23.getObjectDefinition(class93.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 999
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 1000
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1117[var5], 0, var23 * Tiles.field1126[var5], var23 * Tiles.field1123[var5], var20, var22); // L: 1001
					} else if (var6 == 6) { // L: 1004
						var23 = 8; // L: 1005
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1006
						if (0L != var24) { // L: 1007
							var23 = class23.getObjectDefinition(class93.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1009
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 1010
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1128[var5], var23 * Tiles.field1129[var5], var20, var22); // L: 1011
					} else if (var6 == 7) { // L: 1014
						int var29 = var5 + 2 & 3; // L: 1016
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1017
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 1018
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1019
					} else if (var6 == 8) { // L: 1022
						var23 = 8; // L: 1023
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1024
						if (var24 != 0L) { // L: 1025
							var23 = class23.getObjectDefinition(class93.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1028
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1029
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1030
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1031
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 1034
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 1035
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1128[var5], var23 * Tiles.field1129[var5], var20, var22); // L: 1037
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 925
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.field1801, (Renderable)null); // L: 926
			}

			if (var30 != null) { // L: 927
				var7.method4007(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) { // L: 928
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	} // L: 921 929 937 945 953 969 977 985 992 1002 1012 1020 1038 1040

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-12"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7201

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7202 7203 7208
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7204
				var9 = var10; // L: 7205
				break;
			}
		}

		if (var9 == null) { // L: 7210
			var9 = new PendingSpawn(); // L: 7211
			var9.plane = var0; // L: 7212
			var9.type = var3; // L: 7213
			var9.x = var1; // L: 7214
			var9.y = var2; // L: 7215
			UserComparator5.method2448(var9); // L: 7216
			Client.pendingSpawns.addFirst(var9); // L: 7217
		}

		var9.id = var4; // L: 7219
		var9.field1232 = var5; // L: 7220
		var9.orientation = var6; // L: 7221
		var9.delay = var7; // L: 7222
		var9.hitpoints = var8; // L: 7223
	} // L: 7224
}
