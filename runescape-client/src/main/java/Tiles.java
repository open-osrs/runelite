import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("c")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("l")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1925711117
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("e")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("r")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("o")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("i")
	static byte[][][] field998;
	@ObfuscatedName("d")
	static final int[] field999;
	@ObfuscatedName("j")
	static final int[] field1000;
	@ObfuscatedName("f")
	static final int[] field1001;
	@ObfuscatedName("g")
	static final int[] field1002;
	@ObfuscatedName("t")
	static final int[] field1003;
	@ObfuscatedName("k")
	static final int[] field1005;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -942884641
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -186340013
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99;
		field999 = new int[]{1, 2, 4, 8}; // L: 34
		field1000 = new int[]{16, 32, 64, 128}; // L: 35
		field1001 = new int[]{1, 0, -1, 0}; // L: 36
		field1002 = new int[]{0, -1, 0, 1}; // L: 37
		field1003 = new int[]{1, -1, -1, 1}; // L: 38
		field1005 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-424882232"
	)
	public static byte[] method2039(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? class255.method4983(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "719361783"
	)
	static int method2052(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 842
		Widget var4;
		if (var0 >= 2000) { // L: 844
			var0 -= 1000; // L: 845
			var4 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 846
			var3 = false; // L: 847
		} else {
			var4 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 849
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 850
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 851
			if (var11 >= 0 && var11 <= 9) { // L: 852
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]); // L: 856
				return 1; // L: 857
			} else {
				--BufferedNetSocket.Interpreter_stringStackSize; // L: 853
				return 1; // L: 854
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 859
				Interpreter.Interpreter_intStackSize -= 2; // L: 860
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 861
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 862
				var4.parent = ModeWhere.getWidgetChild(var11, var6); // L: 863
				return 1; // L: 864
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 866
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 867
				return 1; // L: 868
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 870
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 871
				return 1; // L: 872
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 874
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 875
				return 1; // L: 876
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 878
				var4.dataText = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 882
				var4.spellActionName = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 886
				var4.actions = null; // L: 887
				return 1; // L: 888
			} else if (var0 == 1308) { // L: 890
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 891
				return 1; // L: 892
			} else if (var0 == 1309) { // L: 894
				--Interpreter.Interpreter_intStackSize; // L: 895
				return 1; // L: 896
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 898
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 928
						Interpreter.Interpreter_intStackSize -= 2; // L: 929
						var5 = 10; // L: 930
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 931
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 932
						class265.Widget_setKey(var4, var5, var8, var9); // L: 933
						return 1; // L: 934
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 936
						Interpreter.Interpreter_intStackSize -= 3; // L: 937
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 938
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 939
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 940
						if (var11 >= 0 && var11 <= 9) { // L: 941
							class11.Widget_setKeyRate(var4, var11, var6, var7); // L: 944
							return 1; // L: 945
						} else {
							throw new RuntimeException(); // L: 942
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 947
						var5 = 10; // L: 948
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 949
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 950
						class11.Widget_setKeyRate(var4, var5, var6, var7); // L: 951
						return 1; // L: 952
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 954
						--Interpreter.Interpreter_intStackSize; // L: 955
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							DynamicObject.Widget_setKeyIgnoreHeld(var4, var11); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 963
						var5 = 10; // L: 964
						DynamicObject.Widget_setKeyIgnoreHeld(var4, var5); // L: 965
						return 1; // L: 966
					} else {
						return 2; // L: 968
					}
				} else {
					byte[] var10 = null; // L: 899
					var8 = null; // L: 900
					if (var3) { // L: 901
						Interpreter.Interpreter_intStackSize -= 10; // L: 902

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 904 905
						}

						if (var7 > 0) { // L: 907
							var10 = new byte[var7 / 2]; // L: 908
							var8 = new byte[var7 / 2]; // L: 909

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 910
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 911
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 912
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 917
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 918
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 919
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 921
					if (var7 >= 0 && var7 <= 9) { // L: 922
						class265.Widget_setKey(var4, var7, var10, var8); // L: 925
						return 1; // L: 926
					} else {
						throw new RuntimeException(); // L: 923
					}
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgn;[Lgi;)V"
	)
	static final void method2031(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 284
		int var11 = -1; // L: 285

		while (true) {
			int var12 = var10.method7383(); // L: 287
			if (var12 == 0) { // L: 288
				return; // L: 343
			}

			var11 += var12; // L: 289
			int var13 = 0; // L: 290

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 292
				if (var14 == 0) { // L: 293
					break;
				}

				var13 += var14 - 1; // L: 294
				int var15 = var13 & 63; // L: 295
				int var16 = var13 >> 6 & 63; // L: 296
				int var17 = var13 >> 12; // L: 297
				int var18 = var10.readUnsignedByte(); // L: 298
				int var19 = var18 >> 2; // L: 299
				int var20 = var18 & 3; // L: 300
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 301
					ObjectComposition var21 = ParamComposition.getObjectDefinition(var11); // L: 302
					int var24 = var16 & 7; // L: 305
					int var25 = var15 & 7; // L: 306
					int var27 = var21.sizeX; // L: 308
					int var28 = var21.sizeY; // L: 309
					int var29;
					if ((var20 & 1) == 1) { // L: 311
						var29 = var27; // L: 312
						var27 = var28; // L: 313
						var28 = var29; // L: 314
					}

					int var26 = var7 & 3; // L: 316
					int var23;
					if (var26 == 0) { // L: 317
						var23 = var24; // L: 318
					} else if (var26 == 1) { // L: 321
						var23 = var25; // L: 322
					} else if (var26 == 2) { // L: 325
						var23 = 7 - var24 - (var27 - 1); // L: 326
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 329
					}

					var29 = var2 + var23; // L: 331
					int var30 = var3 + class261.method5002(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 332
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) { // L: 333
						int var31 = var1; // L: 334
						if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) { // L: 335
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 336
						if (var31 >= 0) { // L: 337
							var32 = var9[var31];
						}

						class231.method4765(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 338
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1679127844"
	)
	static void method2027(boolean var0) {
		byte var1 = 0; // L: 1197
		if (!Skeleton.method3892()) { // L: 1198
			var1 = 12; // L: 1199
		} else if (class414.client.method1305() || class414.client.method1219()) { // L: 1201
			var1 = 10; // L: 1202
		}

		Player.method2159(var1); // L: 1204
		if (var0) { // L: 1205
			Login.Login_username = ""; // L: 1206
			Login.Login_password = ""; // L: 1207
			GameObject.field2588 = 0; // L: 1208
			class145.otp = ""; // L: 1209
		}

		DynamicObject.method1998(); // L: 1211
		WorldMapLabelSize.method4317(); // L: 1212
	} // L: 1213

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1645011802"
	)
	static void method2054(int var0, int var1) {
		MenuAction var2 = GrandExchangeEvents.tempMenuAction; // L: 11430
		class18.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1); // L: 11432
		GrandExchangeEvents.tempMenuAction = null; // L: 11434
	} // L: 11435
}
