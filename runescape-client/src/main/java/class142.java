import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class142 extends class128 {
	@ObfuscatedName("j")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1198516523
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1343108627
	)
	int field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1664 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1664 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method3019(this.field1664); // L: 222
	} // L: 223

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgg;Lgv;I)V",
		garbageValue = "-1981768066"
	)
	static final void method3050(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class162.getObjectDefinition(var4); // L: 956
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 959
			var10 = var9.sizeX; // L: 964
			var11 = var9.sizeY; // L: 965
		} else {
			var10 = var9.sizeY; // L: 960
			var11 = var9.sizeX; // L: 961
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 971
			var12 = (var10 >> 1) + var2; // L: 972
			var13 = var2 + (var10 + 1 >> 1); // L: 973
		} else {
			var12 = var2; // L: 976
			var13 = var2 + 1; // L: 977
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 979
			var14 = var3 + (var11 >> 1); // L: 980
			var15 = var3 + (var11 + 1 >> 1); // L: 981
		} else {
			var14 = var3; // L: 984
			var15 = var3 + 1; // L: 985
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 987
		int var17 = var16[var12][var15] + var16[var13][var14] + var16[var12][var14] + var16[var13][var15] >> 2; // L: 988
		int var18 = (var2 << 7) + (var10 << 6); // L: 989
		int var19 = (var3 << 7) + (var11 << 6); // L: 990
		long var20 = TaskHandler.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 991
		int var22 = (var5 << 6) + var6; // L: 992
		if (var9.int3 == 1) { // L: 993
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 994
			if (var9.animationId == -1 && var9.transforms == null) { // L: 996
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 997
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 998
			if (var9.interactType == 1) { // L: 999
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1002
			if (var6 >= 12) { // L: 1010
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1012
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1013
				}

				var7.method4188(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1014
				if (var9.interactType != 0) { // L: 1015
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1018
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1020
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1021
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1007[var5], 0, var20, var22); // L: 1022
				if (var9.interactType != 0) { // L: 1023
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1026
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1028
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1029
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1011[var5], 0, var20, var22); // L: 1030
				if (var9.interactType != 0) { // L: 1031
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1034
					var23 = var5 + 1 & 3; // L: 1035
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1038
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1039
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1040
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1043
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1044
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1007[var5], Tiles.field1007[var23], var20, var22); // L: 1046
					if (var9.interactType != 0) { // L: 1047
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1050
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1052
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1053
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1011[var5], 0, var20, var22); // L: 1054
					if (var9.interactType != 0) { // L: 1055
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1058
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1060
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1061
					}

					var7.method4188(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1062
					if (var9.interactType != 0) { // L: 1063
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1066
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1068
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1069
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1007[var5], 0, 0, 0, var20, var22); // L: 1070
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1073
						var23 = 16; // L: 1074
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1075
						if (0L != var24) { // L: 1076
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1078
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1079
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1007[var5], 0, var23 * Tiles.field1003[var5], var23 * Tiles.field1005[var5], var20, var22); // L: 1080
					} else if (var6 == 6) { // L: 1083
						var23 = 8; // L: 1084
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1085
						if (var24 != 0L) { // L: 1086
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1088
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1089
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1006[var5], var23 * Tiles.field1002[var5], var20, var22); // L: 1090
					} else if (var6 == 7) { // L: 1093
						int var29 = var5 + 2 & 3; // L: 1095
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1096
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1097
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1098
					} else if (var6 == 8) { // L: 1101
						var23 = 8; // L: 1102
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1103
						if (var24 != 0L) { // L: 1104
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1107
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1108
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1109
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1110
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1113
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1114
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1006[var5], var23 * Tiles.field1002[var5], var20, var22); // L: 1116
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1004
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1005
			}

			if (var30 != null) { // L: 1006
				var7.method4188(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) { // L: 1007
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	} // L: 1000 1008 1016 1024 1032 1048 1056 1064 1071 1081 1091 1099 1117 1119
}
