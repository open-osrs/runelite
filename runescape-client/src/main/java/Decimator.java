import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 420963985
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1138629961
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("o")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = class34.method402(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = 6.0D + (double)var4 / (double)var1; // L: 23
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = ((double)var8 - var6) * 3.141592653589793D; // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(0.5D + 65536.0D * var14); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1846224274"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 66
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1; // L: 67
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-946737566"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1393447426"
	)
	public static void method1160() {
		class69.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Les;",
		garbageValue = "112"
	)
	public static HitSplatDefinition method1171(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "452122319"
	)
	public static void method1169() {
		class233.midiPcmStream.clear(); // L: 44
		class233.musicPlayerStatus = 1; // L: 45
		InvDefinition.musicTrackArchive = null; // L: 46
	} // L: 47

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1181477544"
	)
	public static void method1168() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 94
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 95
	} // L: 96

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgp;Lfl;B)V",
		garbageValue = "-20"
	)
	static final void method1167(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = Tiles.getObjectDefinition(var4); // L: 874
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 877
			var10 = var9.sizeX; // L: 882
			var11 = var9.sizeY; // L: 883
		} else {
			var10 = var9.sizeY; // L: 878
			var11 = var9.sizeX; // L: 879
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 889
			var12 = (var10 >> 1) + var2; // L: 890
			var13 = var2 + (var10 + 1 >> 1); // L: 891
		} else {
			var12 = var2; // L: 894
			var13 = var2 + 1; // L: 895
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 897
			var14 = var3 + (var11 >> 1); // L: 898
			var15 = var3 + (var11 + 1 >> 1); // L: 899
		} else {
			var14 = var3; // L: 902
			var15 = var3 + 1; // L: 903
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 905
		int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2; // L: 906
		int var18 = (var2 << 7) + (var10 << 6); // L: 907
		int var19 = (var3 << 7) + (var11 << 6); // L: 908
		long var20 = UserComparator3.calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 909
		int var22 = (var5 << 6) + var6; // L: 910
		if (var9.int3 == 1) { // L: 911
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 912
			if (var9.animationId == -1 && var9.transforms == null) { // L: 914
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 915
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 916
			if (var9.interactType == 1) { // L: 917
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 920
			if (var6 >= 12) { // L: 928
				if (var9.animationId == -1 && var9.transforms == null) { // L: 930
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 931
				}

				var7.method4046(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 932
				if (var9.interactType != 0) { // L: 933
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 936
				if (var9.animationId == -1 && var9.transforms == null) { // L: 938
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 939
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1102[var5], 0, var20, var22); // L: 940
				if (var9.interactType != 0) { // L: 941
					var8.method3216(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 944
				if (var9.animationId == -1 && var9.transforms == null) { // L: 946
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 947
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1107[var5], 0, var20, var22); // L: 948
				if (var9.interactType != 0) { // L: 949
					var8.method3216(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 952
					var23 = var5 + 1 & 3; // L: 953
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 956
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 957
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 958
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 961
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 962
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1102[var5], Tiles.field1102[var23], var20, var22); // L: 964
					if (var9.interactType != 0) { // L: 965
						var8.method3216(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 968
					if (var9.animationId == -1 && var9.transforms == null) { // L: 970
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 971
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1107[var5], 0, var20, var22); // L: 972
					if (var9.interactType != 0) { // L: 973
						var8.method3216(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 976
					if (var9.animationId == -1 && var9.transforms == null) { // L: 978
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 979
					}

					var7.method4046(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 980
					if (var9.interactType != 0) { // L: 981
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 984
					if (var9.animationId == -1 && var9.transforms == null) { // L: 986
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 987
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1102[var5], 0, 0, 0, var20, var22); // L: 988
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 991
						var23 = 16; // L: 992
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 993
						if (0L != var24) { // L: 994
							var23 = Tiles.getObjectDefinition(Message.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 996
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 997
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1102[var5], 0, var23 * Tiles.field1100[var5], var23 * Tiles.field1105[var5], var20, var22); // L: 998
					} else if (var6 == 6) { // L: 1001
						var23 = 8; // L: 1002
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1003
						if (0L != var24) { // L: 1004
							var23 = Tiles.getObjectDefinition(Message.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1006
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 1007
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1106[var5], var23 * Tiles.field1097[var5], var20, var22); // L: 1008
					} else if (var6 == 7) { // L: 1011
						int var29 = var5 + 2 & 3; // L: 1013
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1014
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 1015
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1016
					} else if (var6 == 8) { // L: 1019
						var23 = 8; // L: 1020
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1021
						if (0L != var24) { // L: 1022
							var23 = Tiles.getObjectDefinition(Message.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1025
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1026
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1027
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1028
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 1031
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 1032
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1106[var5], var23 * Tiles.field1097[var5], var20, var22); // L: 1034
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 922
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.field1784, (Renderable)null); // L: 923
			}

			if (var30 != null) { // L: 924
				var7.method4046(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1); // L: 925
			}

		}
	} // L: 918 926 934 942 950 966 974 982 989 999 1009 1017 1035 1037

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1188638191"
	)
	static int method1162(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1184
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1185
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.itemId; // L: 1186
			return 1; // L: 1187
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1189
			if (var3.itemId != -1) { // L: 1190
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1191
			}

			return 1; // L: 1192
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1194
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1195
			return 1; // L: 1196
		} else {
			return 2; // L: 1198
		}
	}
}
