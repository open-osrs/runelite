import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("h")
	@Export("args")
	Object[] args;
	@ObfuscatedName("v")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -830334431
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1350109123
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2005687405
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1876756799
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1098200111
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("z")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 179691203
	)
	int field569;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1839098173
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1890318343"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2116141310"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "-119"
	)
	static boolean method1260(String var0, int var1) {
		return class13.method131(var0, var1, "openjs"); // L: 50
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILeo;Lfo;B)V",
		garbageValue = "-82"
	)
	static final void method1259(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectDefinition var9 = WorldMapDecoration.getObjectDefinition(var4); // L: 899
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 902
			var10 = var9.sizeX; // L: 907
			var11 = var9.sizeY; // L: 908
		} else {
			var10 = var9.sizeY; // L: 903
			var11 = var9.sizeX; // L: 904
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 914
			var12 = (var10 >> 1) + var2; // L: 915
			var13 = var2 + (var10 + 1 >> 1); // L: 916
		} else {
			var12 = var2; // L: 919
			var13 = var2 + 1; // L: 920
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 922
			var14 = var3 + (var11 >> 1); // L: 923
			var15 = var3 + (var11 + 1 >> 1); // L: 924
		} else {
			var14 = var3; // L: 927
			var15 = var3 + 1; // L: 928
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 930
		int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2; // L: 931
		int var18 = (var2 << 7) + (var10 << 6); // L: 932
		int var19 = (var3 << 7) + (var11 << 6); // L: 933
		long var20 = NPC.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 934
		int var22 = (var5 << 6) + var6; // L: 935
		if (var9.int3 == 1) { // L: 936
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 937
			if (var9.animationId == -1 && var9.transforms == null) { // L: 939
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 940
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Entity)var30, var20, var22); // L: 941
			if (var9.interactType == 1) { // L: 942
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 945
			if (var6 >= 12) { // L: 953
				if (var9.animationId == -1 && var9.transforms == null) { // L: 955
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 956
				}

				var7.method3160(var0, var2, var3, var17, 1, 1, (Entity)var30, 0, var20, var22); // L: 957
				if (var9.interactType != 0) { // L: 958
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 961
				if (var9.animationId == -1 && var9.transforms == null) { // L: 963
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 964
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field512[var5], 0, var20, var22); // L: 965
				if (var9.interactType != 0) { // L: 966
					var8.method3611(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 969
				if (var9.animationId == -1 && var9.transforms == null) { // L: 971
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 972
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field513[var5], 0, var20, var22); // L: 973
				if (var9.interactType != 0) { // L: 974
					var8.method3611(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 977
					var23 = var5 + 1 & 3; // L: 978
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 981
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 982
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 983
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 986
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 987
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var31, (Entity)var25, Tiles.field512[var5], Tiles.field512[var23], var20, var22); // L: 989
					if (var9.interactType != 0) { // L: 990
						var8.method3611(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 993
					if (var9.animationId == -1 && var9.transforms == null) { // L: 995
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 996
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field513[var5], 0, var20, var22); // L: 997
					if (var9.interactType != 0) { // L: 998
						var8.method3611(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1001
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1003
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1004
					}

					var7.method3160(var0, var2, var3, var17, 1, 1, (Entity)var30, 0, var20, var22); // L: 1005
					if (var9.interactType != 0) { // L: 1006
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1009
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1011
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1012
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Entity)var30, (Entity)null, Tiles.field512[var5], 0, 0, 0, var20, var22); // L: 1013
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1016
						var23 = 16; // L: 1017
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1018
						if (var24 != 0L) { // L: 1019
							var23 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1021
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1022
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)null, Tiles.field512[var5], 0, var23 * Tiles.field518[var5], var23 * Tiles.field515[var5], var20, var22); // L: 1023
					} else if (var6 == 6) { // L: 1026
						var23 = 8; // L: 1027
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1028
						if (var24 != 0L) { // L: 1029
							var23 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1031
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1032
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)null, 256, var5, var23 * Tiles.field509[var5], var23 * Tiles.field517[var5], var20, var22); // L: 1033
					} else if (var6 == 7) { // L: 1036
						int var29 = var5 + 2 & 3; // L: 1038
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1039
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1040
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var30, (Entity)null, 256, var29, 0, 0, var20, var22); // L: 1041
					} else if (var6 == 8) { // L: 1044
						var23 = 8; // L: 1045
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1046
						if (var24 != 0L) { // L: 1047
							var23 = WorldMapDecoration.getObjectDefinition(Occluder.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1050
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1051
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1052
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1053
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1056
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 1057
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Entity)var26, (Entity)var27, 256, var5, var23 * Tiles.field509[var5], var23 * Tiles.field517[var5], var20, var22); // L: 1059
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 947
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.field3429, (Entity)null); // L: 948
			}

			if (var30 != null) { // L: 949
				var7.method3160(var0, var2, var3, var17, var10, var11, (Entity)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) { // L: 950
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	} // L: 943 951 959 967 975 991 999 1007 1014 1024 1034 1042 1060 1062
}
