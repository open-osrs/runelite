import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("rx")
	static boolean field997;
	@ObfuscatedName("o")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("q")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 7708309
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("k")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("a")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("m")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("w")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("e")
	static final int[] field988;
	@ObfuscatedName("h")
	static final int[] field989;
	@ObfuscatedName("f")
	static final int[] field990;
	@ObfuscatedName("d")
	static final int[] field991;
	@ObfuscatedName("j")
	static final int[] field995;
	@ObfuscatedName("z")
	static final int[] field993;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1755098149
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -243886671
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -1283558205
	)
	@Export("worldPort")
	static int worldPort;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field988 = new int[]{1, 2, 4, 8}; // L: 34
		field989 = new int[]{16, 32, 64, 128}; // L: 35
		field990 = new int[]{1, 0, -1, 0}; // L: 36
		field991 = new int[]{0, -1, 0, 1}; // L: 37
		field995 = new int[]{1, -1, -1, 1}; // L: 38
		field993 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1322064070"
	)
	public static void method1996(Applet var0, String var1) {
		class29.field170 = var0; // L: 22
		if (var1 != null) { // L: 23
			class29.field168 = var1;
		}

	} // L: 24

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	static final void method2017() {
		InterfaceParent.method2067("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 130
	} // L: 131

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgm;[Lgh;)V"
	)
	static final void method2033(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 283
		int var11 = -1; // L: 284

		while (true) {
			int var12 = var10.method7531(); // L: 286
			if (var12 == 0) { // L: 287
				return; // L: 342
			}

			var11 += var12; // L: 288
			int var13 = 0; // L: 289

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 291
				if (var14 == 0) { // L: 292
					break;
				}

				var13 += var14 - 1; // L: 293
				int var15 = var13 & 63; // L: 294
				int var16 = var13 >> 6 & 63; // L: 295
				int var17 = var13 >> 12; // L: 296
				int var18 = var10.readUnsignedByte(); // L: 297
				int var19 = var18 >> 2; // L: 298
				int var20 = var18 & 3; // L: 299
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 300
					ObjectComposition var21 = class82.getObjectDefinition(var11); // L: 301
					int var24 = var16 & 7; // L: 304
					int var25 = var15 & 7; // L: 305
					int var27 = var21.sizeX; // L: 307
					int var28 = var21.sizeY; // L: 308
					int var29;
					if ((var20 & 1) == 1) { // L: 310
						var29 = var27; // L: 311
						var27 = var28; // L: 312
						var28 = var29; // L: 313
					}

					int var26 = var7 & 3; // L: 315
					int var23;
					if (var26 == 0) { // L: 316
						var23 = var24; // L: 317
					} else if (var26 == 1) { // L: 320
						var23 = var25; // L: 321
					} else if (var26 == 2) { // L: 324
						var23 = 7 - var24 - (var27 - 1); // L: 325
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 328
					}

					var29 = var2 + var23; // L: 330
					int var30 = var3 + class117.method2717(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 331
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) { // L: 332
						int var31 = var1; // L: 333
						if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) { // L: 334
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 335
						if (var31 >= 0) { // L: 336
							var32 = var9[var31];
						}

						class19.addObjects(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 337
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "16711680"
	)
	static int method2030(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2892
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2893
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2894
			return 1; // L: 2895
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2897
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2898
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2899
			return 1; // L: 2900
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2902
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2903
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2904
			return 1; // L: 2905
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2907
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2908
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2909
			return 1; // L: 2910
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2912
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2913
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2914
			return 1; // L: 2915
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2917
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2918
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2919
			return 1; // L: 2920
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2922
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2923
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2924
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2925
				return 1; // L: 2926
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2928
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2929
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2930
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2931
				return 1; // L: 2932
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2934
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2935
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2936
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2937
				return 1; // L: 2938
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2940
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2941
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2942
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2943
				return 1; // L: 2944
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2946
					var12 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 2947
					if (class120.grandExchangeEvents != null) { // L: 2948
						class120.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2949
					}

					return 1; // L: 2951
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2953
					var12 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 2954
					if (class120.grandExchangeEvents != null) { // L: 2955
						class120.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2956
					}

					return 1; // L: 2958
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2960
					class12.Interpreter_intStackSize -= 2; // L: 2961
					var12 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] == 1; // L: 2962
					boolean var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1; // L: 2963
					if (class120.grandExchangeEvents != null) { // L: 2964
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2965
						class120.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2970
					var12 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 2971
					if (class120.grandExchangeEvents != null) { // L: 2972
						class120.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2973
					}

					return 1; // L: 2975
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2977
					var12 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 2978
					if (class120.grandExchangeEvents != null) { // L: 2979
						class120.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2980
					}

					return 1; // L: 2982
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2984
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class120.grandExchangeEvents == null ? 0 : class120.grandExchangeEvents.events.size(); // L: 2985
					return 1; // L: 2986
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2988
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2989
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 2990
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.world; // L: 2991
						return 1; // L: 2992
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2994
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2995
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 2996
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2997
						return 1; // L: 2998
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3000
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3001
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 3002
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3003
						return 1; // L: 3004
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3006
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3007
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 3008
						long var5 = class113.method2624() - UserComparator8.field1380 - var4.age; // L: 3009
						int var7 = (int)(var5 / 3600000L); // L: 3010
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3011
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3012
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3013
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var10; // L: 3014
						return 1; // L: 3015
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3017
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3018
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 3019
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3020
						return 1; // L: 3021
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3023
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3024
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 3025
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3026
						return 1; // L: 3027
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3029
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3030
						var4 = (GrandExchangeEvent)class120.grandExchangeEvents.events.get(var3); // L: 3031
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3032
						return 1; // L: 3033
					} else {
						return 2; // L: 3035
					}
				}
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	static final void method2031() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7873 7874 7917
			if (var0.hitpoints > 0) { // L: 7875
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 7876
				if (var0.objectId >= 0) { // L: 7878
					var2 = var0.objectId; // L: 7880
					var3 = var0.field1129; // L: 7881
					var4 = class82.getObjectDefinition(var2); // L: 7883
					if (var3 == 11) { // L: 7884
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 7885
						var3 = 4;
					}

					var1 = var4.method3589(var3); // L: 7886
					if (!var1) { // L: 7888
						continue;
					}
				}

				WorldMapData_1.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1131, var0.field1129); // L: 7890
				var0.remove(); // L: 7891
			} else {
				if (var0.delay > 0) { // L: 7895
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 7896
					if (var0.id >= 0) { // L: 7898
						var2 = var0.id; // L: 7900
						var3 = var0.field1126; // L: 7901
						var4 = class82.getObjectDefinition(var2); // L: 7903
						if (var3 == 11) { // L: 7904
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 7905
							var3 = 4;
						}

						var1 = var4.method3589(var3); // L: 7906
						if (!var1) { // L: 7908
							continue;
						}
					}

					WorldMapData_1.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1126); // L: 7910
					var0.delay = -1; // L: 7911
					if (var0.objectId == var0.id && var0.objectId == -1) { // L: 7912
						var0.remove();
					} else if (var0.objectId == var0.id && var0.orientation == var0.field1131 && var0.field1126 == var0.field1129) { // L: 7913
						var0.remove();
					}
				}
			}
		}

	} // L: 7919
}
