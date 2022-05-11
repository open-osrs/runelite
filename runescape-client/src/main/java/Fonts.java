import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("l")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Lpi;I)Ljava/util/HashMap;",
		garbageValue = "1588025566"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				Font var6 = GrandExchangeOfferWorldComparator.method5808(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgm;Lgh;I)V",
		garbageValue = "1253814318"
	)
	static final void method7226(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class82.getObjectDefinition(var4); // L: 999
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 1002
			var10 = var9.sizeX; // L: 1007
			var11 = var9.sizeY; // L: 1008
		} else {
			var10 = var9.sizeY; // L: 1003
			var11 = var9.sizeX; // L: 1004
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 1014
			var12 = (var10 >> 1) + var2; // L: 1015
			var13 = var2 + (var10 + 1 >> 1); // L: 1016
		} else {
			var12 = var2; // L: 1019
			var13 = var2 + 1; // L: 1020
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 1022
			var14 = var3 + (var11 >> 1); // L: 1023
			var15 = var3 + (var11 + 1 >> 1); // L: 1024
		} else {
			var14 = var3; // L: 1027
			var15 = var3 + 1; // L: 1028
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 1030
		int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2; // L: 1031
		int var18 = (var2 << 7) + (var10 << 6); // L: 1032
		int var19 = (var3 << 7) + (var11 << 6); // L: 1033
		long var20 = VarbitComposition.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 1034
		int var22 = (var5 << 6) + var6; // L: 1035
		if (var9.int3 == 1) { // L: 1036
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 1037
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1039
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1040
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 1041
			if (var9.interactType == 1) { // L: 1042
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1045
			if (var6 >= 12) { // L: 1053
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1055
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1056
				}

				var7.method4176(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1057
				if (var9.interactType != 0) { // L: 1058
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1061
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1063
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1064
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field988[var5], 0, var20, var22); // L: 1065
				if (var9.interactType != 0) { // L: 1066
					var8.method3749(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1069
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1071
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1072
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field989[var5], 0, var20, var22); // L: 1073
				if (var9.interactType != 0) { // L: 1074
					var8.method3749(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1077
					var23 = var5 + 1 & 3; // L: 1078
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1081
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1082
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1083
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1086
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1087
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field988[var5], Tiles.field988[var23], var20, var22); // L: 1089
					if (var9.interactType != 0) { // L: 1090
						var8.method3749(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1093
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1095
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1096
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field989[var5], 0, var20, var22); // L: 1097
					if (var9.interactType != 0) { // L: 1098
						var8.method3749(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1101
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1103
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1104
					}

					var7.method4176(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1105
					if (var9.interactType != 0) { // L: 1106
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1109
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1111
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1112
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field988[var5], 0, 0, 0, var20, var22); // L: 1113
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1116
						var23 = 16; // L: 1117
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1118
						if (var24 != 0L) { // L: 1119
							var23 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1121
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1122
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field988[var5], 0, var23 * Tiles.field990[var5], var23 * Tiles.field991[var5], var20, var22); // L: 1123
					} else if (var6 == 6) { // L: 1126
						var23 = 8; // L: 1127
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1128
						if (0L != var24) { // L: 1129
							var23 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1131
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1132
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field995[var5], var23 * Tiles.field993[var5], var20, var22); // L: 1133
					} else if (var6 == 7) { // L: 1136
						int var29 = var5 + 2 & 3; // L: 1138
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1139
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1140
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1141
					} else if (var6 == 8) { // L: 1144
						var23 = 8; // L: 1145
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1146
						if (0L != var24) { // L: 1147
							var23 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1150
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1151
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1152
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1153
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1156
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1157
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field995[var5], var23 * Tiles.field993[var5], var20, var22); // L: 1159
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1047
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1048
			}

			if (var30 != null) { // L: 1049
				var7.method4176(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1); // L: 1050
			}

		}
	} // L: 1043 1051 1059 1067 1075 1091 1099 1107 1114 1124 1134 1142 1160 1162
}
